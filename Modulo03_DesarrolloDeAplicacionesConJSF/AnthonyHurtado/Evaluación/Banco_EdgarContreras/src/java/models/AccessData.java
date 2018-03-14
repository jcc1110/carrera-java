/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.LoginBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edgar
 */
public class AccessData {
    //Atributos
    public static int num;//este en particular se hace estatico para poder ser accedido de donde 

    public List<Movimientos> getLstMov() {
        return lstMov;
    }

    public static void setLstMov(List<Movimientos> aLstMov) {
        lstMov = aLstMov;
    }
    //sea y sin instanciar, ademas de ser un valor de clase
    private Connection con;
    private PreparedStatement miSentencia;
    private static List<Movimientos> lstMov;
    private Movimientos movIn;
    private static User u ;
    
        
        public AccessData() throws ClassNotFoundException{
        try{  
            //Conexion a la base de datos.
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank1", "root", "");  
            System.out.println("Conecto");
            
        }catch(SQLException e){
            System.out.println("NO CONECTA!!");
            e.printStackTrace();
        }
        
    }
        
        public String consulta(String sql){
            String mensaje="";

        try{
            //Instancia para consultas sql preparadas
            Statement st = con.createStatement();
           
         
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                mensaje = "Su saldo es "+rs.getString("saldo");
                num = rs.getInt("saldo");//Esto se almacena aqui para poseer una referencia al saldo despues de consultar
            }
            
            rs.close();
            
        }catch(SQLException e){
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
        public void update(String sql){

        try{
            Statement st = con.createStatement();
         
            st.executeUpdate(sql);
            
        }catch(SQLException e){
            System.out.println("NO CONECTA!!");
            e.printStackTrace();
        }
        }

        //Metodo que retorna si existe un usuario en coherencia con lso datos suministrados
        public boolean validar(int tarjeta, int clave){
            
            boolean bandera = false;
            try{
               
                
                
                miSentencia = con.prepareStatement("SELECT * FROM usuario WHERE tarjeta=? AND clave=?");
                miSentencia.setInt(1,tarjeta);
                miSentencia.setInt(2,clave);
                ResultSet rs = miSentencia.executeQuery();
                bandera = rs.next();//Aqui se registra si existe algun elemento, se no existir no hay ningun registro con los datos antes dados
        
            }catch(SQLException e){
                e.getMessage();
            }
            return bandera;
    }

    /**
     *
     * @param tarjeta
     * @param cedula
     * @return
     * @throws java.sql.SQLException
     */
    public User afiliarUser1(int tarjeta, int cedula) throws SQLException{
        ResultSet rs = null;
            
            boolean bandera = false;
            try{                
                miSentencia = con.prepareStatement("SELECT * FROM usuario WHERE tarjeta=? AND cedula=?");
                miSentencia.setInt(1,tarjeta);
                miSentencia.setInt(2,cedula);
                rs = miSentencia.executeQuery();
                bandera = rs.next();//Aqui se registra si existe algun elemento, se no existir no hay ningun registro con los datos antes dados
        
            }catch(SQLException e){
                e.getMessage();
            }
            
            u = new User();
            if(bandera){
            u.setID(rs.getInt("id"));
            u.setCedula((rs.getInt("cedula")));
            u.setNombre(rs.getString("nombre"));
            u.setTarjeta(rs.getInt("tarjeta"));
            u.setClave(rs.getInt("clave"));
            }
            System.out.println(tarjeta+" "+cedula+" "+bandera);
            System.out.println(u);
            return u;
    }
    public void afiliarUser2(User u) throws SQLException{
        ResultSet rs = null;
        LoginBean lgb = new LoginBean();
            
            boolean bandera = false;
            try{                
                miSentencia = con.prepareStatement("INSERT INTO afiliados VALUES(?,?,?)");
                miSentencia.setInt(1,lgb.getId());
                miSentencia.setString(2,u.getNombre());
                miSentencia.setInt(3,u.getCedula());
                miSentencia.executeUpdate();
                System.out.println(u);
            }catch(SQLException e){
                e.getMessage();
            }
    }
    
    
        public void Listar(String sql) throws SQLException{
            
            try{
            //Instancia para consultas sql preparadas
            Statement st = con.createStatement();
           
            lstMov = new ArrayList();
            movIn = new Movimientos();
            ResultSet rs = st.executeQuery(sql);
            
            lstMov= movIn.resultSetToArrayList(rs);
           
            rs.close();
        }catch(SQLException e){
            System.out.println("NO CONECTA!!");
            e.printStackTrace();
        }
    
    }
        public int validarId(int tarjeta, int clave){
            int resultado=0;
            boolean bandera = false;
            try{
                
                
                
                miSentencia = con.prepareStatement("SELECT id FROM usuario WHERE tarjeta=? AND clave=?");
                miSentencia.setInt(1,tarjeta);
                miSentencia.setInt(2,clave);
                ResultSet rs = miSentencia.executeQuery();
                
                bandera = rs.next();//Aqui se registra si existe algun elemento, se no existir no hay ningun registro con los datos antes dados
                resultado = rs.getInt("id");
            }catch(SQLException e){
                e.getMessage();
            }
            return resultado;
    }
}
