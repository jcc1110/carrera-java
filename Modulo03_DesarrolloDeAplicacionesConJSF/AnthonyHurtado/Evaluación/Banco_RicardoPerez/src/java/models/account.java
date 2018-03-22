/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author ricardoperez
 */
public class account {

    private String accountnumber;
    private String accountowner;
    private String owneridnumber;

    public account() {

    }

    public account(String accountnumber, String accountowner, String owneridnumber) {
        this.accountnumber = accountnumber;
        this.accountowner = accountowner;
        this.owneridnumber = owneridnumber;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getAccountowner() {
        return accountowner;
    }

    public void setAccountowner(String accountowner) {
        this.accountowner = accountowner;
    }

    public String getOwneridnumber() {
        return owneridnumber;
    }

    public void setOwneridnumber(String owneridnumber) {
        this.owneridnumber = owneridnumber;
    }

}
