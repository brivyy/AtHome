/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import connection.CRUD;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import javax.swing.JOptionPane;
import modelos.Vendedor;

/**
 *
 * @author Bruno
 */
public class LoginView extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginView() {
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

        usuarioFD = new javax.swing.JTextField();
        senhaFD = new javax.swing.JPasswordField();
        button = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuarioFD.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        usuarioFD.setForeground(new java.awt.Color(153, 153, 153));
        usuarioFD.setBorder(null);
        usuarioFD.setOpaque(false);
        usuarioFD.setBackground(new java.awt.Color(0,0,0,1));
        usuarioFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioFDActionPerformed(evt);
            }
        });
        usuarioFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuarioFDKeyPressed(evt);
            }
        });
        getContentPane().add(usuarioFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 374, 330, 40));

        senhaFD.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        senhaFD.setForeground(new java.awt.Color(153, 153, 153));
        senhaFD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 255)));
        senhaFD.setOpaque(false);
        senhaFD.setBackground(new java.awt.Color(0,0,0,1));
        senhaFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaFDActionPerformed(evt);
            }
        });
        senhaFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaFDKeyPressed(evt);
            }
        });
        getContentPane().add(senhaFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 330, 40));

        button.setContentAreaFilled(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        getContentPane().add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, 180, 60));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Login-page.png"))); // NOI18N
        fundo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fundoKeyPressed(evt);
            }
        });
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioFDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioFDActionPerformed

    private void senhaFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaFDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaFDActionPerformed

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        CRUD oi;

        try {
            oi = new CRUD();
            boolean contaExiste = oi.loginVendedor(usuarioFD.getText(), new String(senhaFD.getPassword()));
            if (contaExiste) {
                HomeView home = new HomeView((Vendedor) oi.getPorID("vendedor",usuarioFD.getText()));
                home.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(this, "Usuario ou senha errados!", "Erro no login", JOptionPane.WARNING_MESSAGE);
            }

        } catch (InterruptedException | ExecutionException | IOException ex) {
            JOptionPane.showMessageDialog(this, "Usuario ou senha errados!", "Erro no login", JOptionPane.WARNING_MESSAGE);
        } 
    }//GEN-LAST:event_buttonActionPerformed

    private void usuarioFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioFDKeyPressed
        // TODO add your handling code here:
        enterPressed(evt);
    }//GEN-LAST:event_usuarioFDKeyPressed

    private void senhaFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaFDKeyPressed
        // TODO add your handling code here:
        enterPressed(evt);

    }//GEN-LAST:event_senhaFDKeyPressed
    private void fundoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fundoKeyPressed
        // TODO add your handling code here:
        enterPressed(evt);
    }//GEN-LAST:event_fundoKeyPressed

    private void enterPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buttonActionPerformed(null);
        }
    }

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JLabel fundo;
    private javax.swing.JPasswordField senhaFD;
    private javax.swing.JTextField usuarioFD;
    // End of variables declaration//GEN-END:variables
}