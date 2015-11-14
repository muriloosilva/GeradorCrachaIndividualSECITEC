package main;

import control.ListenersControle;
import control.ListenersVisao;
import modelo.ModeloCracha;
import visao.CIVisao;

public class CrachaIndividual {
    public static void main(String[] args) {   
        //LAF
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CIVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CIVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CIVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CIVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }     
        
        //Modelo
        ModeloCracha mC = null;
        //Visao
        CIVisao cIV = new CIVisao();
        //Controle
        ListenersControle lC = new ListenersControle(cIV);
        ListenersVisao lV = new ListenersVisao(cIV);
        
        cIV.getbImprimir().requestFocus();
        cIV.setVisible(true);
    }    
}