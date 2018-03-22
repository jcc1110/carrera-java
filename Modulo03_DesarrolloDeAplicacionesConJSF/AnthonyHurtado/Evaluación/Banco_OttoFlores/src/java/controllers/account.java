package controllers;


import controllers.*;
import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

@Named(value = "account")
@ApplicationScoped
public class account implements Serializable {
    // Atributos
    private static final long serialVersionUID = 1L;
    private String accounto;
    private String accountd;
    private String amount;

    // Métodos
    public String getAccounto() {
        return accounto;
    }

    public void setAccounto(String accounto) {
        this.accounto = accounto;
    }

    public String getAccountd() {
        return accountd;
    }

    public void setAccountd(String accountd) {
        this.accountd = accountd;
    }
    
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    public String transferir() {
    String result = null;

    return result;
    }
}