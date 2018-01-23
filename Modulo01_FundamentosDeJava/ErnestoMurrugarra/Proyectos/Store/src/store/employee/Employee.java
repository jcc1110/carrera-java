/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.employee;
import store.interfaces.common_methods;
import store.person.Person;

/**
 *
 * @author instructor
 */
public class Employee extends Person implements common_methods {
    // Attr's
    private float Salary;
    
    // Methods
    public Employee() {
        super();
        this.Salary = 0F;
    }

    public void setSalary(float s) { this.Salary = s; }
    public float getSalary() { return Salary; }

    @Override
    public StringBuilder showInfo() {
        StringBuilder sb = new StringBuilder();
        // Atributos de padre
        sb.append(this.getName()).append("\n");
        sb.append(this.getGender()).append("\n");
        sb.append(this.getAge()).append("\n");
        sb.append(this.getAddress()).append("\n");
        
        // Atributos propios
        sb.append(this.Salary);
        
        return sb;
    }

    @Override
    public void askInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void method_1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void method_2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void method_3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void method_4() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void method_5() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}