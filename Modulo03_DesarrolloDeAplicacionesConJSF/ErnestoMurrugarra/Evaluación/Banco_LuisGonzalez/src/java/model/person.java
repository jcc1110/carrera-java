/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Luis
 */
public class person {
    
    private String name;
    private String lastname;
    private int ci;
    private String username;
    private String psw;
    private int naccount;
    private double balance;
    
    private boolean canEdit;
    
     public person( String name1, String ln, int ci, String user, String pw, int account, double balance1) 
     {
       
        this.name = name1;
        this.lastname = ln;
        this.ci = ci;
        this.username = user;
        this.psw = pw;
        this.naccount = account;
        this.balance = balance1;
        canEdit =false;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public person() {
   
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public int getNaccount() {
        return naccount;
    }

    public void setNaccount(int naccount) {
        this.naccount = naccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

            
}
