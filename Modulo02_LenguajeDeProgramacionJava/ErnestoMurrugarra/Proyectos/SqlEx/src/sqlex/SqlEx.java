/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author instructor
 */
public class SqlEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        try {
             // Declaración del driver JDBC
            String driver = "org.mariadb.jdbc.Driver";

            String url = "jdbc:mysql://localhost/java_example";
            // Verificamos que el driver exista
            Class.forName(driver);
            
            // Creamos la conexión
            Connection conn = DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SqlEx.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SqlEx.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
