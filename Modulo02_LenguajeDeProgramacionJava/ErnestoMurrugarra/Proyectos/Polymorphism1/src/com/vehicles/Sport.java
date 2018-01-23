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
public class Sport extends Vehicle {
    // Atributos
    private int Displacement;
    
    // Métodos
    public Sport(String e,String b,String m,int d) {
        // Inicializamos los atributos del padre
        super(e,b,m);
        
        // Inicializamos el atributo propio
        this.Displacement = d;
    }

    public int getDisplacement() {
        return Displacement;
    }

    public void setDisplacement(int Displacement) {
        this.Displacement = Displacement;
    }
    
    public String showData() {
        return super.showData() + "\nCilindraje: " +
                this.Displacement + ".";
    }
}
