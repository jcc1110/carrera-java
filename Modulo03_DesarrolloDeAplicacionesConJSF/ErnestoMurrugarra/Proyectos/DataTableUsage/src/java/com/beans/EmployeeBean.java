package com.beans;
import com.models.Employee;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "eb")
@ApplicationScoped
public class EmployeeBean implements Serializable {
    // Atributos
    public static final long serialVersionUID = 1L;
    private Employee EmployeeObj;
    private List<Employee> EmployeesLst;
    
    public EmployeeBean() {
        // Simulando una consulta a una tabla "employee" de una BD.
        this.EmployeeObj = new Employee();
        this.EmployeesLst = new ArrayList<>();
        this.EmployeesLst.add(new Employee("John", "Lopez", "M", 200.89));
        this.EmployeesLst.add(new Employee("Robert", "Montoya", "M", 300.00));
        this.EmployeesLst.add(new Employee("Anna", "Zapata", "F", 250.00));
        this.EmployeesLst.add(new Employee("Luisa", "Van", "F", 250.00));
        this.EmployeesLst.add(new Employee("Peter", "Parker", "M", 150.00));
    }

    public List<Employee> getEmployeesLst() {
        return this.EmployeesLst;
    }

    public void setEmployeesLst(List<Employee> emplst) {
        this.EmployeesLst = emplst;
    }

    public Employee getEmployeeObj() {
        return this.EmployeeObj;
    }

    public void setEployeeObj(Employee empObj) {
        this.EmployeeObj = empObj;
    }
    
    public void addEmployee() {
        this.EmployeesLst.add(new Employee(
            this.EmployeeObj.getName(),
            this.EmployeeObj.getLastName(),
            this.EmployeeObj.getGender(),
            this.EmployeeObj.getSalary()
        ));
    }
   
    public void deleteEmployee(Employee empObj) {
        this.EmployeesLst.remove(empObj);
    }
}