/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebank;

import java.io.Serializable;
import java.security.Principal;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;

import javax.inject.Named;

/**
 *
 * @author Echenagucia
 */
@Named(value ="loginBean")
@ApplicationScoped
public class LoginBean implements Serializable{
    //Atributos
    
    private String user; 
    private String pass;
    

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }        

    public String login (){
        
        if (user.equals("Eduardo") && pass.equals("12345") ){
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario correcto", "");
                    
        }        
        return "Exito";
    } 
    
}