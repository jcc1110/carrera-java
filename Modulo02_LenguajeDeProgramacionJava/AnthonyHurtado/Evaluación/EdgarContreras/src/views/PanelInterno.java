package views;
import java.awt.Image;
import java.awt.Toolkit;
import model.*;
import controllers.Controller_I;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgar Contreras
 */
public class PanelInterno extends javax.swing.JFrame {
    
    private Controller_I handler;
    private int valor = 0;//Valor en el cual se almacenara lo que se desea depositar o retirar
    
    public PanelInterno() {
        initComponents();
        this.setLocationRelativeTo(null);//Para que salgo centrado
    }
    //esto funciona para añadir icono
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/Sed-08-512.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonsalir = new javax.swing.JButton();
        jButtonconsulta = new javax.swing.JButton();
        jLabelatm = new javax.swing.JLabel();
        jButtonretiro = new javax.swing.JButton();
        jButtoncambioclave = new javax.swing.JButton();
        jButtondeposito = new javax.swing.JButton();
        jLabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonsalir.setBackground(new java.awt.Color(0, 0, 102));
        jButtonsalir.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonsalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonsalir.setText("Salir");
        jButtonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jButtonconsulta.setBackground(new java.awt.Color(0, 0, 102));
        jButtonconsulta.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonconsulta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonconsulta.setText("Consultar");
        jButtonconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonconsultaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonconsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabelatm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atm.png"))); // NOI18N
        getContentPane().add(jLabelatm, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 280, 260));

        jButtonretiro.setBackground(new java.awt.Color(0, 0, 102));
        jButtonretiro.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonretiro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonretiro.setText("Retiro");
        jButtonretiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonretiroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonretiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jButtoncambioclave.setBackground(new java.awt.Color(0, 0, 102));
        jButtoncambioclave.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtoncambioclave.setForeground(new java.awt.Color(255, 255, 255));
        jButtoncambioclave.setText("Cambio de Clave");
        jButtoncambioclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncambioclaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtoncambioclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jButtondeposito.setBackground(new java.awt.Color(0, 0, 102));
        jButtondeposito.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtondeposito.setForeground(new java.awt.Color(255, 255, 255));
        jButtondeposito.setText("Deposito");
        jButtondeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondepositoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtondeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/-de-pantalla-personalizacion-wallpapers-tecnologa-fondos-i-s-ibackgroundz.com.jpg"))); // NOI18N
        getContentPane().add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -20, 620, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsalirActionPerformed
        System.exit(0);//configuracion del boton salir
    }//GEN-LAST:event_jButtonsalirActionPerformed

    private void jButtonconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonconsultaActionPerformed
        //Consulta
        //instancia de la ventana principal para obtener datos estaticos de la clase(como el usuario)
        MainFrame mf = new MainFrame();
        User usuario1 = mf.usuario;
        handler = new Controller_I();//instacia de mi clase controlador
        //el metodo consulta devuelve un String preparado que dice "su saldo actual es" mas el saldo calculado de la BBDD
        try{
        JOptionPane.showMessageDialog(jButtonsalir, handler.Consulta(usuario1.getTarjeta(), usuario1.getClave()));
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(jButtonsalir, "Ha ocurrido un error");
            //e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonconsultaActionPerformed

    private void jButtondepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondepositoActionPerformed
        User usuario1 = MainFrame.usuario;
        
        
        try{
        //el valor ingresado es parseado para que coincida con int.
        valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad a depositar"));
        handler.Deposito(usuario1.getTarjeta(), usuario1.getClave(), valor);
        JOptionPane.showMessageDialog(jButtonsalir, "El deposito fue realizado con exito..");
        
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(jButtonsalir, "Ha ocurrido un error");
            e.printStackTrace();
        }
        catch(NumberFormatException f){
            JOptionPane.showMessageDialog(jButtonsalir, "Cancelaste la operacion en curso\n Ventana Cerrada o \n Dato incompatible");
        }
    }//GEN-LAST:event_jButtondepositoActionPerformed

    private void jButtonretiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonretiroActionPerformed
        User usuario1 = MainFrame.usuario; 

        try{
            valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad a retirar"));
            int limite;
            limite = AccessData.num;//num es AccessData posee el valor del saldo actual del usuario
            //Se comprueba que ususario tenga fondos suficientes para retirar
            if(valor>=limite){
                JOptionPane.showMessageDialog(jButtonsalir, "Fondo insuficiente\n Intente con otro monto menor");
            }else{ 
                handler.Retiro(usuario1.getTarjeta(), usuario1.getClave(), valor);
                JOptionPane.showMessageDialog(jButtonsalir, "El retiro fue realizado con exito..");
            }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(jButtonsalir, "Ha ocurrido un error");
            e.printStackTrace();
        }
        catch(NumberFormatException f){
            JOptionPane.showMessageDialog(jButtonsalir, "Cancelaste la operacion en curso\n Ventana Cerrada o \n Dato incompatible");
        }
    }//GEN-LAST:event_jButtonretiroActionPerformed

    private void jButtoncambioclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncambioclaveActionPerformed
        User usuario1 = MainFrame.usuario;
        
        int valor1, valor2;//valores donde residiran la clave a cambiar, y para confirmar
        try{
            valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nueva clave"));
            valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevamente la clave para confirmar"));
            if(valor1==valor2){//comprobacion de coherencia de claves
                handler.cambioClave(usuario1.getTarjeta(), usuario1.getClave(), valor1);
                JOptionPane.showMessageDialog(jButtonsalir, "Se ha cambiado la clave satisfactoriamente");
            }else{
                JOptionPane.showMessageDialog(jButtonsalir, "Las claves no coinciden");
            }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(jButtonsalir, "Algo a salio mal...");
            e.printStackTrace();
        }
        catch(NumberFormatException f){
            JOptionPane.showMessageDialog(jButtonsalir, "Cancelaste la operacion en curso\n Ventana Cerrada o \n Dato incompatible");
        }
    }//GEN-LAST:event_jButtoncambioclaveActionPerformed

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
            java.util.logging.Logger.getLogger(PanelInterno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelInterno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelInterno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelInterno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelInterno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoncambioclave;
    private javax.swing.JButton jButtonconsulta;
    private javax.swing.JButton jButtondeposito;
    private javax.swing.JButton jButtonretiro;
    private javax.swing.JButton jButtonsalir;
    private javax.swing.JLabel jLabelatm;
    private javax.swing.JLabel jLabelfondo;
    // End of variables declaration//GEN-END:variables
}
