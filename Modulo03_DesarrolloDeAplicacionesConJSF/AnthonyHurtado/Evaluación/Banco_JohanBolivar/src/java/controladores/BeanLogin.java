package controladores;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import modelos.BeanConexion;

@Named(value = "beanLogin")
@ApplicationScoped
public class BeanLogin implements Serializable{
    
   Connection con;
    
    public void connectToDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mibanco", "root", "");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
        
    /*public String login() {
        String result = null;
        String sql;
        
        try {
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM `tab_login`, tab_clientes where tab_clientes.fld_co_cliente = tab_login.`fld_co_cliente` and tab_login.fld_usuario = '"+ this.getUsuario() +"' and tab_login.fld_clave = '"+ this.getClave() +"'";            
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                //id_usuario = rs.getString("id_usuario");
                if (rs.getString("fld_usuario").equals(this.getUsuario()) && rs.getString("fld_clave").equals(this.getClave())){
                    result = "confirmado";                  
                    HttpSession session = this.getCurrentSession();
                    session.setAttribute("username", this.getUsuario());
                }else {
                    result = "error";
                    FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_WARN, "Usuario o contraseña incorrectos", "");
                    FacesContext.getCurrentInstance().addMessage(null, fm);
                }    
            }
        } catch (SQLException ex) {
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_WARN, "Usuario o contraseña incorrectos", "");
            FacesContext.getCurrentInstance().addMessage(null, fm);    
        }
        
        return result;
    }*/
   
    /*public String login() {
        String result = null;
        
        if ("johan".equals(this.getUsuario().toLowerCase()) && "1234".equals(this.getClave().toLowerCase())) {
            result = "confirmado";
            HttpSession session = this.getCurrentSession();
            session.setAttribute("username", this.getUsuario());
        } else {
            result = "error";
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_WARN, "Usuario o contraseña incorrectos", "");
            FacesContext.getCurrentInstance().addMessage(null, fm);            
        }
        return result;*/

    private HttpSession getCurrentSession() {
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }
    
    public String logout() {
        HttpSession session = this.getCurrentSession();
        session.removeAttribute("username");
        session.invalidate();
        return "login";
    }
    
   

  
    
}
