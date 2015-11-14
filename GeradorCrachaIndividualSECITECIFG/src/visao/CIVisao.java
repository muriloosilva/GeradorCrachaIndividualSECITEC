/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visao;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author SWITCH
 */
public class CIVisao extends javax.swing.JFrame {

    /**
     * Creates new form CIVisao
     */
    public CIVisao() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPrincipal = new javax.swing.JPanel();
        pTitulo = new javax.swing.JPanel();
        lTitulo = new javax.swing.JLabel();
        pCracha = new javax.swing.JPanel();
        tfNome = new javax.swing.JTextField();
        tfCPF = new javax.swing.JTextField();
        tfURL = new javax.swing.JTextField("QRCodesIndividual/");
        bImprimir = new javax.swing.JButton();
        bSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pPrincipal.setBackground(new java.awt.Color(0, 102, 204));

        pTitulo.setBackground(new java.awt.Color(255, 255, 255));

        lTitulo.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        lTitulo.setForeground(new java.awt.Color(0, 102, 204));
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("Crachás Individuais VI SeCiTec 2015");

        javax.swing.GroupLayout pTituloLayout = new javax.swing.GroupLayout(pTitulo);
        pTitulo.setLayout(pTituloLayout);
        pTituloLayout.setHorizontalGroup(
            pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pTituloLayout.setVerticalGroup(
            pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        pCracha.setBackground(new java.awt.Color(102, 153, 255));
        pCracha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Novo Crachá", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        tfNome.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tfNome.setForeground(new java.awt.Color(102, 153, 255));
        tfNome.setText("Nome");
        tfNome.setToolTipText("Preencha com no máximo dois nomes.");
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        tfCPF.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tfCPF.setForeground(new java.awt.Color(102, 153, 255));
        tfCPF.setText("CPF");
        tfCPF.setToolTipText("Preencha com o mesmo CPF que cadastrou no sistema.");
        tfCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCPFActionPerformed(evt);
            }
        });

        tfURL.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tfURL.setForeground(new java.awt.Color(102, 153, 255));
        //tfURL.setText("URL QR Codes");
        tfURL.setToolTipText("Coloque aqui a URL onde ficarão salvos os QR Codes. Exemplo: D:\\Desktop\\Imagens");

        javax.swing.GroupLayout pCrachaLayout = new javax.swing.GroupLayout(pCracha);
        pCracha.setLayout(pCrachaLayout);
        pCrachaLayout.setHorizontalGroup(
            pCrachaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCrachaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCrachaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCrachaLayout.createSequentialGroup()
                        .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(tfURL, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfNome))
                .addContainerGap())
        );
        pCrachaLayout.setVerticalGroup(
            pCrachaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCrachaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(pCrachaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(tfURL))
                .addContainerGap())
        );

        bImprimir.setBackground(new java.awt.Color(255, 255, 255));
        bImprimir.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        bImprimir.setForeground(new java.awt.Color(0, 102, 204));
        bImprimir.setText("Imprimir");
        bImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bImprimirActionPerformed(evt);
            }
        });

        bSair.setBackground(new java.awt.Color(255, 255, 255));
        bSair.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        bSair.setForeground(new java.awt.Color(0, 102, 204));
        bSair.setText("Sair");

        javax.swing.GroupLayout pPrincipalLayout = new javax.swing.GroupLayout(pPrincipal);
        pPrincipal.setLayout(pPrincipalLayout);
        pPrincipalLayout.setHorizontalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pCracha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pPrincipalLayout.createSequentialGroup()
                        .addComponent(bImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bSair, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pPrincipalLayout.setVerticalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pCracha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(bSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCPFActionPerformed

    private void bImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bImprimirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bImprimir;
    private javax.swing.JButton bSair;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JPanel pCracha;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfURL;
    // End of variables declaration//GEN-END:variables
    public JTextField gettfNome() {return tfNome;}
    public JTextField gettfCPF() {return tfCPF;}
    public JTextField gettfURL() {return tfURL;}
    public JButton getbSair() {return bSair;}
    public JButton getbImprimir() {return bImprimir;}
}
