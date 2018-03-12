package structures;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
    
    public int executeMySQL(String sql) {
        int result = 0;
        
        try {
            Statement sta = this.getConnection().prepareStatement(sql);
            result = sta.executeUpdate(sql);
        } catch(SQLException se) {
            System.out.println(se.getMessage());
        }
        
        return result;
    }
    
    public ResultSet executeWithResult(String sql) {
        ResultSet result = null;
        
        try {
            Statement sta = this.getConnection().prepareStatement(sql);
            result = sta.executeQuery(sql);
        } catch(SQLException se) {
            System.out.println(se.getMessage());
        } 
        
        return result;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
