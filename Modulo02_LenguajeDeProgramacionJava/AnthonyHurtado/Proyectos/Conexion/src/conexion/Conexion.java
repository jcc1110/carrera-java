package conexion;
import java.sql.*;

public class Conexion {
    public static void main(String[] args) {   
        
        try {
            System.out.println("Conectando...");
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");                        
            System.out.println("Conexión exitosa");
            
            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery("SELECT * FROM Usuario");
            
            while(rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("nombre") + " - " + rs.getString("clave"));
            }
            
            int resultado = sta.executeUpdate("INSERT INTO Usuario (id, nombre, clave) VALUES (4, '3dsfdsf', '1234')");
            System.out.println("Registro " + resultado);
            
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } catch (ClassNotFoundException ce) {
            System.out.println(ce.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
