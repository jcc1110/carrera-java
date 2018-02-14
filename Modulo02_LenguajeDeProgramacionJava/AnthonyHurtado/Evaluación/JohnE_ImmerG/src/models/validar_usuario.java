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

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import structures.I_ValidarUsuario;
import models.validar_usuario;
        
 /**
 *
 * Permite validar el usuario
 * 
 */

public class validar_usuario
{

    void validar_usuario(String nro_tarjeta,String clav){
{
    System.out.println(nro_tarjeta);
    System.out.println(clav);
        boolean result = false;
        String result1;
        String sql;     
        sql = java.util.ResourceBundle.getBundle("views/Bundle").getString("SELECT * FROM BDBANCO.USUARIO WHERE NRO_TARJETA='12345'");
       Connection con = null;
           try {
                @SuppressWarnings("null")
                Statement ste = con.createStatement();
                ResultSet rs = ste.executeQuery(sql);            
                while(rs.next()) {
                result1 = (rs.getString("clave_usuario"));
                }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
} 

}

}


