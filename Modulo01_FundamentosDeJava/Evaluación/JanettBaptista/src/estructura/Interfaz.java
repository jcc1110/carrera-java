/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;
import excepcion.MiExPeli;
import tienda.Tienda;

/**
 * Interfaz para aplicar a las Tiendas de Peliculas
 * @author Janett Baptista
 * @version 1.0
 */
public interface Interfaz {
    /**
     * Método para consulta de Una Pelicula
     * @return pelicula Datos de la Pelicula
     */
    public abstract int buscarPelicula(String _pelicula , Tienda tienda) throws MiExPeli;
}
