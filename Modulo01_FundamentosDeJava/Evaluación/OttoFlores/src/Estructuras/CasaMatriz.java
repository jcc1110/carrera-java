package Estructuras;
import Bussines.Pelicula;
import java.util.ArrayList;
/**
 * Clase padre para establecer lineamientos para las tiendas
 * @author Otto Flores
 * @version 1.0.0
 */
public abstract class CasaMatriz {
    /**
     * Nombre de la tienda
     */
    protected String nombreTienda;
    /**
     * Ubicación fisica de la tienda
     */
    protected String ubicacionTienda;
    /**
     * Base de datos de peliculas
     */
    protected ArrayList<Pelicula> bdPeliculas;
    /**
     * Constructor de la clase Casa Matriz
     * @param _nombreTienda Nombre de la tienda
     * @param _ubicacionTienda Ubicación fisica de la tienda
     */
    public CasaMatriz(String _nombreTienda, String _ubicacionTienda) {
        this.nombreTienda = _nombreTienda;
        this.ubicacionTienda = _ubicacionTienda;
    }
    /**
     * Valida que una pelicula exista en la base de datos
     * @param _tituloPelicula Titulo de la pelicula proporcionado por el usuario
     * @return Pelicula Pelicula encontrado
     */
    public abstract Pelicula validarPelicula(String _tituloPelicula);

    /**
     *
     * @param _tituloPelicula
     * @param _tipoPelicula
     * @param _desPelicula
     * @return
     */
    public abstract Pelicula agregarPelicula(String _tituloPelicula, String _tipoPelicula, String _desPelicula);

    /**
     *
     * @param _tituloPelicula
     * @param _tipoPelicula
     * @param _desPelicula
     * @return
     */
    public abstract Pelicula modificarPelicula(String _tituloPelicula, String _tipoPelicula, String _desPelicula);
}