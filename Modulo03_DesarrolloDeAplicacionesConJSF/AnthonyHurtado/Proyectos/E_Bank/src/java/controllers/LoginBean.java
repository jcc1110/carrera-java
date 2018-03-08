package controllers;
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

        if ("anthony".equals(this.getUsername().toLowerCase()) && "123456".equals(this.getPassword().toLowerCase())) {
            result = "success";
            HttpSession session = this.getCurrentSession();
            session.setAttribute("username", this.getUsername());
        } else {
            result = "error";
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_WARN, "Usuario o contraseña incorrectos", "");
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
