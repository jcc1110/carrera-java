/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import estructura.Interfaz;
import excepcion.MiExPeli;

/**
 * Clase de operaciones para el Negocio
 * @author Janett Baptista
 * @version 1.0
 */
public class Operaciones implements Interfaz {
    
    int posicion=0;
    int ultimo=0;
    boolean seguir=true;
    
    @Override
    public int buscarPelicula(String _pelicula, Tienda tienda) throws MiExPeli{
        posicion = 0;
        ultimo = tienda.bdPeliculas.size();
        do {  
            if (tienda.bdPeliculas.get(posicion).getNombrePelicula().compareToIgnoreCase(_pelicula) == 0)    
            {
                seguir=false;
                return posicion;
            }
            else{
                posicion = posicion + 1;   
            }   
        } while ((seguir) && (posicion < ultimo));
        throw new MiExPeli("La pelicula que buscas no existe.");
    }
}
