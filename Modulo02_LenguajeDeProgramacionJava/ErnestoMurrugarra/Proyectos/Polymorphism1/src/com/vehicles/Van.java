/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vehicles;

/**
 *
 * @author instructor
 */
public class Van extends Vehicle {
    // Atributos
    private int Load;
    
    // Métodos
    public Van(String e,String b,String m,int l) {
        // Inicializamos los atributos del padre
        super(e,b,m);
        
        // Inicializamos el atributo propio
        this.Load = l;
    }

    public int getLoad() {
        return this.Load;
    }

    public void setLoad(int load) {
        this.Load = load;
    }
    
    public String showData() {
        return super.showData() + "\nCarga: " +
                this.Load + ".";
    }
}
