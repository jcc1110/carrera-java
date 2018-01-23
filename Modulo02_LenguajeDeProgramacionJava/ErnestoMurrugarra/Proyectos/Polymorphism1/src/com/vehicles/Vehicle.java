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
public class Vehicle {
    // Atributos
    protected String Enrollment; //Matrícula.
    protected String Brand;// Marca.
    protected String Model;// Modelo.
    
    // Métodos
    public Vehicle(String e,String b,String m) {
        this.Enrollment = e;
        this.Brand = b;
        this.Model = m;
    }

    public String getEnrollment() {
        return this.Enrollment;
    }

    public void setEnrollment(String Enrollment) {
        this.Enrollment = Enrollment;
    }

    public String getBrand() {
        return this.Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return this.Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }
    
    public String showData() {
        return "Marca: " + this.Brand +
                ".\nModelo: " + this.Model +
                ".\nMatrícula: " + this.Enrollment +".";
    }
}
