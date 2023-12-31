/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import connection.CRUD;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelos.Vendedor;

/**
 *
 * @author Bruno
 */
public class CadastroView extends javax.swing.JFrame {

    private HomeView h;

    /**
     * Creates new form Cadastro
     */
    public CadastroView(HomeView home) {
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
        nomeFD = new javax.swing.JTextField();
        cpfFD = new javax.swing.JTextField();
        usuarioFD = new javax.swing.JTextField();
        senhaFD = new javax.swing.JPasswordField();
        emailFD = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro vendedor - At Home");
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
        getContentPane().add(homeBTn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 680, -1, -1));

        nomeFD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomeFD.setForeground(new java.awt.Color(51, 51, 51));
        nomeFD.setBorder(null);
        nomeFD.setOpaque(false);
        nomeFD.setBackground(new java.awt.Color(0,0,0,1));
        nomeFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomeFDKeyPressed(evt);
            }
        });
        getContentPane().add(nomeFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 294, 310, 30));

        cpfFD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cpfFD.setForeground(new java.awt.Color(51, 51, 51));
        cpfFD.setBorder(null);
        cpfFD.setOpaque(false);
        emailFD.setBackground(new java.awt.Color(0,0,0,1));
        cpfFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cpfFDKeyPressed(evt);
            }
        });
        getContentPane().add(cpfFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 310, 30));

        usuarioFD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usuarioFD.setForeground(new java.awt.Color(51, 51, 51));
        usuarioFD.setBorder(null);
        usuarioFD.setOpaque(false);
        usuarioFD.setBackground(new java.awt.Color(0,0,0,1));
        usuarioFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuarioFDKeyPressed(evt);
            }
        });
        getContentPane().add(usuarioFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 374, 310, 30));

        senhaFD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        senhaFD.setForeground(new java.awt.Color(51, 51, 51));
        senhaFD.setBorder(null);
        senhaFD.setOpaque(false);
        senhaFD.setBackground(new java.awt.Color(0,0,0,1));
        senhaFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaFDKeyPressed(evt);
            }
        });
        getContentPane().add(senhaFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 624, 310, 30));

        emailFD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailFD.setForeground(new java.awt.Color(51, 51, 51));
        emailFD.setBorder(null);
        emailFD.setOpaque(false);
        emailFD.setBackground(new java.awt.Color(0,0,0,1));
        emailFD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailFDKeyPressed(evt);
            }
        });
        getContentPane().add(emailFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 310, 30));

        button.setContentAreaFilled(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        getContentPane().add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 680, 200, 50));

        fundo.setIcon(new javax.swing.ImageIcon("src\\main\\java\\imagens\\cadastro-page.png")); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        // TODO add your handling code here:
        try {
            CRUD oi = new CRUD();
            boolean checkIfUsuarioExist = oi.checkIfExist("vendedor", usuarioFD.getText()), checkEmail = true;

            //vendo se o meail está no formato certo
            checkEmail = emailFD.getText().contains("@") && (emailFD.getText().endsWith(".com") || emailFD.getText().endsWith(".br"));

            if (!checkIfUsuarioExist && checkEmail) {
                Vendedor vendedor = new Vendedor(nomeFD.getText(), cpfFD.getText(), usuarioFD.getText(), emailFD.getText(), new String(senhaFD.getPassword()));
                oi.add(vendedor);
                dispose();
                JOptionPane.showMessageDialog(this, "Vendedor adicionado com sucesso!", "Cadastro realizado!", HEIGHT);
            } else {
                if (checkIfUsuarioExist) {
                    JOptionPane.showMessageDialog(this, "Usuario já existe.", "Erro no cadastro", HEIGHT);

                } else if (!checkEmail) {
                    JOptionPane.showMessageDialog(this, "Email não corresponde ao formato adequado.", "Erro no cadastro", HEIGHT);

                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Algum erro ocorreu, tente novamente.", "Erro no cadastro", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_buttonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
                h.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void nomeFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeFDKeyPressed
enterPressed(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFDKeyPressed

    private void usuarioFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioFDKeyPressed
enterPressed(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioFDKeyPressed

    private void emailFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailFDKeyPressed
enterPressed(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_emailFDKeyPressed

    private void cpfFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfFDKeyPressed
enterPressed(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_cpfFDKeyPressed

    private void senhaFDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaFDKeyPressed
enterPressed(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_senhaFDKeyPressed

    private void homeBTnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBTnActionPerformed
        // TODO add your handling code here:
        dispose();
        h.setVisible(true);
    }//GEN-LAST:event_homeBTnActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroView(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JTextField cpfFD;
    private javax.swing.JTextField emailFD;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton homeBTn;
    private javax.swing.JTextField nomeFD;
    private javax.swing.JPasswordField senhaFD;
    private javax.swing.JTextField usuarioFD;
    // End of variables declaration//GEN-END:variables
}
