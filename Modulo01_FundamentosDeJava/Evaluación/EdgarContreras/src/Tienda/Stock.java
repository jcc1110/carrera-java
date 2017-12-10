/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import Estructura.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author Edgar Contreras
 */
public interface Stock {
    
    /**
     *  Este Metodo busca Listar el arreglo de tipo PELICULA.
     * @param Arr ArrayList del tipo pelicula.
     * @return Cadena de textos listando los elementos del Array(base de datos)
     */
    public String Listar(ArrayList<Pelicula> Arr);
    
    /**
     *  Este metodo elimina mediante el nombre la Pelicula seleccionada.
     * @param Arr
     * @param id
     */
    public void Eliminar(ArrayList<Pelicula> Arr, String id);
    
    /**
     *  Este metodo realiza una busqueda mediante el nombre de la pelicula.
     * @param Arr
     * @param id
     * @return 
     */
    public String BuscarPorNombre(ArrayList<Pelicula> Arr, String id);
    
    /**
     *  Este metodo realiza una busuqeda por el nombre del Director. 
     * @param Arr
     * @param id
     * @return 
     */
    public String BuscarPorDirector(ArrayList<Pelicula> Arr, String id);
    
    /**
     *  Este metodo realiza un busqueda por el tipo de genero.
     * @param Arr
     * @param id
     * @return 
     */
    public String BuscarPorGenero(ArrayList<Pelicula> Arr, String id);
    
    /**
     *  Este metodo Añade una pelicula a la coleccion.
     * @param Arr
     * @param _pelicula
     */
    public void Añadir(ArrayList<Pelicula> Arr);
    
    /**
     *  Este metodo realiza una modificacion total de los datos de una pelicula tras una busqueda por su nombre.
     * @param Arr
     */
    public void Modificar(ArrayList<Pelicula> Arr);
       
}
