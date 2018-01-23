/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polygon;

/**
 *
 * @author instructor
 */
public abstract class Polygon {
    // Atributos
    protected String Name;
    protected int NumberOfSides;
    
    // Métodos
    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public int getNumberOfSides() {
        return this.NumberOfSides;
    }

    public void setNumberOfSides(int NumberOfSides) {
        this.NumberOfSides = NumberOfSides;
    }
    
    public String toString() {
        return this.Name.toUpperCase() +
                "\nCantidad de lados: " +
                this.NumberOfSides +".";
    }
    
    public abstract double getArea();
}