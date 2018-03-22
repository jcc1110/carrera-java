/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import models.AccessData;
import models.User;

/**
 *
 * @author edgar
 */
@Named(value = "loginBean")
@ApplicationScoped
public class LoginBean {
private static final long serialVersionUID = 1L;
    private int card;
    private int password;
    private static int id;
    private AccessData bd;
    private User u;

    // Métodos
   public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }    

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
    public String login() throws ClassNotFoundException {
        String result;
        bd = new AccessData();
        
        boolean resultB = bd.validar(this.getCard(), this.getPassword());
        
        this.id = bd.validarId(this.getCard(), this.getPassword());
        System.out.println(this.id);

        if (resultB) {
            result = "success";
            HttpSession session = this.getCurrentSession();
            session.setAttribute("card", card);
        } else {
            result = "error";
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_WARN, "Tarjeta o contraseña incorrecta", "");
            FacesContext.getCurrentInstance().addMessage(null, fm);            
        }

        return result;
    }
    
    public String logout() {
        HttpSession session = this.getCurrentSession();
        session.removeAttribute("card");
        session.invalidate();
        return "login";
    }
    
    public HttpSession getCurrentSession() {
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
