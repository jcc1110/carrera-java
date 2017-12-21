
package estructuras;

import tienda.Peliculas;

/**
 * Interfaz para aplicar a las Tiendas
 * @author JOHAN
 * @version 1.0.0
 */
public interface Tienda {
    /**
     * Método para insertar una película a la base de datos
     * @param tiulo titúlo de la película a insertar
     * @param autor Autor de la película a insertar
     * @param tipo Género de la película a insertar
     * @param anio Año de publicación de la película a insertar
     * @return nuevo registro insertado
     */
    public abstract Peliculas insertarPelicula(String tiulo, String autor, String tipo, int anio);
    /**
     * Método para eliminar una película a la base de datos
     * @param pelicula Objeto de la película actual
     * @param titulo titúlo de la película a eliminar
     * @return operación exitosa de eliminación
     */
    public abstract Peliculas eliminarPelicula(Peliculas pelicula,String titulo);
     /**
     * Método para modificar una película a la base de datos
     * @param tiulo titúlo de la película a modificar
     * @param autor Autor de la película a modificar
     * @param tipo Género de la película a modificar
     * @param anio Año de publicación de la película a modificar
     * @return nuevo registro modificado
     */
    public abstract Peliculas modificarPelicula(String tiulo, String autor, String tipo, int anio );
     /**
     * Método para mostrar las peliculas almacenadas en la base de datos
    
     * @return listado de peliculas
     */
    public abstract Peliculas listarPeliculas();
}
