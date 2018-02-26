/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import model.Person;

/**
 *
 * @author instructor
 */
@Named(value = "personBean")
@RequestScoped
public class PersonBean {

    /**
     * Creates a new instance of PersonBean
     */
    
    // Atributos
    private Person p;
    
    // Métodos
    public PersonBean() { p = new Person(); }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }
    
    
}
