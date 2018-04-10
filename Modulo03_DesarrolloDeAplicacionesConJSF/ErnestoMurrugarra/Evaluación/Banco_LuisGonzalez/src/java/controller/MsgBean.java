
package com.controllers;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@Named(value = "mb")
@ApplicationScoped
public class MsgBean implements Serializable {
    
    private static final long serialVersionUID =1L;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
   
    public String mensajeSend(){
    String Send;
      Send="Enviado";
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "Mensaje Enviado Exitosamente", "");
            FacesContext.getCurrentInstance().addMessage(null, fm); 
            Send="Contact";
    return "Contact";
    
    }
    
    
}
