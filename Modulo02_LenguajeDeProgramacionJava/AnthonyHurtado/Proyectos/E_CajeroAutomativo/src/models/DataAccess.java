package models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataAccess {
    // Atributos
    private Connection con;
    
    public DataAccess() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public User validateUser(String card, String password) {
        // Variables necesarias
        User user = new User();
        String sql;
        
        try {
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ card +"' AND clave='"+ password +"'";
            ResultSet rs = sta.executeQuery(sql);
            if (rs.first()) {
                user.setId(rs.getInt("id"));
                user.setTarjeta(rs.getString("tarjeta"));
                user.setClave(rs.getString("clave"));
                user.setSaldo(rs.getDouble("saldo"));
            } else {
                user = null;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        // Devuelvo el objeto del Usuario
        return user;
    }
    
    public double balanceUser(int idUser) {
        // Variables necesarias
        String sql;
        double balance = 0;
        
        try {
            Statement sta = this.con.createStatement();
            sql = "SELECT saldo FROM usuario WHERE id="+ idUser;
            ResultSet rs = sta.executeQuery(sql);
            if (rs.first()) {
                balance = rs.getDouble("saldo");
            } else {
                balance = 0;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        // Devuelvo el objeto del Usuario
        return balance;
    }
    
    public boolean depositRetirementUser(int idUser, String type, double amount) {
        // Variables necesarias
        String sql;
        boolean response = false;
        double balance;
        
        try {
            Statement sta = this.con.createStatement();
            
            // Consulta el Saldo actual
            sql = "SELECT saldo FROM usuario WHERE id="+ idUser;
            ResultSet rs = sta.executeQuery(sql);
            rs.first();
            balance = rs.getDouble("saldo");
            
            // Inserto el depósito
            sql = "INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES ("+ idUser +",'"+ type +"',"+ amount +")";
            int executeUpdateM = sta.executeUpdate(sql);
            
            // Actualizar el Saldo
            if (type.equals("I")) {
                balance = balance + amount;
            } else {
                balance = balance - amount;
            }
            sql = "UPDATE usuario SET saldo="+ balance +" WHERE id="+ idUser;
            int executeUpdateU = sta.executeUpdate(sql);
            
            // Valido respuesta
            response = (executeUpdateM == 1 && executeUpdateU == 1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        // Devuelvo el objeto del Usuario
        return response;   
    }
    
    public boolean changePassUser(int idUser, String newPassword) {
        // Variables necesarias
        String sql;
        boolean response = false;
        
         try {
            Statement sta = this.con.createStatement();
            
            // Actualizar el Saldo
            sql = "UPDATE usuario SET clave='"+ newPassword +"' WHERE id="+ idUser;
            int executeUpdate = sta.executeUpdate(sql);
            
            // Valido respuesta
            response = (executeUpdate == 1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        // Devuelvo el objeto del Usuario
        return response; 
    }
}
