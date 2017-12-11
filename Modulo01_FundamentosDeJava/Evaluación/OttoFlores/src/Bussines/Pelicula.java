package Bussines;
/**
 * Clase principal de los datos de las peliculas
 * @author Otto Flores
 * @version 1.0.0
 */
public class Pelicula {
    /**
     * Titulo de la pelicula
     */
    private String tituloPelicula;
    /**
     * Descripción de la pelicula
     */
    private String desPelicula;
    /**
     * Tipo de pelicula
     */
    private String tipoPelicula;
    /**
     * Constructor de la clase Pelicula inicializando los valores.
     * @param _tituloPelicula
     * @param _desPelicula
     * @param _tipoPelicula
     */
    public Pelicula(String _tituloPelicula, String _tipoPelicula, String _desPelicula ) {
        this.tituloPelicula = _tituloPelicula;
        this.tipoPelicula = _tipoPelicula;
        this.desPelicula = _desPelicula;
        }
    /**
     * Obtener el número del cuenta del cliente.
     * @return int Número de cuenta del cliente.
     */
    public String getTituloPelicula() {
        return this.tituloPelicula;
    }
    /**
     * Obtener la descripción de la pelicula
     * @return String Descripción de la pelicula
     */
    public String getDesPelicula() {
        return this.desPelicula;
    }    
    /**
     * Obtener el tipo de cuenta del cliente.
     * @return String Tipo de cuenta del cliente.
     */
    public String getTipoPelicula() {
        return this.tipoPelicula;
    }
}
