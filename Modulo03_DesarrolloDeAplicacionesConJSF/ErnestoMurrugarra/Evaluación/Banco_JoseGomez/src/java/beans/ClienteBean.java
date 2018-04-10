/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author José Gómez
 */
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ApplicationScoped;
import model.Cliente;

/**
 *
 * @author José Gómez
 */
@Named(value = "cliBean")
@ApplicationScoped

public class ClienteBean {

    /**
     * Creates a new instance of ClienteBean
     */
    
    // Atributos
    private Cliente c;
    
    // Métodos

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }
    
    
}
