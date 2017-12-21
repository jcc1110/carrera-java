
package tienda;

import estructuras.Club;
import java.util.ArrayList;

/**
 * Clase de gestión de la tienda y sus peliculas
 * @author JOHAN
 * @version 1.0.0
 * @see Club Herencia para aplicar las regulaciones a la tienda
 */
public class Tienda extends Club{
    /**
     * Constructor de la clase Club y Tienda inicializando la lista de Peliculas
     * @param nombre Nombre de la Tienda
     * @param direccion Dirección de la Tienda
     */
   public Tienda(String nombre, String direccion) {
        super(nombre, direccion);
        super.bdPeliculas = new ArrayList<>();
        super.bdPeliculas.add(new Peliculas("TITANIC", "leonardo", "trajico", 1997));
        super.bdPeliculas.add(new Peliculas("TITANIC1", "leonardo", "trajico", 1998));
        super.bdPeliculas.add(new Peliculas("TITANIC2", "leonardo", "trajico", 1999));
        super.bdPeliculas.add(new Peliculas("TITANIC3", "leonardo", "trajico", 2001));
        super.bdPeliculas.add(new Peliculas("TITANIC4", "leonardo", "trajico", 2002));
        super.bdPeliculas.add(new Peliculas("TITANIC5", "leonardo", "trajico", 2003));
        super.bdPeliculas.add(new Peliculas("TITANIC6", "leonardo", "trajico", 2004));
        super.bdPeliculas.add(new Peliculas("TITANIC7", "leonardo", "trajico", 2005));
        super.bdPeliculas.add(new Peliculas("TITANIC8", "leonardo", "trajico", 2006));
        super.bdPeliculas.add(new Peliculas("TITANIC9", "leonardo", "trajico", 2007));
        
    }

    @Override
    public Peliculas buscarPelicula(String tituloPelicula) {
        Peliculas pelicula = null;        
        for (Peliculas peli : this.bdPeliculas) {
            if (peli.getTitulo()== tituloPelicula) {
                pelicula = peli;
            }
        }
        return pelicula;
    }
    /**
     * Obtener el nombre de la Tienda
     * @return String nombre Nombre de la Tienda
     */
    public String getNombre() {
        return super.nombre;
    }
    /**
     * Obtener la direccion de la Tienda
     * @return String direccion Direccion de la Tienda
     */
    public String getDireccion() {
        return super.direccion;
    }

   

    
    
}
