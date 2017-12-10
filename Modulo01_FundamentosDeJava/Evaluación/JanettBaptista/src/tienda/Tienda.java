/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import estructura.Comercio;
import java.util.ArrayList;

/**
 * Clase de las Tiendas.
 * @author Janett Baptista
 * @version 1.0
 */
public class Tienda extends Comercio {
    /**
     * Constructor de la clase Tienda e Inicializando la lista de Peliculas.
     * @param _nombreTienda
     * @param _ubicacionTienda
     */ 
    public Tienda(String _nombreTienda, String _ubicacionTienda) {
        super(_nombreTienda, _ubicacionTienda);
        super.bdPeliculas = new ArrayList<>();
        super.bdPeliculas.add(new Pelicula("Liga de la Justicia","Ficcion",10));        
        super.bdPeliculas.add(new Pelicula("Star Wars","Ficcion",12));
        super.bdPeliculas.add(new Pelicula("Spider Man","Ficcion",20));
        super.bdPeliculas.add(new Pelicula("Mujer Maravilla","Ficcion",5));
        super.bdPeliculas.add(new Pelicula("El Gran Desmadre","Comica",30));
        super.bdPeliculas.add(new Pelicula("Paddington 2","Infantiles",15));
        super.bdPeliculas.add(new Pelicula("Perfectos Desconocidos","Drama",15));
        super.bdPeliculas.add(new Pelicula("Wonder","Drama",15));
        super.bdPeliculas.add(new Pelicula("Saw VIII","Terror",20));
        super.bdPeliculas.add(new Pelicula("Dos Padres por Desigual","Comedia",20));
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getUbicacionTienda() {
        return ubicacionTienda;
    }

    public void setUbicacionTienda(String ubicacionTienda) {
        this.ubicacionTienda = ubicacionTienda;
    }
}