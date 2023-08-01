/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import connection.CRUD;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelos.Cliente;
import modelos.Vendedor;

/**
 *
 * @author Bruno
 */
public class CadastroClienteView extends javax.swing.JFrame {

    private HomeView h;

    /**
     * Creates new form Cadastro
     */
    public CadastroClienteView(HomeView home) {
        h = home;
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

        enderecoFD = new javax.swing.JTextField();
        rgFD = new javax.swing.JTextField();
        nomeFD = new javax.swing.JTextField();
        cpfFD = new javax.swing.JTextField();
        emailFD = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro cliente - At Home");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enderecoFD.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        enderecoFD.setForeground(new java.awt.Color(153, 153, 153));
        enderecoFD.setBorder(null);
        enderecoFD.setOpaque(false);
        emailFD.setBackground(new java.awt.Color(0,0,0,1));
        enderecoFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoFDActionPerformed(evt);
            }
        });
        getContentPane().add(enderecoFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 620, 320, 40));

        rgFD.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rgFD.setForeground(new java.awt.Color(153, 153, 153));
        rgFD.setBorder(null);
        rgFD.setOpaque(false);
        cpfFD.setBackground(new java.awt.Color(0,0,0,1));
        rgFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgFDActionPerformed(evt);
            }
        });
        getContentPane().add(rgFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 320, 30));

        nomeFD.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nomeFD.setForeground(new java.awt.Color(153, 153, 153));
        nomeFD.setBorder(null);
        nomeFD.setOpaque(false);
        nomeFD.setBackground(new java.awt.Color(0,0,0,1));
        getContentPane().add(nomeFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 320, 40));

        cpfFD.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cpfFD.setForeground(new java.awt.Color(153, 153, 153));
        cpfFD.setBorder(null);
        cpfFD.setOpaque(false);
        cpfFD.setBackground(new java.awt.Color(0,0,0,1));
        getContentPane().add(cpfFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 320, 40));

        emailFD.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emailFD.setForeground(new java.awt.Color(153, 153, 153));
        emailFD.setBorder(null);
        emailFD.setOpaque(false);
        emailFD.setBackground(new java.awt.Color(0,0,0,1));
        getContentPane().add(emailFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 320, 30));

        button.setContentAreaFilled(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        getContentPane().add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 680, 200, 50));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadCliente-page.png"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        // TODO add your handling code here:
        try {
            CRUD oi = new CRUD();
            boolean checkIfClienteExist = oi.checkIfExist("cliente", cpfFD.getText()), checkEmail = true;

            //vendo se o meail está no formato certo
            checkEmail = emailFD.getText().contains("@") && (emailFD.getText().endsWith(".com") || emailFD.getText().endsWith(".br"));

            if (!checkIfClienteExist && checkEmail) {
                Cliente cliente = new Cliente(nomeFD.getText(),cpfFD.getText(),emailFD.getText(),rgFD.getText(), enderecoFD.getText());
                oi.add(cliente);
                dispose();
                JOptionPane.showMessageDialog(this, "Cliente adicionado com sucesso!", "Cadastro realizado!", HEIGHT);
            } else {
                if (checkIfClienteExist) {
                    JOptionPane.showMessageDialog(this, "Cliente já existe.", "Erro no cadastro", HEIGHT);

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

    private void rgFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgFDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgFDActionPerformed

    private void enderecoFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoFDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoFDActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroClienteView(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JTextField cpfFD;
    private javax.swing.JTextField emailFD;
    private javax.swing.JTextField enderecoFD;
    private javax.swing.JLabel fundo;
    private javax.swing.JTextField nomeFD;
    private javax.swing.JTextField rgFD;
    // End of variables declaration//GEN-END:variables
}
