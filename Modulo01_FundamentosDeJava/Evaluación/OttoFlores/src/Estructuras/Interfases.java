package Estructuras;
import Bussines.Pelicula;
import Excepciones.MisExcepciones;
/**
 * Interfaz para aplicar a las tiendas
 * @author Otto Flores
 * @version 1.0.0
 */
public interface Interfases {
    /**
     * Método para consulta 
     * @param pelicula Objeto de la pelicula
     * @return 
     */
    public abstract String consulta(Pelicula pelicula);
    
    /**
     * Método para retirar dnero de la cuenta bancaria.
     * @param pelicula
     * @return Pelicula Objeto actualizado
     * @throws Excepciones.MisExcepciones
     */
    public abstract Pelicula retiro(Pelicula pelicula) throws MisExcepciones;
    
    /**
     * Método para depositar dnero a la cuenta bancaria.
     * @param tituloPelicula
     * @param tipoPelicula
     * @param desPelicula
     * @return Pelicula Objeto actualizado
     */
    public abstract String agregar(Pelicula tituloPelicula,Pelicula tipoPelicula,Pelicula desPelicula);
    
}
