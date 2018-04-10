package com.beans;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.event.ValueChangeEvent;

@Named(value = "mb")
@ApplicationScoped
public class MovimentsBean implements Serializable {
    // Atributos
    private static final long serialVersionUID = 1L;
    private String SelectedAccount = "";
    private List<String> Account;
    private double salary;
    private String t="";
    TransfersBean tb=new TransfersBean();

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

    public double getSalary() {
        if ("0102************9319".equals(getSelectedAccount())) {
            
                return tb.getResult();
            
        }else{
            double salary=0;
            return salary;
        }        
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    // Métodos
    public MovimentsBean() {
        this.Account = new ArrayList<>();
        this.Account.add(" ");
        this.Account.add("0102************9319");
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