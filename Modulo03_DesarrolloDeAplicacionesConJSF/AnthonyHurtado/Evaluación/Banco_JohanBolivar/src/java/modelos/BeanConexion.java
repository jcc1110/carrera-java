/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import modelos.cuentas;
/**
 *
 * @author JOHAN
 */
@Named(value = "beanConexion")
@ApplicationScoped
public class BeanConexion implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private double saldo;
    private String usuario;
    private String clave;
    
    
    // Atributos cuentas
    private String num_cuenta;
    private String nombre;
    private String cedula;
    private String correo;

    /**
     * @return the num_cuenta
     */
    public String getNum_cuenta() {
        return num_cuenta;
    }

    /**
     * @param num_cuenta the num_cuenta to set
     */
    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    //fin atributos cuenta
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    Connection con;
    
    public void connectToDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mibanco", "root", "pepegrillo");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
        
    
    public boolean validar() {
        boolean result = false;
        String sql;
        
        try {
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM `tab_login`, tab_clientes where tab_clientes.fld_co_cliente = tab_login.`fld_co_cliente` and tab_login.fld_usuario = '"+ this.getUsuario() +"' and tab_login.fld_clave = '"+ this.getClave() +"'";            
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                //id_usuario = rs.getString("id_usuario");
                result = true;
               
                    HttpSession session = this.getCurrentSession();
                    session.setAttribute("username", rs.getString("fld_co_cliente"));
               
            }
            
            if (result == false){
                    FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_WARN, "Usuario o contraseña incorrectos", "");
                    FacesContext.getCurrentInstance().addMessage(null, fm);
            }
            
        } catch (SQLException ex) {
            result = false;   
        }
        
        return result;
    }
    public List<movimientos> Movimientos(int id_usuario){
        String sql;
        List<movimientos> listaMovimiento = new ArrayList<>();
        
        try{
            this.connectToDB();
            Statement sta = this.con.createStatement();
            
            sql="SELECT * FROM  `tab_movimientos` AS a, tab_clientes AS b, tab_ctas_afiliadas AS c WHERE a.fld_co_cliente = b.fld_co_cliente AND a.fld_co_cuenta = c.fld_co_cuenta AND b.fld_co_cliente = '"+ id_usuario + "'";
            ResultSet rs = sta.executeQuery(sql);
            while(rs.next()) {
                movimientos mov = new movimientos(rs.getString("fld_tipo"),rs.getDouble("fld_monto"),rs.getInt("fld_co_cliente"),rs.getString("fld_concepto"));
                listaMovimiento.add(mov);                                
            }
        }catch(SQLException ex){
             System.out.println(ex.getMessage());
        }
        return listaMovimiento;
    }
    
    public int cambiarClave(String usuario, String clave) {
        int rsClave = 0;
        String sql;
        try {
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "update usuario set clave = '"+ clave + "'WHERE tarjeta='"+ usuario +"'";
            rsClave = sta.executeUpdate(sql);            
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rsClave;
        
        //sql="select sum(monto) from movimiento where id_usuario='1' group by tipo_movimiento"; //"+ id_usuario + "'";
    }
    public double verSaldo(String usuario, String clave) {
        double result = 0;
        String sql;
        
        try {
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario +"' AND clave='"+ clave +"'";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                //id_usuario = rs.getString("id_usuario");
                result = rs.getDouble("saldo");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return result;
    }
    public double Deposito(String usuario, String clave,String monto,char operacion) {
        int rsDepositoRetiro = 0;
        int id_usuario =0;
        double saldo=0;
        String sql;
        try {
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario +"' AND clave='"+ clave +"'";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                id_usuario = rs.getInt("id");
                saldo = rs.getDouble("saldo")+ Double.parseDouble(monto);
                System.out.println(saldo);
            } 
            sql = "INSERT INTO movimiento (id_usuario,tipo_movimiento,monto) values ('"+ id_usuario +"','"+ operacion +"','"+ monto +"')";
            System.out.println(sql);
            rsDepositoRetiro = sta.executeUpdate(sql);            
            sql = "Update usuario SET saldo= '"+ saldo +"' WHERE id = '"+id_usuario+"'";
            System.out.println(sql);
            rsDepositoRetiro = sta.executeUpdate(sql);            
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rsDepositoRetiro;
    }
    public double Retiro(String usuario,String clave,String monto,char operacion) {
        int rsDepositoRetiro = 0;
        int id_usuario =0;
        double saldo=0;
        String sql;
        try {
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario +"' AND clave='"+ clave +"'";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                id_usuario = rs.getInt("id");
                saldo = rs.getDouble("saldo")- Double.parseDouble(monto);
                System.out.println(saldo);
            } 
            sql = "INSERT INTO movimiento (id_usuario,tipo_movimiento,monto) values ('"+ id_usuario +"','"+ operacion +"','"+ monto +"')";
            System.out.println(sql);
            rsDepositoRetiro = sta.executeUpdate(sql);            
            sql = "Update usuario SET saldo= '"+ saldo +"' WHERE id = '"+id_usuario+"'";
            System.out.println(sql);
            rsDepositoRetiro = sta.executeUpdate(sql);            
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rsDepositoRetiro;
    }
    public boolean agregarCuenta(int usuario) {
        int rsDepositoRetiro = 0;
        boolean result= false;
        String sql;
        try {
            cuentas cta = new cuentas();
            this.connectToDB();
            Statement sta = this.con.createStatement(); 
            sql = "INSERT INTO tab_ctas_afiliadas (fld_num_cta,fld_nombre,fld_cedula,fld_correo,fld_co_cliente) values ('"+ this.getNum_cuenta() +"','"+ this.getNombre() +"','"+ this.getCedula() +"','"+ this.getCorreo() +"','"+ usuario +"')";
            System.out.println(sql);
            rsDepositoRetiro = sta.executeUpdate(sql);
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_WARN, "La cuenta ha sido agregada con éxito", "");
            FacesContext.getCurrentInstance().addMessage(null, fm);
            result = true; 
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_WARN, ex.getMessage(), "");
            FacesContext.getCurrentInstance().addMessage(null, fm);
        }
        return result;
    }
    
     public HttpSession getCurrentSession() {
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }
    
}
