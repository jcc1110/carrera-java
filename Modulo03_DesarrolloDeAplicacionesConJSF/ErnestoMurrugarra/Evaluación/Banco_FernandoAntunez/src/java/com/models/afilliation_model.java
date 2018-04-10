package com.models;

public class afilliation_model {
    private String name;
    private String lastname;
    private String account_type;
    private String account_number;
    private String bank;
    private String id_type;
    private String id;

    public afilliation_model (){}
    
    public afilliation_model (String n, String ls, String idt, String id, String b, String ac, String acn){
    this.name=n;
    this.lastname=ls;
    this.id_type=idt;
    this.id=id;
    this.bank=b;
    this.account_type=ac;
    this.account_number=acn;
    }

    public String getId_type() {
        String id_type;
        if ("V".equals(this.id_type)) {
            id_type="Venezolano";
            return id_type;
        }else if ("E".equals(this.id_type)){
            id_type="Extranjero";
            return id_type;        
        }else{
            id_type="Juridico";
            return id_type;
        }
        
       
    }

    public void setId_type(String id_type) {
        this.id_type = id_type;
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

    public String getAccount_type() {
        String account_type;
        if ("C".equals(this.account_type)) {
            account_type="Corriente";
            return account_type;
        }else{
            account_type="Ahorro";
            return account_type;
        }          
      
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getBank() {
        String bank;
            if ("B".equals(this.bank)) {
                bank="Banesco";
                return bank;
            }else{
                bank="Mercantil";
                return bank;
            }       
        
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
            

    
}
