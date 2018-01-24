/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person;

import com.personexceptions.OriginException;

/**
 *
 * @author instructor
 */
public class Person {
    // Atributos
    private char Origin;
    private String Ci;

    public char getOrigin() {
        return this.Origin;
    }

    public void setOrigin(char Origin) throws OriginException {
        
        // Verificamos que el caracter sea E, o V o J
        if(Origin == 'V' || Origin == 'E' || Origin == 'J') {
            this.Origin = Origin;
        } else {
            throw new OriginException("Debe ser V, E o J.");
        }
        
    }

    public String getCi() {
        return this.Ci;
    }

    public void setCi(String Ci) {
        this.Ci = Ci;
    }
    
}
