package Bussines;
import Estructuras.CasaMatriz;
import java.util.ArrayList;
/**
 * Clase de gestión de la Tienda
 * @author Otto Flores
 * @version 1.0.0
 * @see CasaMatriz Herencia para aplicar a la tienda
 */
public class Tienda extends CasaMatriz{
   /**
     * Constructor de la clase
     * @param _nombreTienda Nombre de la tienda
     * @param _ubicacionTienda Dirección de la tienda
     */
    public Tienda(String _nombreTienda, String _ubicacionTienda) {
        super(_nombreTienda, _ubicacionTienda);
        super.bdPeliculas = new ArrayList<>();
        super.bdPeliculas.add(new Pelicula("aaa","terror","protagonizada por bb"));
        super.bdPeliculas.add(new Pelicula("bbb","comedia","dirigida por cc"));
        super.bdPeliculas.add(new Pelicula("ccc","suspenso","dd"));
        super.bdPeliculas.add(new Pelicula("ddd","terror","protagonizada por ee"));
        super.bdPeliculas.add(new Pelicula("eee","comedia","dirigida por ff"));
        super.bdPeliculas.add(new Pelicula("fff","suspenso","gg"));
        super.bdPeliculas.add(new Pelicula("ggg","terror","protagonizada por hh"));
        super.bdPeliculas.add(new Pelicula("hhh","comedia","dirigida por ii"));
        super.bdPeliculas.add(new Pelicula("iii","suspenso","jj"));
        super.bdPeliculas.add(new Pelicula("jjj","terror","protagonizada por kk"));        
    }
     /**
     * Obtener el nombre de la tienda
     * @return String Nombre de la tienda
     */
    public String getNombreTienda() {
        return super.nombreTienda;
    }
    /**
     * Obtener la ubicación de la tienda
     * @return String Ubicación de la tienda
     */
    public String getUbicacionTienda() {
        return super.ubicacionTienda;
    }
    @Override
    public Pelicula validarPelicula(String _tituloPelicula) {
        Pelicula pelicula = null;        
        for (Pelicula count : this.bdPeliculas) {
            if (count.getTituloPelicula().equals(_tituloPelicula)) {
                pelicula = count;
            }
        }
        return pelicula;
    }
    @Override
    public Pelicula agregarPelicula(String _tituloPelicula, String _tipoPelicula, String _desPelicula) {
        super.bdPeliculas.add(new Pelicula(_tituloPelicula, _tipoPelicula, _desPelicula));
        return null;
    }
    @Override
    public Pelicula modificarPelicula(String _tituloPelicula, String _tipoPelicula, String _desPelicula) {
        super.bdPeliculas.add(new Pelicula(_tituloPelicula, _tipoPelicula, _desPelicula));
        return null;
    }
}