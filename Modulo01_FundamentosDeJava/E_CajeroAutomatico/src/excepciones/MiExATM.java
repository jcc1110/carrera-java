package excepciones;

/**
 * Clase para el manejo de la excepciones.
 * @author Anthony Hurtado
 * @version 1.0
 */
public class MiExATM extends Exception {
    /**
     * Constructor de la clase Exception
     * @param mensaje Mensaje de la Excepción
     */
    public MiExATM(String mensaje) {
        super(mensaje);
    }
}
