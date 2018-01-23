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
public class Turism extends Vehicle {
    // Atributos
    private int NumberOfDoors;
    
    // Métodos
    public Turism(String e,String b,String m,int nod) {
        // Inicializamos los atributos del padre
        super(e,b,m);
        
        // Inicializamos el atributo propio
        this.NumberOfDoors = nod;
    }

    public int getNumberOfDoors() {
        return NumberOfDoors;
    }

    public void setNumberOfDoors(int NumberOfDoors) {
        this.NumberOfDoors = NumberOfDoors;
    }
    
    public String showData() {
        return super.showData() + "\nCantidad de puertas: " +
                this.NumberOfDoors + ".";
    }
}
