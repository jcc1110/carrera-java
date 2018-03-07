/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

public class Employee {
    private String Name;
    private String LastName;
    private String Gender;
    private double Salary;
    
    public Employee() { }

    public Employee(String n, String ln, String g, double s) {
        this.Name = n;
        this.LastName = ln;
        this.Gender = g;
        this.Salary = s;
    }

    public double getSalary() {
        return this.Salary;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getLastName() {
        return this.LastName;
    }

    public void setLastName(String lastname) {
        this.LastName = lastname;
    }

    public String getGender() {
        String gend = ("M".equals(this.Gender)) ? "Masculino" : "Femenino";
        return gend;
        //return "M".equals(this.Gender) ? "Masculino" : "Femenino";
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }
}