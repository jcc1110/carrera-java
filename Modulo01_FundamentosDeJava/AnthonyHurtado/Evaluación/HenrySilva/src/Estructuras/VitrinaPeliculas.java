package Estructuras;
//import Estructuras.Pelicula;

import java.util.ArrayList;

/**
 * Clase Vitrina Peliculas 
 * Extend de la Super Clase Inventario
 * Donde se define la base de datos 
  * @author Henry SIlva
 * @version 1.0
 */
public class VitrinaPeliculas extends Inventario {
    /**
     * Constructor de la clase Inventario y VitrinaPeliculas inicializando la lista de Peliculas.
     */
    public VitrinaPeliculas(String _nombreInventario, String _ubicacionInventario) {
        super(_nombreInventario, _ubicacionInventario);
        super.bdPeliculas = new ArrayList<>();
        super.bdPeliculas.add(new Pelicula("ButchCasidy","Oeste"));
        super.bdPeliculas.add(new Pelicula("Frankestein","Misterio"));
    }

  
    public String getNombre() {
        return super.nombre;
    }

    public String getUbicacion() {
        return super.ubicacionInventario;
    }
}