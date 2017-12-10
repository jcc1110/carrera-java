package operaciones;
import Estructuras.Pelicula;
import Excepciones.Excepciones;

/**
 * Interfaz donde se definen todas las opciones que van a ejecutarse en el menú del Main.
 * @author Anthony Hurtado
 * @version 1.0
 */
public interface Sistema {
    /**
     * Método para Buscar Peliculas
     * @param pelicula
     * @return String Pelicula
     */
    public abstract Pelicula listar(Pelicula pelicula);
    
    /**
     * Método para consultar Pelicula
     * @param _nombre, 
     * @param pelicula
     * @return boolean Si se eliminó la pelicula
     */
     public abstract Pelicula consultar(Pelicula pelicula, String _nombre);
     
        /**
     * Método para Agregar Pelicula
     * @param pelicula 
     * @param _nombre
     * @return String nombre
     */
    public abstract Pelicula agregar(Pelicula pelicula, String _nombre) throws Excepciones;

    /**
     * Método para eliminar Pelicula
     * @param _nombre, 
     * @param pelicula
     * a eliminar
     * @return boolean Si se eliminó la pelicula
     */
    
    public abstract Pelicula eliminar(Pelicula pelicula, String _nombre) throws Excepciones;
    
}