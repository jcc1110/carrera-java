/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author José Gómez
 */
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value="acc")
@ApplicationScoped
public class Cuenta {
    private String Tipo;
    private double Saldo;  

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    
    
    
}
