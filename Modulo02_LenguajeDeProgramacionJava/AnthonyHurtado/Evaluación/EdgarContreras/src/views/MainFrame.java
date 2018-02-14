package views;

import java.awt.Image;
import java.awt.Toolkit;
import model.*;
import controllers.Controller_I;
import javax.swing.JOptionPane;
/**
 *
 * @author Edgar Contreras
 */
public class MainFrame extends javax.swing.JFrame {
    public static User usuario;
    private Controller_I handler;
    
    
    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    //Este metodo lo uso para agregar icono 
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/Sed-08-512.png"));
        return retValue;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabelicon = new javax.swing.JLabel();
        jLabelusuario = new javax.swing.JLabel();
        jLabelpass = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jButtonSesion = new javax.swing.JButton();
        password = new javax.swing.JTextField();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabelicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconos-personas-metro-tendencias.png"))); // NOI18N
        getContentPane().add(jLabelicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 190, -1));

        jLabelusuario.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabelusuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelusuario.setText("Tarjeta");
        getContentPane().add(jLabelusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 80, -1));

        jLabelpass.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabelpass.setForeground(new java.awt.Color(255, 255, 255));
        jLabelpass.setText("Clave");
        getContentPane().add(jLabelpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 60, -1));

        user.setBackground(new java.awt.Color(0, 0, 102));
        user.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setToolTipText("");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 110, -1));

        jButtonSesion.setBackground(new java.awt.Color(0, 0, 102));
        jButtonSesion.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButtonSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSesion.setText("Inciar Sesion");
        jButtonSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 110, -1));

        password.setBackground(new java.awt.Color(0, 0, 102));
        password.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 110, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/-de-pantalla-personalizacion-wallpapers-tecnologa-fondos-i-s-ibackgroundz.com.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 445));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);//Boton de salir 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSesionActionPerformed
        //Instancias 
        handler = new Controller_I();
        usuario = new User();
        
        
        try{
            //Se recupera los valores almacenados en los JTextField de tarjeta y clave.
            usuario.setTarjeta(Integer.parseInt(user.getText()));
            usuario.setClave(Integer.parseInt(password.getText()));
        
            if (handler.ingresoUsuario(usuario)) {//este metodo devuelven un valor boolean, a traves de una comprobacion de coherencia
                //JOptionPane.showMessageDialog(jButton1, "Usuario valido");
                PanelInterno pn = new PanelInterno();
                pn.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(jButton1, "Usuario invalido");
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(jButton1, "No puede dejar campos vacios o ingresar texto\n Intente de nuevo con solo digitos");
        }
    }//GEN-LAST:event_jButtonSesionActionPerformed
                
    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        //Texto de ususario
    }//GEN-LAST:event_userActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSesion;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelicon;
    private javax.swing.JLabel jLabelpass;
    private javax.swing.JLabel jLabelusuario;
    private javax.swing.JTextField password;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
