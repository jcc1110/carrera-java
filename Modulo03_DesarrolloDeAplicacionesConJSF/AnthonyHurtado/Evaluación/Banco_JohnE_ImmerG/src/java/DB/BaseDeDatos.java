/**
 *
 * @author John Erice / Immer Gonzalez
 * Proyecto modulo 3 de Java
 * @version 1.0
 */

package DB;
/**
 *
 * Conexion a la Base de Datos Mysql
 * 
 * 
 */ 
import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDeDatos {

    private Connection cn;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public void Conectar() throws Exception {
   
        try {
            Class.forName("com.mysql.jdbc.driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdbancoenlinea","root","");
            System.out.println("Conectado a la base de datos");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    

    public void Cerrar() throws Exception {
        try {
            if (cn != null) {
                if (cn.isClosed() == false) {
                    cn.close();
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
