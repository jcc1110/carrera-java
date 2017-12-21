/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * Clase para el manejo de las excepciones.
 *
 * @author RicardoPerez
 * @version 1.0.0
 */
public class myExceptions extends Exception {

    /**
     * Constructor de la clase Exception
     *
     * @param mensaje String Mensaje de la Excepción
     */
    public myExceptions(String _mensaje) {
        super(_mensaje);
    }
}
