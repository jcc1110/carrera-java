package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Edgar Contreras
 */
public class AccessData {
    //Atributos
    public static int num;//este en particular se hace estatico para poder ser accedido de donde 
    //sea y sin instanciar, ademas de ser un valor de clase
    private Connection con;
    private String mensaje;
        
        public AccessData(){
        try{  
            //Conexion a la base de datos.
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");    
            
        }catch(Exception e){
            System.out.println("NO CONECTA!!");
            e.printStackTrace();
        }
        
        }
        
        /**
         * 
         * @param tarjeta
         * @param clave
         * @param sql
         * @return Un String el cual concatena los datos que solicita la consulta
         */
        public String consulta(int tarjeta, int clave, String sql){

        try{
            //Instancia para consultas sql preparadas
            PreparedStatement miSentencia = con.prepareStatement(sql);
           
            miSentencia.setInt(1, tarjeta);
            miSentencia.setInt(2, clave);
         
            ResultSet rs = miSentencia.executeQuery();
            
            while(rs.next()){
                mensaje = "Su saldo actual es "+rs.getString("saldo");
                num = rs.getInt("saldo");//Esto se almacena aqui para poseer una referencia al saldo despues de consultar
            }
            
            rs.close();
            
        }catch(Exception e){
            System.out.println("NO CONECTA!!");
            e.printStackTrace();
        }
        return mensaje;
        }
        
        /**
         * Este metodo recibe su nombre del tipo de consulta que hace(se encarga 
         * de manejar tanto el deposito, retiro, como el cambio de clave)
         * @param tarjeta el numero de tarjeta ya antes itroduccido en la MainFrame al registrarse(es decir qeu este valor ya existe en mrmoria y no debe ser cargado nuevamente)
         * @param clave la clave ya antes itroduccido en la MainFrame al registrarse(es decir qeu este valor ya existe en mrmoria y no debe ser cargado nuevamente)
         * @param sql la sentencia SQL a ejecutar(esta debe ser de Actualizacion)
         */
        public void update(int tarjeta, int clave, String sql){

        try{
            Statement st = con.createStatement();
         
            st.executeUpdate(sql);
            
        }catch(Exception e){
            System.out.println("NO CONECTA!!");
            e.printStackTrace();
        }
        }

        //Metodo que retorna si existe un usuario en coherencia con lso datos suministrados
        public boolean validar(User u){
            boolean bandera = false;
            try{
                PreparedStatement miSentencia = con.prepareStatement("SELECT * FROM usuario WHERE tarjeta=? AND clave=?");
                miSentencia.setInt(1,u.getTarjeta());
                miSentencia.setInt(2,u.getClave());
                ResultSet rs = miSentencia.executeQuery();
                bandera = rs.next();//Aqui se registra si existe algun elemento, se no existir no hay ningun registro con los datos antes dados
        
            }catch(Exception e){
                e.getMessage();
            }
            return bandera;
        }
    
    
}
