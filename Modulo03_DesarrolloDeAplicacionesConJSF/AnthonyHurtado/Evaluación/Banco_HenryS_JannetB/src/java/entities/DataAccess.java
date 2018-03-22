package entities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import structure.MyExceptions;

public class DataAccess {
    Connection con;
    
    public void connectToDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e_cajero_bd", "root", "");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
        
    public Usuario validar(Usuario usuario) throws MyExceptions {
        String sql;
        try{
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE usr_id='"+ usuario.getUsrId() +"' AND usr_clave='"+ usuario.getUsrClave() +"'";
  
          ResultSet rs = sta.executeQuery(sql);            
            if(rs.next()) {
                usuario.setUsrId(rs.getString("usr_Id"));
                usuario.setUsrCedula(rs.getString("usr_Cedula"));
                usuario.setUsrNombre(rs.getString("nombre"));                
                usuario.setUsrClave(rs.getString("usr_clave"));

            } else {
                throw new MyExceptions("Login Fail");
            }
                
            }
        catch (SQLException ex) {
                            throw new MyExceptions("Login Fail");
        }
        
        return usuario;
    }
        public String ConsultarSaldo(Usuario usuario) {
        String result = null;
        String sql;
        
        try {
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT saldo FROM cuenta WHERE tarjeta='"+ usuario.getUsrId() +"'";
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
        public boolean Retirar(Usuario usuario, String monto) {
        boolean result = false;
        String sql;
        
        try {
            this.connectToDB();
            String nl = System.getProperty("line.separator");
            sql = "UPDATE cuenta SET saldo = saldo -"+ monto+" WHERE tarjeta='"+ usuario.getUsrId() +"'";
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
        public boolean Depositar(Usuario usuario, String monto) {
        boolean result = false;
        String sql;
        
        try {
            this.connectToDB();
            String nl = System.getProperty("line.separator");
            sql = "UPDATE cuenta SET saldo = saldo +"+ monto+" WHERE tarjeta='"+ usuario.getUsrId() +"'";
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
        
    }        public boolean CambiarClave(Usuario usuario, String monto) {
        boolean result = false;
        String sql;
        
        try {
            this.connectToDB();
            String nl = System.getProperty("line.separator");
            Statement sta = this.con.createStatement();
            sql = "UPDATE usuario SET clave = '"+ monto+"' WHERE tarjeta='"+ usuario.getUsrId() +"'";
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
        public Afiliacion ConsultarNroCuenta(Afiliacion afiliacion) throws MyExceptions {
        String sql;
        
        try {
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM afiliacion WHERE nro_cuenta='"+ afiliacion.getNro_cuenta() +"'";
            System.out.println("Este es el sql de Consulta Saldo: "+sql);
            ResultSet rs = sta.executeQuery(sql);
            if(rs.next()) {
                afiliacion.setNro_cuenta(rs.getString("nro_cuenta"));
                afiliacion.setCta_tipo(rs.getString("cta_tipo"));
                afiliacion.setBanco(rs.getString("banco"));
                afiliacion.setUsr_id(rs.getString("usr_id"));
                afiliacion.setNombre(rs.getString("nombre"));
                System.out.println("Este es el resultado del query: "+rs.getString("nombre"));

            } else {
                throw new MyExceptions("Cuenta Invalida");
            }
                
            }
        catch (SQLException ex) {
                            throw new MyExceptions("Cuenta Invalida");
        }
        
        return afiliacion;
    
    }
    public Connection getCon() {
        return con;
    }    
}