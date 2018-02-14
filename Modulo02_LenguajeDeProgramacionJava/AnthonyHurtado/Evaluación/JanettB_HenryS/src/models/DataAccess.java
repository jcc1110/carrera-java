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
        boolean result = false;
        String sql;
        
        try {
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"' AND clave='"+ usuario.getClave() +"'";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                result = (rs.getString("tarjeta").equals(usuario.getTarjeta()) && rs.getString("clave").equals(usuario.getClave()));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return result;
    }
        public String ConsultarSaldo(User usuario) {
        String result = null;
        String sql;
        
        try {
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT saldo FROM cuenta WHERE tarjeta='"+ usuario.getTarjeta()+"'";
            System.out.println("Este es el sql de Consulta Saldo: "+sql);
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                result = rs.getString("saldo");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return result;
        
    }
        public boolean Retirar(User usuario, String monto) {
        boolean result = false;
        String sql;
        
        try {
            this.connectToDB();
            String nl = System.getProperty("line.separator");
            Statement sta = this.con.createStatement();
            sql = "UPDATE cuenta SET saldo = saldo -"+ monto+" WHERE tarjeta='"+ usuario.getTarjeta()+"'";
            System.out.println("Este es el sql del UPDATE Saldo: "+sql);
            Statement pstmt = this.con.prepareStatement(sql);
            pstmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Retiro Satisfactorio"
                    +nl+"Para Verificar la Operación Pulse Botón <Consultar Saldo> ");
            result=true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }        
        public boolean Depositar(User usuario, String monto) {
        boolean result = false;
        String sql;
        
        try {
            this.connectToDB();
            String nl = System.getProperty("line.separator");
            Statement sta = this.con.createStatement();
            sql = "UPDATE cuenta SET saldo = saldo +"+ monto+" WHERE tarjeta='"+ usuario.getTarjeta()+"'";
            System.out.println("Este es el sql del UPDATE Saldo: "+sql);
            Statement pstmt = this.con.prepareStatement(sql);
            pstmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Depósito Satisfactorio"
                    +nl+"Para Verificar la Operación Pulse Botón <Consultar Saldo> ");
            result=true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
        
    }        public boolean CambiarClave(User usuario, String monto) {
        boolean result = false;
        String sql;
        
        try {
            this.connectToDB();
            String nl = System.getProperty("line.separator");
            Statement sta = this.con.createStatement();
            sql = "UPDATE usuario SET clave = '"+ monto+"' WHERE tarjeta='"+ usuario.getTarjeta()+"'";
            System.out.println("Este es el sql del UPDATE Saldo: "+sql);
            Statement pstmt = this.con.prepareStatement(sql);
            pstmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Cambio de Clave Satisfactorio"
                    +nl+"Debe Ingresar de Nuevo con su Nueva Clave");
            result=true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
        
    }
}