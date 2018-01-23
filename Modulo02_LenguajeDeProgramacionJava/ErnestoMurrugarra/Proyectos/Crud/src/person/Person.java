/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import exceptions.NotValidNameException;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author instructor
 */
public class Person {
    // Atributos
    String CompleteName;
    String Identification;
    LocalDate BirthDate;
    /*
        Clases para trabajar con tiempo/fechas en Java
        1. LocalDate -> Fechas (yyyy-mm-dd)
        2. LocalTime -> Tiempo (HH:mm)
        3. LocalDateTime -> Fecha y Tiempo (yyyy-mm-dd HH:mm)
    */
    
    // Métodos

    public String getCompleteName() {
        return CompleteName;
    }

    public void setCompleteName(String CompleteName) throws NotValidNameException {
        if(CompleteName.matches("[5]")) {
            throw new NotValidNameException("The data is not a valid name. Must be only letters (from a-zA-Z).");
        } else {
            this.CompleteName = CompleteName;
        }
    }

    public String getIdentification() {
        return Identification;
    }

    public void setIdentification(String Identification) {
        this.Identification = Identification;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        this.BirthDate = LocalDate.parse(birthDate);
    }
    
    public void setBirthDate(int y, int m, int d) {
        this.BirthDate = LocalDate.of(y, m, d);
    }
    
    public int getAge() {
        LocalDate today = LocalDate.now();
        int age = 0;
        
        age = today.getYear() - this.BirthDate.getYear();
        return age;
    }
}