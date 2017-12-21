/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR_Tienda_Video;
import IR_Estructuras_Datos.IR_Pelicula_Interf;
import IR_Excepciones.IR_Peliculas_Excepsiones;


/**
 *
 * @author Carmen Thais
 */
public class IR_Acciones_Peliculas implements IR_Pelicula_Interf {
    
//    public int Lista_P(IR_Peliculas peliculas) {
//        int PCodigo = peliculas.getCodigoPeli();
//        return PCodigo;
//    }

     public IR_Peliculas Listado_P (IR_Peliculas pelicula, int _codigo) throws IR_Peliculas_Excepsiones{
        System.out.println( " CODIGOE " + " NOMBRE PELICULA " + " ANNO " + " CENSERA "); 
        for (int i=1; i<=03; i++) {
            System.out.println(IR_Peliculas.getCodigoPeli(i) + " " +
                               IR_Peliculas.getNombrePeli(i) + " " +
                               IR_Peliculas.getAnnoPeli(i) + " " +
                               IR_Peliculas.getCensuraPeli(i) + " "  );       
             }
        return pelicula; //To change body of generated methods, choose Tools | Templates.
 
        }
        
        public int Buscar_P(IR_Peliculas peliculas) {
        int PCodigo = peliculas.getCodigoPeli();
        return PCodigo;
    }
}
