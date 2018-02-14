/**
 *
 * @author John Erice / Immer Gonzalez
 * Proyecto modulo 2 de Java
 * @version 1.0
 */
package models;
/**
 *
 * Importacion de Librerias y paquetes
 * 
 * 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 /**
 *
 * Permite conectarse a la Base de datos
 * 
 */
public class DataAccess {
    Connection con;
    Statement sta;
        public Connection connectToDB() {
        try {
            Class.forName(java.util.ResourceBundle.getBundle("views/Bundle").getString("COM.MYSQL.JDBC.DRIVER"));
            con = DriverManager.getConnection(java.util.ResourceBundle.getBundle("views/Bundle").getString("JDBC:MYSQL://LOCALHOST:3306/BDBANCO"),java.util.ResourceBundle.getBundle("views/Bundle").getString("ROOT"),java.util.ResourceBundle.getBundle("views/Bundle").getString("JOHN250100"));
       if(con!=null){
    //   System.out.println("conexion establecida");
  
        }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            System.out.println(java.util.ResourceBundle.getBundle("views/Bundle").getString("EXISTEN PROBLEMAS EN LA CONEXION"));
        } return(con);
    }
        
}

