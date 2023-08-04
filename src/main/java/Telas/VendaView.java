/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import connection.CRUD;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import modelos.Produto;

/**
 *
 * @author Bruno
 */
public class VendaView extends javax.swing.JFrame {

    /**
     * Creates new form VendaView
     */
    public VendaView() {
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

        panel = new javax.swing.JScrollPane();
        estoqueList = new javax.swing.JList<>();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBorder(null);
        panel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        DefaultListModel<Produto> listModel = new DefaultListModel<>();
        estoqueList.setBorder(null);
        estoqueList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estoqueList.setForeground(new java.awt.Color(51, 51, 51));
        estoqueList.setModel(listModel);
        CRUD oi;
        try{
            oi = new CRUD();

            for(Produto produto: oi.getTodosProdutos()){
                listModel.addElement(produto);
            }}catch(Exception e){

            }

            DefaultListCellRenderer renderer =  (DefaultListCellRenderer)estoqueList.getCellRenderer();
            renderer.setHorizontalAlignment(JLabel.CENTER);
            estoqueList.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    estoqueListMouseClicked(evt);
                }
            });
            panel.setViewportView(estoqueList);

            getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 320, 550));

            fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\trabalhodejava\\src\\main\\java\\imagens\\Vendas-page.png")); // NOI18N
            getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void estoqueListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estoqueListMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_estoqueListMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Produto> estoqueList;
    private javax.swing.JLabel fundo;
    private javax.swing.JScrollPane panel;
    // End of variables declaration//GEN-END:variables
}