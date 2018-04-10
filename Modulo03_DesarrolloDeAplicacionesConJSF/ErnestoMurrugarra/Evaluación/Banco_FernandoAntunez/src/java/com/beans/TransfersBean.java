package com.beans;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.event.ValueChangeEvent;

@Named(value = "tb")
@ApplicationScoped
public class TransfersBean implements Serializable {
    // Atributos
    private static final long serialVersionUID = 1L;
    private String SelectedAccount = "";
    private List<String> Account;
    private String t="";
    private String alias="";
    private String name="";
    private String id="";
    private String naccount="";
    private double trans;
    private double result=0;
    private String msg;
    private String fal="false";

    public String getMsg() {
        getResult();
        return "Transferencia realizada, su saldo es:" + result;
    }
    public void falso(){
        this.fal="true";
    }

    public String getFal() {
        return fal;
    }

    public void setFal(String fal) {
        this.fal = fal;
    }    

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public double getResult() {
        result=1256-getTrans();
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getTrans() {
        return trans;
    }

    public void setTrans(double trans) {
        this.trans = trans;
    }
    

    public String getT() {
        if ("0102************9319".equals(getSelectedAccount())) {
            String t="true";
            return t;
        }else{
            String t="false";
            return t;
        } 
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getAlias() {
        if ("01340254630004568040".equals(getSelectedAccount())) {
            String alias="lu";
            return alias;
        }else if("01052523060080382207".equals(getSelectedAccount())){
            String alias="ga";
            return alias;
        }else if("01340254630865324540".equals(getSelectedAccount())){
            String alias="ju";
            return alias; 
        }else{
            String alias=" ";
            return alias;
        }
            
        
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getName() {
        if ("01340254630004568040".equals(getSelectedAccount())) {
            String name="Luis";
            return name;
        }else if("01052523060080382207".equals(getSelectedAccount())){
            String name="Gabriela";
            return name;
        }else if("01340254630865324540".equals(getSelectedAccount())){
            String name="Julia";
            return name; 
        }else{
            String name=" ";
            return name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        if ("01340254630004568040".equals(getSelectedAccount())) {
            String id="15856256";
            return id;
        }else if("01052523060080382207".equals(getSelectedAccount())){
            String id="13458563";
            return id;
        }else if("01340254630865324540".equals(getSelectedAccount())){
            String id="25325221";
            return id; 
        } else{
           String id=" ";
           return id;  
        }
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNaccount() {
        if ("01340254630004568040".equals(getSelectedAccount())) {
            String naccount="01340254630004568040";
            return naccount;
        }else if("01052523060080382207".equals(getSelectedAccount())){
            String naccount="01052523060080382207";
            return naccount;
        }else if("01340254630865324540".equals(getSelectedAccount())){
            String naccount="01340254630865324540";
            return naccount; 
        } else{
            String naccount=" ";
            return naccount;
        }
    }

    public void setNaccount(String naccount) {
        this.naccount = naccount;
    }

    
    // Métodos
    public TransfersBean() {
        this.Account = new ArrayList<>();
        this.Account.add(" ");
        this.Account.add("01340254630004568040");
        this.Account.add("01052523060080382207");
        this.Account.add("01340254630865324540");
    }
    
    public void accountChange(ValueChangeEvent e) {
        this.setSelectedAccount(e.getNewValue().toString());
        // Lógica extra
    }
    
    public String getSelectedAccount() {
        return this.SelectedAccount;
    }

    public void setSelectedAccount(String selectedAccount) {
        this.SelectedAccount = selectedAccount;
    }

    public List<String> getAccount() {
        return this.Account;
    }

    public void setAccount(List<String> account) {
        this.Account = account;
    }
}