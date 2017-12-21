/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion;

/**
 * Clase para el manejo de la excepciones.
 * @author Janett Baptista
 * @version 1.0
 */
public class MiExPeli extends Exception {
    /**
     * Constructor de la clase Exception
     * @param mensaje Mensaje de la Excepción
     */
       
    public MiExPeli(String mensaje) {
        super(mensaje);
    }
    
}