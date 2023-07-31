/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import javax.swing.JTextField;
import modelos.Images;
import modelos.Vendedor;

/**
 *
 * @author Bruno
 */
public class HomeView extends javax.swing.JFrame {

    private Vendedor user;

    /**
     * Creates new form Home
     */
    public HomeView(Vendedor usuario) {
        if (usuario == null) {
            user = new Vendedor("default2");
        } else {
            user = usuario;
        }
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

        estoqueBtn = new javax.swing.JButton();
        compraBtn = new javax.swing.JButton();
        cadClienteBtn = new javax.swing.JButton();
        cadVendedorBtn = new javax.swing.JButton();
        usuario = new javax.swing.JTextField();
        fotoperfil = new javax.swing.JLabel();
        fundoHome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("At Home");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        estoqueBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\trabalhodejava\\src\\main\\java\\imagens\\estoque.png")); // NOI18N
        estoqueBtn.setContentAreaFilled(false);
        estoqueBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estoqueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoqueBtnActionPerformed(evt);
            }
        });
        getContentPane().add(estoqueBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        compraBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\trabalhodejava\\src\\main\\java\\imagens\\Compra.png")); // NOI18N
        compraBtn.setContentAreaFilled(false);
        compraBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(compraBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, -1, -1));

        cadClienteBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\trabalhodejava\\src\\main\\java\\imagens\\cadClie.png")); // NOI18N
        cadClienteBtn.setContentAreaFilled(false);
        cadClienteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(cadClienteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));

        cadVendedorBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\trabalhodejava\\src\\main\\java\\imagens\\cadVend.png")); // NOI18N
        cadVendedorBtn.setContentAreaFilled(false);
        cadVendedorBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadVendedorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadVendedorBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cadVendedorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        usuario.setEditable(false);
        usuario.setBackground(new java.awt.Color(204, 102, 255));
        usuario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        usuario.setForeground(new java.awt.Color(204, 204, 204));
        usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(39, 99, 119)));
        usuario.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        usuario.setOpaque(false);
        usuario.setBackground(new java.awt.Color(0,0,0,1));
        String[] nome = user.getNome().split(" ");
        usuario.setText(nome[0] + " " + nome[1]);
        usuario.setHorizontalAlignment(JTextField.CENTER);
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 170, 30));

        fotoperfil.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\trabalhodejava\\src\\main\\java\\imagens\\panda-home.png")); // NOI18N
        fotoperfil.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(39, 99, 119)));
        fotoperfil.setMinimumSize(new java.awt.Dimension(100, 100));
        fotoperfil.setPreferredSize(new java.awt.Dimension(187, 196));
        getContentPane().add(fotoperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 193, 187));

        fundoHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\trabalhodejava\\src\\main\\java\\imagens\\ImagemHome.png")); // NOI18N
        getContentPane().add(fundoHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadVendedorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadVendedorBtnActionPerformed
        // TODO add your handling code here:
        CadastroView cadastro = new CadastroView(this);
        cadastro.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_cadVendedorBtnActionPerformed


    private void estoqueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoqueBtnActionPerformed
        // TODO add your handling code here:
        EstoqueView estoque = new EstoqueView(this);
        estoque.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_estoqueBtnActionPerformed

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
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView(new Vendedor("default")).setVisible(true);
                Images img = new Images();

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadClienteBtn;
    private javax.swing.JButton cadVendedorBtn;
    private javax.swing.JButton compraBtn;
    private javax.swing.JButton estoqueBtn;
    private javax.swing.JLabel fotoperfil;
    private javax.swing.JLabel fundoHome;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}