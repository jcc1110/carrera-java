/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;
import Tienda.Tienda;
import java.util.ArrayList;
/**
 *
 * @author Edgar Contreras
 */
public class Tienda_Peliculas extends Tienda{
    /**
     * Constructor de la clase Tienda y Tienda_Peliculas inicializando la lista de Peliculas es Stock.
     * @param _nombre Nombre del Establecimiento
     * @param _direccion Dirección del Local de Peliculas
     */
     
    public Tienda_Peliculas(String _nombre, String _direccion) {
        super(_nombre, _direccion);
        super.bdPeliculas = new ArrayList<>();
        super.bdPeliculas.add(new Pelicula("Harry","Potter","Drama",1999,0));
        super.bdPeliculas.add(new Pelicula("Tommt","Jerry","Accion",1999,1));
        super.bdPeliculas.add(new Pelicula("Elvis","Potter","Drama",1999,2));
        super.bdPeliculas.add(new Pelicula("Edgar","Potter","Drama",1999,3));
        super.bdPeliculas.add(new Pelicula("Luis","Potter","Drama",1999,4));
        super.bdPeliculas.add(new Pelicula("Mary","Potter","Drama",1999,5));
        super.bdPeliculas.add(new Pelicula("Manuel","Potter","Drama",1999,6));
        super.bdPeliculas.add(new Pelicula("Jose","Potter","Drama",1999,7));
        super.bdPeliculas.add(new Pelicula("Leidy te extraño","Potter","Drama",1999,8));
        super.bdPeliculas.add(new Pelicula("Maduro","Potter","Drama",1999,9));
    }
   
    @Override
    public boolean ValidarProducto(ArrayList<Pelicula> _pelicula) {
       return _pelicula.containsAll(_pelicula);
    }

    @Override
  public String getNombre(){
      return super.getNombre();
    }
    
   
    @Override
    public String getDireccion() {
        return super.getDireccion(); 
    }
    
   public void getBaseDatos(ArrayList<Pelicula> bdPelicula){
        for (int i = 0; i < bdPelicula.size(); i++) {
			System.out.println(bdPelicula.get(i));
		}
     
    
}
}