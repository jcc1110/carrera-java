package structures;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DataAccessAbstract {
    private Connection con;
    
    public DataAccessAbstract() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
}
