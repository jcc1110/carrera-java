package excepciones;

/**
 * Clase para el manejo de las excepciones.
 * @author Anthony Hurtado
 * @version 1.0.0
 */
public class MiATMException extends Exception {
    /**
     * Constructor de la clase Exception
     * @param mensaje String Mensaje de la Excepción
     */
    public MiATMException(String mensaje) {
        super(mensaje);
    }
}
