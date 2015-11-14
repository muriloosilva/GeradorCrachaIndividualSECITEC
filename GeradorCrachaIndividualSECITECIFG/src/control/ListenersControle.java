package control;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import modelo.ModeloCracha;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import visao.CIVisao;

public class ListenersControle {
    //Variaveis
    //--Visao
    private CIVisao cIV = null;
    
    //--Point
    private Point point = null;
    
    //--JasperRoport
    private JasperPrint jpPrint = null;
    private JasperViewer jV = null;
    
    //--Map
    private HashMap<String, Object> parameters = null;
    
    List al = new ArrayList();
    Vector<ModeloCracha> v = new Vector();
    
    //Metodos
    //--Construtor
    public ListenersControle(final CIVisao cIV) {
        this.cIV = cIV;
        point = new Point();
        parameters = new HashMap();
 
        //Listener Botao Sair
        cIV.getbSair().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        //--Mover Frame
        cIV.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                point.x = e.getX();
                point.y = e.getY();
            }
        });
        cIV.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Point p = cIV.getLocation();
                cIV.setLocation(p.x + e.getX() - point.x, p.y + e.getY() - point.y);
            }
        });
        
        //--Botao Imprimir
        cIV.getbImprimir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(verificaCampos(cIV)) {
                    String nome = cIV.gettfNome().getText().toUpperCase();
                    String cpf = cIV.gettfCPF().getText();
                    String url = cIV.gettfURL().getText();
                    String urlC = url + nome + ".png";
                    
                    geraQR(nome, cpf, url);
                    
                    ModeloCracha mC = new ModeloCracha(nomeSimplif(nome), cpf, urlC);
                    
                    al.add(mC);                 
                    
                    try {
                        JasperPrint print = JasperFillManager.fillReport("CrachaIndividualSecitec.jasper", null, new JRBeanCollectionDataSource(al));
                        //JasperExportManager.exportReportToPdfFile(print, "../Cracha/" + nome + ".pdf"); 
                        JasperExportManager.exportReportToPdfFile(print, "cracha/crachaIndividual.pdf");
                        JOptionPane.showMessageDialog(null, "Relatório gerado.", "Info", JOptionPane.INFORMATION_MESSAGE);
                    } catch (JRException ex) {
                        Logger.getLogger(ListenersControle.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }
    
    //--Verifica os campos antes de prosseguir
    private boolean verificaCampos(CIVisao cIV) {
        String n = cIV.gettfNome().getText(), in = "Nome";
        String c = cIV.gettfCPF().getText(), ic = "CPF";
        String uq = cIV.gettfURL().getText(), iuq = "URL QR Codes";
        
        if(n.equalsIgnoreCase(in)){
            JOptionPane.showMessageDialog(null, "Preencha um nome. \nDeixe o mouse sobre um dos campos para mais informações!", "Faltando Informações", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if(c.equalsIgnoreCase(ic)){
            JOptionPane.showMessageDialog(null, "Preencha um CPF. \nDeixe o mouse sobre um dos campos para mais informações!", "Faltando Informações", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if(uq.equalsIgnoreCase(iuq)) {
            JOptionPane.showMessageDialog(null, "Preencha a URL dos QR Codes. \nDeixe o mouse sobre um dos campos para mais informações!", "Faltando Informações", JOptionPane.ERROR_MESSAGE);
            return false;
        } else 
            return true;
    }
    
    private String nomeSimplif(String nome) {  
        String retorno;
        
        System.out.println("Simplificando: " + nome);
        
        if (nome.split(" ")[0] == null)
            return nome;
        
        try{
            if(nome.split(" ")[1].length() <= 3)
                retorno = nome.split(" ")[0] + " " + nome.split(" ")[1] + " " +nome.split(" ")[2];
            else
                retorno = nome.split(" ")[0] + " " + nome.split(" ")[1];
        } catch(ArrayIndexOutOfBoundsException aIOOBE) {
            retorno = nome;
        }
        
        return retorno.toUpperCase();
    }
    
    //--Gerar QRCode
    public void geraQR(String nomeAluno, String cpf, String url) {
        String myCodeText = "CPF:" + cpf + ":" + nomeAluno;
        String filePath = url + nomeAluno + ".png";
        int size = 200;
        String fileType = "png";
        File myFile = new File(filePath);
        
        try {
            Hashtable<EncodeHintType, ErrorCorrectionLevel> hintMap = new Hashtable<EncodeHintType, ErrorCorrectionLevel>();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            
            Map<EncodeHintType, Object> hints = new EnumMap<EncodeHintType, Object>(EncodeHintType.class);
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            hints.put(EncodeHintType.MARGIN, 1); /* default = 4 */
            
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix byteMatrix = qrCodeWriter.encode(myCodeText, BarcodeFormat.QR_CODE, size, size, hints);
            int CrunchifyWidth = byteMatrix.getWidth();
            BufferedImage image = new BufferedImage(CrunchifyWidth, CrunchifyWidth, BufferedImage.TYPE_INT_RGB);
            image.createGraphics();

            Graphics2D g = (Graphics2D) image.getGraphics();
            
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, CrunchifyWidth, CrunchifyWidth);
            
            g.setColor(Color.BLACK);

            for (int i = 0; i < CrunchifyWidth; i++) {
                for (int j = 0; j < CrunchifyWidth; j++) {
                    if (byteMatrix.get(i, j)) {
                        g.fillRect(i, j, 1, 1);
                    }
                }
            }
            ImageIO.write(image, fileType, myFile);
        } catch (WriterException wE) {
            wE.printStackTrace();
        } catch (IOException iOE) {
            iOE.printStackTrace();
        }
    }
}