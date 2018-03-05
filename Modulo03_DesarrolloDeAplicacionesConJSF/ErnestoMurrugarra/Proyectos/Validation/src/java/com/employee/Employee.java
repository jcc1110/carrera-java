/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author instructor
 */
@Named(value = "emp")
@ApplicationScoped
public class Employee {
    // Attr's
    private String Name;
    private int Age;
    private double Salary;
    private String Email;
    private String Web;
    
    /**
     * Creates a new instance of Employee
     */
    public Employee() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getWeb() {
        return Web;
    }

    public void setWeb(String Web) {
        this.Web = Web;
    }

    
}