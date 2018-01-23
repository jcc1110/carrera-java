/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rectangle;

import com.polygon.Polygon;

/**
 *
 * @author instructor
 */
public class Rectangle extends Polygon {
    // Atributos
    private double Side1;
    private double Side2;
    
    // Métodos
    public Rectangle(double s1,double s2) {
        // Atributos de la clase padre
        this.Name = "RECTÁNGULO";
        this.NumberOfSides = 4;
        
        // Atributos propios
        this.Side1 = s1;
        this.Side2 = s2;
    }

    public double getSide1() {
        return this.Side1;
    }

    public void setSide1(double Side1) {
        this.Side1 = Side1;
    }

    public double getSide2() {
        return this.Side2;
    }

    public void setSide2(double Side2) {
        this.Side2 = Side2;
    }
    
    public String toString() {
        return super.toString() + "Lado #1:" + this.Side1 +
                "cm.\nLado #2: " + this.Side2 +"cm.\nÁrea: " +
                this.getArea();
    }
    
    @Override
    public double getArea() {
        return (this.Side1 * this.Side2);
    }
}