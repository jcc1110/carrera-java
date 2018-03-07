package com.beans;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.event.ActionEvent;

@Named(value = "db")
@ApplicationScoped

public class DataBean implements Serializable {
    // Atributos
    private static final long serialVersionUID = 1L;
    private String Name;
    
    // Métodos
    public void updateName(ActionEvent e) {
        this.setName("Ernesto Alexander");
    }
    
    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
}