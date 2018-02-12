/**
 *
 * @author John Erice / Immer Gonzalez
 * Proyecto modulo 2 de Java
 * @version 1.0
 */

package views;
/**
 *@param:
 * Importacion de Librerias y paquetes
 * 
 * 
 */
import controllers.operation;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.DataAccess;
import static views.Acceso.nro_usuario;


public class OperacionesCajero extends javax.swing.JFrame {
       DefaultTableModel dtm= new DefaultTableModel();
      
              
       
 /**
 * 
 * Declaracion de Variables estaticas publicas
 * 
 */
    public static String Titulo;
    public static Double ultimo_saldo; 
    public static String fecha_operacion;
    public static String ultimo_saldo1;
        
 /**
 *
 * Permite mostrar todos los movimientos de el usuario a 
 * traves de una tabla de consulta
 * 
 */
    public void mostrar_datos(String nro_usuario1){
       System.out.println(nro_usuario1);
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable3.setModel(modelo);
            String sql=java.util.ResourceBundle.getBundle("views/Bundle").getString("");
            Statement s = con.createStatement();
            sql = java.util.ResourceBundle.getBundle("views/Bundle").getString("SELECT * FROM BDBANCO.MOVIMIENTO WHERE ID_USUARIO='")+nro_usuario1+java.util.ResourceBundle.getBundle("views/Bundle").getString("'");
            ResultSet rs = s.executeQuery(sql);
                       ResultSetMetaData rsMd;
                       rsMd = rs.getMetaData();
                       int cantidaddeColumnas = rsMd.getColumnCount();
                       for (int i = 1; i <= cantidaddeColumnas; i++) {
                           modelo.addColumn(rsMd.getColumnLabel(i));
                       }
                       //Creando las filas para el JTable
                       while (rs.next()) {
                           Object[] fila = new Object[cantidaddeColumnas];
                           for (int i = 0; i < cantidaddeColumnas; i++) {
                               fila[i]=rs.getObject(i+1);
                           }
                           modelo.addRow(fila);
                       }      
          //  con.close();
       } catch (SQLException ex) {
         System.out.println(ex.getMessage());}
       }
 /**
 *
 * Permite obtener el saldo del cliente.
 * 
 * 
 */
    public void saldo(String nro_usuario1){
           
        try{
            String sql=java.util.ResourceBundle.getBundle("views/Bundle").getString("");
            ultimo_saldo1 = java.util.ResourceBundle.getBundle("views/Bundle").getString("");
            Statement s3 = con.createStatement();
            sql = java.util.ResourceBundle.getBundle("views/Bundle").getString("SELECT * FROM BDBANCO.USUARIO WHERE ID_USUARIO='")+nro_usuario1+java.util.ResourceBundle.getBundle("views/Bundle").getString("'");
            ResultSet rs2 = s3.executeQuery(sql);
             while(rs2.next()) {
                       ultimo_saldo1 = (rs2.getString("saldo"));
                   }   
        }      
        catch (SQLException ex) {
         System.out.println(ex.getMessage());}
       }

 /**
 *
 * Permite obtener el saldo_Actual del cliente 
 * 
 */
 public void saldo_actual(String nro_usuario1){
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable3.setModel(modelo);
            String sql=java.util.ResourceBundle.getBundle("views/Bundle").getString("");
            Statement s = con.createStatement();
            sql = java.util.ResourceBundle.getBundle("views/Bundle").getString("SELECT * FROM BDBANCO.USUARIO WHERE ID_USUARIO='")+nro_usuario1+java.util.ResourceBundle.getBundle("views/Bundle").getString("'");
            ResultSet rs = s.executeQuery(sql);
                       ResultSetMetaData rsMd;
                       rsMd = rs.getMetaData();
                       int cantidaddeColumnas = rsMd.getColumnCount();
                       for (int i = 1; i <= cantidaddeColumnas; i++) {
                           modelo.addColumn(rsMd.getColumnLabel(i));
                       }
                       //Creando las filas para el JTable
                       while (rs.next()) {
                           Object[] fila = new Object[cantidaddeColumnas];
                           for (int i = 0; i < cantidaddeColumnas; i++) {
                               fila[i]=rs.getObject(i+1);
                           }
                           modelo.addRow(fila);
                       }      
          //  con.close();
       } catch (SQLException ex) {
         System.out.println(ex.getMessage());}
    }
 
 /**
 * 
 * Permite actualizar retiros en la tabla de cliente
 * 
 */
    public void actualizar_Deposito(String nro_usuario1,double Monto,String tipo_operacion)
    {
          
           String sql2=java.util.ResourceBundle.getBundle("views/Bundle").getString(""); 
           String sql3=java.util.ResourceBundle.getBundle("views/Bundle").getString("");
           Double Saldo_total=0.00;
        try{
            //Se convierte un cambio String a Double
            Double Saldo_aux=0.00;
            Saldo_aux = Double.parseDouble(ultimo_saldo1);
            //Expresion Lambda
            operation.calcular funcion = (v1,v2) -> v1+v2;
            Saldo_total = funcion.operacion(Saldo_aux, Monto);
            // Query para Actualizar el Saldo del Cliente relacionado a la operacion
            sql3 = java.util.ResourceBundle.getBundle("views/Bundle").getString("UPDATE BDBANCO.USUARIO SET SALDO='")+Saldo_total+java.util.ResourceBundle.getBundle("views/Bundle").getString("' WHERE ID_USUARIO='")+nro_usuario1+java.util.ResourceBundle.getBundle("views/Bundle").getString("'");
            Statement s2;
            s2 = con.createStatement();
            int n = s2.executeUpdate(sql3);
            } catch (SQLException ex) {
            System.out.println(ex.getMessage());}
        
    }
    
 /**
 *
 * Permite actualizar retiro de los datos de el usuario a 
 * traves de una tabla de consulta
 * 
 */
    
   public void actualizar_Retiro (String nro_usuario1,double Monto,String tipo_operacion)
    {
          
           String sql2=java.util.ResourceBundle.getBundle("views/Bundle").getString(""); 
           String sql3=java.util.ResourceBundle.getBundle("views/Bundle").getString("");
           Double Saldo_total=0.00;
        try{
            //Se convierte un cambio String a Double
            Double Saldo_aux=0.00;
            Saldo_aux = Double.parseDouble(ultimo_saldo1);
            //Expresion Lambda
            if(Saldo_aux >= Monto){
               operation.calcular funcion = (v1,v2) -> v1-v2;
                Saldo_total = funcion.operacion(Saldo_aux, Monto);
                // Query para Actualizar el Saldo del Cliente relacionado a la operacion
                sql3 = java.util.ResourceBundle.getBundle("views/Bundle").getString("UPDATE BDBANCO.USUARIO SET SALDO='")+Saldo_total+java.util.ResourceBundle.getBundle("views/Bundle").getString("' WHERE ID_USUARIO='")+nro_usuario1+java.util.ResourceBundle.getBundle("views/Bundle").getString("'");
                Statement s2;
                s2 = con.createStatement();
                int n = s2.executeUpdate(sql3);} 
            else{
                  JOptionPane.showMessageDialog(null,java.util.ResourceBundle.getBundle("views/Bundle").getString("EL MONTO DEL RETIRO NO PUEDE SER MAYOR A SU SALDO"));
            }
                } catch (SQLException ex) {
            System.out.println(ex.getMessage());}
        
    }
    public void actualizar_movimiento(String nro_usuario1,Integer Monto,String tipo_operacion)
    
    {
           fecha_operacion = java.util.ResourceBundle.getBundle("views/Bundle").getString("");
           String sql4=java.util.ResourceBundle.getBundle("views/Bundle").getString("");
           Integer Saldo_total=0;
           Integer Saldo_cliente=0;
          try{         
            Saldo_total = Saldo_cliente + Monto; 
            sql4 = java.util.ResourceBundle.getBundle("views/Bundle").getString("INSERT INTO BDBANCO.MOVIMIENTO ( ID_USUARIO,TIPO_MOVIMIENTO,MONTO) ")
                    + java.util.ResourceBundle.getBundle("views/Bundle").getString("VALUES ('")+nro_usuario1+java.util.ResourceBundle.getBundle("views/Bundle").getString("','")+tipo_operacion+java.util.ResourceBundle.getBundle("views/Bundle").getString("','")+Monto+java.util.ResourceBundle.getBundle("views/Bundle").getString("')");
            Statement s2;
            s2 = con.createStatement();
            int n = s2.executeUpdate(sql4);
            } catch (SQLException ex) {
              System.out.println(ex.getMessage());}
        
    }
    
 /**
 *
 * Permite actualizar la clave del usuario 
 * 
 * 
 */    
    public void actualizar_clave (String nro_usuario1,String clave1)
    {
          
           String sql5=java.util.ResourceBundle.getBundle("views/Bundle").getString("");
          try{
            sql5 = java.util.ResourceBundle.getBundle("views/Bundle").getString("UPDATE BDBANCO.USUARIO SET CLAVE_USUARIO='")+clave1+java.util.ResourceBundle.getBundle("views/Bundle").getString("' WHERE ID_USUARIO='")+nro_usuario1+java.util.ResourceBundle.getBundle("views/Bundle").getString("'");
            System.out.println(java.util.ResourceBundle.getBundle("views/Bundle").getString("SQL")+sql5);
               Statement s2;
          s2 = con.createStatement();
          int n = s2.executeUpdate(sql5);
           } catch (SQLException ex) {
            System.out.println(ex.getMessage());}
            finally{
            JOptionPane.showMessageDialog(null,java.util.ResourceBundle.getBundle("views/Bundle").getString("CAMBIO DE CLAVE EFECTUADO EXITOSAMENTE!!"));
       // return;
          
          }
    }
    
       public OperacionesCajero() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(false);
        JtxtMontoOperacion.setText(null);
        JtxtMontoOperacion.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        bttsalir3 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JtxtMontoOperacion = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jBsaldoactual = new javax.swing.JButton();
        jLClaveNueva = new javax.swing.JLabel();
        jLClaveNuevaR = new javax.swing.JLabel();
        jTextClave = new javax.swing.JTextField();
        jTextClaveN = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("views/Bundle"); // NOI18N
        jLabel1.setText(bundle.getString("CAJERO AUTOMATICO")); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\john\\Downloads\\banco-de-cerdo-icono-5949-32.png")); // NOI18N
        jToggleButton1.setText(bundle.getString("DEPOSITO")); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\john\\Downloads\\archivo-de-visita-icono-7333-32.png")); // NOI18N
        jToggleButton2.setText(bundle.getString("CONSULTA MOV.")); // NOI18N
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\john\\Downloads\\monedas-icono-5288-32.png")); // NOI18N
        jToggleButton3.setText(bundle.getString("RETIRO")); // NOI18N
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        bttsalir3.setIcon(new javax.swing.ImageIcon("C:\\Users\\john\\Downloads\\liberacion-de-la-puerta-icono-7259-16.png")); // NOI18N
        bttsalir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttsalir3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText(bundle.getString("CAJERO AUTOMATICO")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText(bundle.getString("MONTO:")); // NOI18N

        JtxtMontoOperacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JtxtMontoOperacionKeyTyped(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\john\\Downloads\\grupo-clave-icono-7589-32.png")); // NOI18N
        jButton1.setText(bundle.getString("CAMBIO CLAVE")); // NOI18N
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBsaldoactual.setIcon(new javax.swing.ImageIcon("C:\\Users\\john\\Downloads\\gnucash.png")); // NOI18N
        jBsaldoactual.setText(bundle.getString("SALDO ACTUAL")); // NOI18N
        jBsaldoactual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsaldoactualActionPerformed(evt);
            }
        });

        jLClaveNueva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLClaveNueva.setText(bundle.getString("CLAVE NUEVA:")); // NOI18N

        jLClaveNuevaR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLClaveNuevaR.setText(bundle.getString("REPITA SU CLAVE:")); // NOI18N

        jTextClave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextClaveActionPerformed(evt);
            }
        });

        jTextClaveN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextClaveN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextClaveNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBsaldoactual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLClaveNuevaR, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLClaveNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextClave, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jTextClaveN))
                                .addGap(164, 164, 164)
                                .addComponent(bttsalir3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JtxtMontoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel4)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBsaldoactual, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton2)
                        .addGap(26, 26, 26)
                        .addComponent(jToggleButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtxtMontoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLClaveNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLClaveNuevaR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextClaveN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bttsalir3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setBounds(0, 0, 664, 502);
    }// </editor-fold>//GEN-END:initComponents

    private void bttsalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttsalir3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_bttsalir3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
     //  if(JtxtMontoOperacion.getText().equals(""))
     //   {
     //   JOptionPane.showMessageDialog(null,"Debes Ingresar el Monto de la Operacion");
     //   return;
     //   }
        Integer Monto5;
        String Monto_tecleado;
        Monto_tecleado = JtxtMontoOperacion.getText();
        //Convertir un campo String en entero
        Monto5=  Integer.parseInt(Monto_tecleado);
        String credito = java.util.ResourceBundle.getBundle("views/Bundle").getString("I");
        saldo(nro_usuario);
        actualizar_Deposito(nro_usuario,Monto5,credito);
        actualizar_movimiento(nro_usuario,Monto5,credito);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        mostrar_datos(nro_usuario);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
    if(JtxtMontoOperacion.getText().equals(java.util.ResourceBundle.getBundle("views/Bundle").getString("")) && JtxtMontoOperacion.getText().equals(java.util.ResourceBundle.getBundle("views/Bundle").getString("")))
        {
        JOptionPane.showMessageDialog(null,java.util.ResourceBundle.getBundle("views/Bundle").getString("DEBES INGRESAR EL MONTO DE LA OPERACION"));
        }
       Integer Monto5;
       String Monto_tecleado;
       Monto_tecleado = JtxtMontoOperacion.getText();
       //Convertir un campo String en entero
        Monto5=  Integer.parseInt(Monto_tecleado);
        String debito = java.util.ResourceBundle.getBundle("views/Bundle").getString("E");
        saldo(nro_usuario);
        actualizar_Retiro(nro_usuario,Monto5,debito);
        actualizar_movimiento(nro_usuario,Monto5,debito);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void JtxtMontoOperacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtxtMontoOperacionKeyTyped
        // TODO add your handling code here:
        
        char cc = evt.getKeyChar();
        if(cc<'0'|| cc>'9') evt.consume();
    }//GEN-LAST:event_JtxtMontoOperacionKeyTyped

    private void jBsaldoactualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsaldoactualActionPerformed
    saldo_actual(nro_usuario);
    }//GEN-LAST:event_jBsaldoactualActionPerformed

    private void jTextClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextClaveActionPerformed

    private void jTextClaveNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextClaveNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextClaveNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String clave1=java.util.ResourceBundle.getBundle("views/Bundle").getString("");
        String clave2=java.util.ResourceBundle.getBundle("views/Bundle").getString("");
        clave1 = jTextClave.getText();
        clave2 = jTextClaveN.getText();
        if(clave1==java.util.ResourceBundle.getBundle("views/Bundle").getString("")&&clave2==java.util.ResourceBundle.getBundle("views/Bundle").getString("")){
            JOptionPane.showMessageDialog(null,java.util.ResourceBundle.getBundle("views/Bundle").getString("POR FAVOR INCORPORE LOS CAMPOS PARA ACTUALIZAR LA CLAVE"));
            
    }
        actualizar_clave(nro_usuario,clave1);
        jTextClave.setText(null);
        jTextClaveN.setText(null);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
      @FunctionalInterface
    public interface calcular{
        
        public abstract double operacion(double v1, double v2);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (java.util.ResourceBundle.getBundle("views/Bundle").getString("NIMBUS").equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OperacionesCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperacionesCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperacionesCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperacionesCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperacionesCajero().setVisible(true);
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JtxtMontoOperacion;
    private javax.swing.JToggleButton bttsalir3;
    private javax.swing.JButton jBsaldoactual;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLClaveNueva;
    private javax.swing.JLabel jLClaveNuevaR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextClave;
    private javax.swing.JTextField jTextClaveN;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables
 DataAccess cn = new DataAccess();
 Connection con = cn.connectToDB(); 


 
}
