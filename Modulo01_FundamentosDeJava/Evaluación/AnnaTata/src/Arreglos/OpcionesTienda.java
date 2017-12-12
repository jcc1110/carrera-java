/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author annatata
 */
import Estructura.BDPELICULAS;
import Exception.Exception;
import java.util.ArrayList;

/**
 * Clase de opciones de la tienda.
 */
public class OpcionesTienda implements Arreglos {
    
       
    @Override
    public String consulta(Peliculas cliente) {
        String nombre_Pelicula = BDPELICULAS.getnombre_Pelicula();
        return nombre_Pelicula;
    }

   }   