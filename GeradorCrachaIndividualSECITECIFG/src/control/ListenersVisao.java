package control;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;
import visao.CIVisao;

public class ListenersVisao {
    //Variaveis
    //--Visao
    private CIVisao cIV = null;
    
    //Metodos
    //--Construtor
    public ListenersVisao(final CIVisao cIV) {
        this.cIV = cIV;
        
        addFocusListener(cIV.gettfNome(), "Nome");
        addFocusListener(cIV.gettfCPF(), "CPF");
        addFocusListener(cIV.gettfURL(), "URL QR Codes");
        
        cIV.gettfCPF().addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode());
				if(cIV.gettfCPF().getText().length()!=14){
					if (e.getKeyCode() != 8) {
						if (cIV.gettfCPF().getText().length() == 3
								|| cIV.gettfCPF().getText().length() == 7) {
							cIV.gettfCPF().setText(cIV.gettfCPF().getText() + ".");
						}
						if (cIV.gettfCPF().getText().length() == 11) {
							cIV.gettfCPF().setText(cIV.gettfCPF().getText() + "-");
						}
					}
				}
				else{
					System.out.println("Maior ou igual a 14");
				}
				
			}
		});
    }
    
    private void addFocusListener(final JTextField tf, final String text) {
        tf.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (tf.getText().equalsIgnoreCase(text)){
                    tf.setText("");
                    tf.setForeground(new Color(0,102,204));
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (tf.getText().equalsIgnoreCase("")) {
                    tf.setText(text);
                    tf.setForeground(new Color(102,153,255));
                }
            }
        });
    }
}
