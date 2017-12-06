package excepciones;

// Extendemos de la clase Exception o RuntimeException
public class MiExcepcion extends Exception {
    // Declaro mi constructor y llamo al constructor padre.
    public MiExcepcion(String _mensaje) {
        super(_mensaje);
    }
}
