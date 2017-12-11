package Bussines;
import Estructuras.Interfases;
import Excepciones.MisExcepciones;
// import Excepciones.MisExcepciones;
/**
 * Clase de operaciones para el ATM.
 * @author Anthony Hurtado
 * @version 1.0.0
 */
public class Operaciones implements Interfases {
    @Override
    public String consulta(Pelicula pelicula) {
        String titulo = pelicula.getTituloPelicula();
        return titulo;
    } 

    @Override
    public Pelicula retiro(Pelicula pelicula) throws MisExcepciones {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String agregar(Pelicula tituloPelicula,Pelicula tipoPelicula,Pelicula desPelicula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.   
    }

}
