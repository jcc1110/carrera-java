/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.triangle;

import com.polygon.Polygon;
/**
 *
 * @author instructor
 */
public class Triangle extends Polygon {
    // Atributos
    private double Side1;
    private double Side2;
    private double Side3;
    
    // Métodos
    public Triangle(double s1,double s2,double s3) {
        // Atributos de la clase padre
        this.Name = "TRIÁNGULO";
        this.NumberOfSides = 3;
        
        // Atributos propios
        this.Side1 = s1;
        this.Side2 = s2;
        this.Side3 = s3;
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
    
    public double getSide3() {
        return this.Side3;
    }

    public void setSide3(double Side3) {
        this.Side3 = Side3;
    }
    
    public String toString() {
        return super.toString() + "Lado #1:" +
                this.Side1 + "cm.\nLado #2: " +
                this.Side2 + "cm.\nLado #3: " +
                this.Side3 +"cm.\nÁrea: " +
                this.getArea();
    }
    
    @Override
    public double getArea() {
        // Semi perímetro
        double s = (this.Side1 + this.Side2 + this.Side3)/2;
        
        return Math.sqrt(s*(s-this.Side1)*(s-this.Side2)*(s-this.Side3));
    }
}