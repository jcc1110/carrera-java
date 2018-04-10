/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Carlos
 */
public class User {
    private String name;
    private String lastname;
    private int ci;
    private int naccount;
    private double saldo;
      private boolean canEdit;
    public User(String nme1, String ln, int ci1, int ncta, double s)
    {

        this.name = nme1;
        this.lastname= ln;
        this.ci = ci1;
        this.naccount = ncta;
        this.saldo= s;
    }

    public User() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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

    public int getNaccount() {
        return naccount;
    }

    public void setNaccount(int naccount) {
        this.naccount = naccount;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }
    
    
    
}
