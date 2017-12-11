package Excepciones;
/**
 * Clase para el manejo de las excepciones.
 * @author Otto Flores
 * @version 1.0.0
 */
public class MisExcepciones extends Exception {
    /**
     * Constructor de la clase Exception
     * @param mensaje String Mensaje de la Excepción
     */
    public MisExcepciones(String mensaje) {
        super(mensaje);
    }    
}
