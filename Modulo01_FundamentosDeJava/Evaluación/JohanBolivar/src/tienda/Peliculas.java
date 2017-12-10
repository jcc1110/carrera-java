
package tienda;

/**
 * Clase principal de los datos del Cliente
 * @author JOHAN
 * @version 1.0.0
 */
public class Peliculas {
    /**
     * Título de la Película    
     */
    private String titulo;
    /**
     * Autor  de la Película
     */
    private String autor;
    /**
     * Género  de la Película
     */
    private String tipo;
    /**
     * Año de publicación  de la Película
     */
    private int anio;
    /**
     * Constructor de la clase Películas inicializando los valores.
     * @param titulo título de la Película
     * @param autor autor de la Película
     * @param tipo género de la Película
     * @param anio año de publicacion de la Película
     */
    
    public Peliculas(String titulo, String autor, String tipo,int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.tipo = tipo;
        this.anio = anio;
    }

     /**
     * Obtener el título de la Película.
     * @return String título de la Película.
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Establece el título de la Película.
     * @param String titulo título de la Película.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtener el autor de la Película.
     * @return String Autor de la Película.
     */
    public String getAutor() {
        return this.autor;
    }

    /**
     * Establece el autor de la Película.
     * @param String autor Autor de la Película.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtener el genero de la Película.
     * @return String tipo Género de la Película.
     */
    public String getTipo() {
        return this.tipo;
    }

    /**
     * establece el genero de la Película.
     * @param String tipo Género de la Película.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtener el año de la Película.
     * @return String anio Año de la Película.
     */
    public int getAnio() {
        return this.anio;
    }

   /**
     * Establece el año de la Película.
     * @param String anio Año de la Película.
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
}
    