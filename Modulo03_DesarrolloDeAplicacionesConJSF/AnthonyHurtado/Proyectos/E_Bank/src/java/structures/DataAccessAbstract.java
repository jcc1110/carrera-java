package structures;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DataAccessAbstract {
    private Connection connection;
    
    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
