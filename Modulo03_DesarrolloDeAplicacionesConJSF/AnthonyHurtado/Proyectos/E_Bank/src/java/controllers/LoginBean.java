package controllers;
import db.DataAccessPerson;
import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

@Named(value = "loginBean")
@ApplicationScoped
public class LoginBean implements Serializable {
    // Atributos
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private DataAccessPerson dap;

    // Métodos
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String login() {
        String result;
        boolean isUser;
        dap = new DataAccessPerson();
        
        System.out.println(this.getUsername() + " - " + this.getPassword());
        
        // Valido el usuario ingresado
        isUser = dap.validateUser(this.getUsername(), this.getPassword());
        
        if (isUser) {
            result = "success";
            HttpSession session = this.getCurrentSession();
            session.setAttribute("username", this.getUsername());
        } else {
            result = "error";
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario o contraseña incorrectos", "");
            FacesContext.getCurrentInstance().addMessage(null, fm);            
        }

        return result;
    }
    
    public String logout() {
        HttpSession session = this.getCurrentSession();
        session.removeAttribute("username");
        session.invalidate();
        return "login";
    }
    
    public HttpSession getCurrentSession() {
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }
}
