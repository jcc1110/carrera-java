/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author instructor
 */
@Named(value = "ub")
@ApplicationScoped
public class UserBean implements Serializable {
// Atributos
    private static final long serialVersionUID = 1L;
    private String Name;
    private String Welcome;

    // Métodos
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
    
    public String getWelcome() {
        return "Bienvenido/a, " + this.getName();
    }

    public void setWelcome(String welcome) {
        this.Welcome = welcome;
    }
}