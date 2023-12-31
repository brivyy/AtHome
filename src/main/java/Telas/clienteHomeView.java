/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

/**
 *
 * @author Bruno
 */
public class clienteHomeView extends javax.swing.JFrame {

    private HomeView h;

    /**
     * Creates new form clienteHomeView
     */
    public clienteHomeView(HomeView home) {
        h = home;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeBTn = new javax.swing.JButton();
        CadClienteBtn = new javax.swing.JButton();
        historicoBtn = new javax.swing.JButton();
        usuario = new javax.swing.JTextField();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("At home - Clientes");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeBTn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\imagens\\homeBtn.png")); // NOI18N
        homeBTn.setContentAreaFilled(false);
        homeBTn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBTn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBTnActionPerformed(evt);
            }
        });
        getContentPane().add(homeBTn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 710, -1, -1));

        CadClienteBtn.setContentAreaFilled(false);
        CadClienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadClienteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CadClienteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 200, 200));

        historicoBtn.setContentAreaFilled(false);
        historicoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(historicoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 273, 200, 200));

        usuario.setEditable(false);
        usuario.setBackground(new java.awt.Color(204, 102, 255));
        usuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(204, 204, 204));
        usuario.setBorder(null);
        usuario.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        usuario.setOpaque(false);
        usuario.setBackground(new java.awt.Color(0,0,0,1));
        String[] nome = h.user.getNome().split(" ");
        usuario.setText(nome[0]);
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 120, 30));

        fundo.setIcon(new javax.swing.ImageIcon("src\\main\\java\\imagens\\clientes-page.png")); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        h.setVisible(true);

    }//GEN-LAST:event_formWindowClosed

    private void CadClienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadClienteBtnActionPerformed
        // TODO add your handling code here:
        CadastroClienteView cad = new CadastroClienteView(this);
        cad. setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_CadClienteBtnActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void historicoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicoBtnActionPerformed
        // TODO add your handling code here:
        HistoricoVendasView his = new HistoricoVendasView(this);
        his.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_historicoBtnActionPerformed

    private void homeBTnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBTnActionPerformed
        // TODO add your handling code here:
        dispose();
        h.setVisible(true);
    }//GEN-LAST:event_homeBTnActionPerformed

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
            java.util.logging.Logger.getLogger(clienteHomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clienteHomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clienteHomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clienteHomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clienteHomeView(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadClienteBtn;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton historicoBtn;
    private javax.swing.JButton homeBTn;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
