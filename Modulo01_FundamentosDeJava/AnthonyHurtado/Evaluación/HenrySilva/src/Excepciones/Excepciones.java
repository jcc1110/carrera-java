package Excepciones;

/**
 * Clase para el manejo de la excepciones.
 * @author Henry Silva
 * @version 1.0
 */
public class Excepciones extends Exception {
    /**
     * Constructor de la clase Exception
     * @param mensaje Mensaje de la Excepción
     */
    public Excepciones(String mensaje) {
        super(mensaje);
    }
}