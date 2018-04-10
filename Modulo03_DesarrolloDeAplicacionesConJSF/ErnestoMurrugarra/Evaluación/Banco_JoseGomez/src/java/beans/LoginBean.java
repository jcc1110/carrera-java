/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

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
    private String Usuario;
    private String Clave;

    // Métodos

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }
 
    
    public String login() {
        String result;

        if ("jgomez".equals(this.getUsuario().toLowerCase()) && "12345678".equals(this.getClave().toLowerCase())) {
            result = "success";
            HttpSession session = this.getCurrentSession();
            session.setAttribute("usuario", this.getUsuario());
        } else {
            result = "error";
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_WARN, "Usuario o contraseña incorrectos", "");
            FacesContext.getCurrentInstance().addMessage(null, fm);            
        }

        return result;
    }
    
    public String logout() {
        HttpSession session = this.getCurrentSession();
        session.removeAttribute("usuario");
        session.invalidate();
        return "login";
    }
    
    public HttpSession getCurrentSession() {
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }
}
