/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author Fernando
 */
@Named(value = "al")
@ApplicationScoped
public class AccountLogin {    
    private String user="";
    private String pass="";    

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


    public AccountLogin() {           
    }
    
    public String ingresar (){     
           
           System.out.println(this.getPass() + "----" + this.getUser());
            if ("1234".equals(getPass())) {
                return "dashboard";
            }else{
                return "dashboard";
            }        
    }
}
