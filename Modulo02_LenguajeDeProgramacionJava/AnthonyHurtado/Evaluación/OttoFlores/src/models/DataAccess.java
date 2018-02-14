package models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DataAccess {
    Connection con;
    
    public void connectToDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
        
    public boolean validar(User usuario) {
        boolean respuesta = false;
        String sql;
        
        try {
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"' AND clave='"+ usuario.getClave() +"'";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                respuesta = (rs.getString("tarjeta").equals(usuario.getTarjeta()) && rs.getString("clave").equals(usuario.getClave()));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return respuesta;
    }
    public boolean consultar(User usuario) {
        boolean respuesta = false;
        String sql;
        try {
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"' AND clave='"+ usuario.getClave() +"'";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("tarjeta") + " - " + rs.getString("clave") + " - " + rs.getString("saldo"));
                JOptionPane.showMessageDialog(null, "Su saldo es:" + rs.getString("saldo"));
                respuesta=true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return respuesta;
    }     
    public boolean depositar(User usuario, String deposito) {
        boolean respuesta = false;
        String sql;
        
        try {
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"' AND clave='"+ usuario.getClave() +"'";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                // ACTUALIZO EL SALDO DE LA TABLA USUARIO
                sql = "UPDATE usuario SET saldo = saldo +" + deposito + " WHERE tarjeta='" + usuario.getTarjeta() + "'";
                System.out.println(sql);
                Statement update = this.con.prepareStatement(sql);
                update.executeUpdate(sql);                
                // INSERTO EL MOVIMIENTO EN LA TABLA MOVIMIENTO
                sql = "INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES (" + rs.getString("id") + ", 'I', '" + deposito + "')";
                System.out.println(sql);
                int insert = sta.executeUpdate(sql);
            
                JOptionPane.showMessageDialog(null, "Su saldo ha sido actualizado - Deposito Exitoso");
                respuesta=true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return respuesta;
    }
    public boolean retirar(User usuario, String retiro) {
        boolean respuesta = false;
        String sql;
        
        try {
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"' AND clave='"+ usuario.getClave() +"'";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                // ACTUALIZO EL SALDO DE LA TABLA USUARIO
                sql = "UPDATE usuario SET saldo = saldo -" + retiro + " WHERE tarjeta='" + usuario.getTarjeta() + "'";
                System.out.println(sql);
                Statement update = this.con.prepareStatement(sql);
                update.executeUpdate(sql);                
                // INSERTO EL MOVIMIENTO EN LA TABLA MOVIMIENTO
                sql = "INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES (" + rs.getString("id") + ", 'E', '" + retiro + "')";
                System.out.println(sql);
                int insert = sta.executeUpdate(sql);
            
                JOptionPane.showMessageDialog(null, "Su saldo ha sido actualizado - Retiro Exitoso");
                respuesta=true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return respuesta;
    } 
    public boolean cambiar(User usuario, String nuevaclave) {
        boolean respuesta = false;
        String sql;
        
        try {
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"' AND clave='"+ usuario.getClave() +"'";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                // ACTUALIZO EL SALDO DE LA TABLA USUARIO
                sql = "UPDATE usuario SET clave='"+ nuevaclave + "' WHERE tarjeta='" + usuario.getTarjeta() + "'";
                System.out.println(sql);
                Statement update = this.con.prepareStatement(sql);
                update.executeUpdate(sql);                
           
                JOptionPane.showMessageDialog(null, "Su clave ha sido cambiada exitosamente");
                respuesta=true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return respuesta;
    }    
}
