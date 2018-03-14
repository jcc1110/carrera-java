package controllers;


import controllers.*;
import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

@Named(value = "person")
@ApplicationScoped
public class person implements Serializable {
    // Atributos
    private static final long serialVersionUID = 1L;
    private String fname;
    private String lname;
    private String ci;

    // Métodos
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    
    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
    
    public String actualizar() {
    String result = null;

    return result;
    }
}