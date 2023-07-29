/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import java.awt.Component;
import javax.swing.JTextField;
import modelos.Images;

/**
 *
 * @author Bruno
 */
public class Home extends javax.swing.JFrame {
private String user;
    /**
     * Creates new form Home
     */
    public Home(String usuarioLogin) {
        user = usuarioLogin;
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

        usuario = new javax.swing.JTextField();
        fotoperfil = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fundoHome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("At Home");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setEditable(false);
        usuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        usuario.setForeground(new java.awt.Color(51, 51, 51));
        usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 255)));
        usuario.setOpaque(false);
        usuario.setBackground(new java.awt.Color(0,0,0,1));
        usuario.setText(user);
        usuario.setHorizontalAlignment(JTextField.CENTER);
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, 30));

        fotoperfil.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\trabalhodejava\\src\\main\\java\\imagens\\panda-home.png")); // NOI18N
        fotoperfil.setMinimumSize(new java.awt.Dimension(100, 100));
        fotoperfil.setPreferredSize(new java.awt.Dimension(187, 196));
        getContentPane().add(fotoperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 23, 193, 187));

        fundoHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\trabalhodejava\\src\\main\\java\\imagens\\fundohome.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(fundoHome)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(fundoHome, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1, -1, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home("").setVisible(true);
                Images img = new Images();
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fotoperfil;
    private javax.swing.JLabel fundoHome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField usuario;
    private javax.swing.JTextField usuarioFD;
    private javax.swing.JTextField usuarioFD1;
    // End of variables declaration//GEN-END:variables
}