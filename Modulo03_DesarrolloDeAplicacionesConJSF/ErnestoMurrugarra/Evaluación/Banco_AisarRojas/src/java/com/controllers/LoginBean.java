package com.controllers;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Aisar Rojas.
 * Proyecto: Módulo 3 de Java
 * @version 1.0
 */

@ManagedBean
@Named(value = "lb")
@ApplicationScoped
public class LoginBean implements Serializable {
    //Atributos
    private static final long serialVersionUID = 1L;
    private String usuario;
    private String clave;
    
    //Métodos
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
    
           public String login() {
        String resultado;
        
        if ("aisarx".equals(this.getUsuario().toLowerCase()) && "123456".equals(this.getClave().toLowerCase())) {
            resultado = "exito";
            HttpSession session = this.getCurrentSession();
            session.setAttribute("usuario", this.getUsuario());
        } else {
            resultado = "error";
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario o contraseña incorrectos", "");
            FacesContext.getCurrentInstance().addMessage(null, fm);            
        }
        
        return resultado;
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
