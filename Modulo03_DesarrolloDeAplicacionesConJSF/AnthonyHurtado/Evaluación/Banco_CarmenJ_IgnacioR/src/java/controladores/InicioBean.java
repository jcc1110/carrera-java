/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author VP50403
 */
@Named(value = "inicioBean")
@ApplicationScoped
public class InicioBean implements Serializable {
    
    // Atributos
    private static final long serialVersionUID = 1L;
    private String usuario;
    private String clave;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Creates a new instance of InicioBean
     */
    public String entrada() {
           String result;

        if ("thais".equals(this.getUsuario().toLowerCase()) && "11921578".equals(this.getClave().toLowerCase())) {
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
    
    public String salida() {
        HttpSession session = this.getCurrentSession();
        session.removeAttribute("usuario");
        session.invalidate();
        return "login";
    }
    
    public HttpSession getCurrentSession() {
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }   
    
}
