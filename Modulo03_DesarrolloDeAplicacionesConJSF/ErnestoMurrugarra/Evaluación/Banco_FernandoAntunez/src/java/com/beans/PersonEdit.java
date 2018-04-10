package com.beans;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Fernando
 */
@Named(value = "pe")
@ApplicationScoped
public class PersonEdit {
private String name="";
private String lastname="";
private String mail="";
private String username="";
private String pass="";
private String falso1="true";
private String falso2="false";

public void change(){
    if ("true".equals(falso1)){
        falso1="false";
        falso2="true";}
    else{
        falso1="true";
        falso2="false";   
    }
}

    public String getFalso1() {
        return falso1;
    }

    public void setFalso1(String falso1) {
        this.falso1 = falso1;
    }

    public String getFalso2() {
        return falso2;
    }

    public void setFalso2(String falso2) {
        this.falso2 = falso2;
    }

    public PersonEdit() {
    }

    public String getName() {
        if ("".equals(name)) {
            String newn="Fernando";
            return newn;
        }else{
            return name;
        }
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        if ("".equals(lastname)) {
            String newn="Antunez";
            return newn;
        }else{
            return lastname;
        }
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMail() {
        if ("".equals(mail)) {
            String newn="fernandojesusantunez@gmail.com";
            return newn;
        }else{
            return mail;
        }
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsername() {
        if ("".equals(username)) {
            String newn="admin";
            return newn;
        }else{
            return username;
        }
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        if ("".equals(pass)) {
            String newn="1234";
            return newn;
        }else{
            return pass;
        }
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
