/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personexceptions;

/**
 *
 * @author instructor
 */
public class CiException extends Exception {
    // Métodos
    CiException() {
        super("La cédula tiene menos o más dígitos"
                + "de lo aceptado.");
    }
}