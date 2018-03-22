package controllers;


import controllers.*;
import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

@Named(value = "afiliacion")
@ApplicationScoped
public class afiliacion implements Serializable {
    // Atributos
    private static final long serialVersionUID = 1L;
    private String account;
    private String description;

    // Métodos
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String grabar() {
    String result = null;

    return result;
    }
}