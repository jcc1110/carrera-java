/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Complemento;

import Estructuras.TiendaPeliculas;
import java.util.ArrayList;

/**
 *
 * @author vp50403
 */
public class Tienda001 extends TiendaPeliculas {
    
    public Tienda001(int _codigo, String _nombre, String _ubicacion) {
        super(_codigo, _nombre, _ubicacion);
        super.bdGerentes = new ArrayList<>();
        super.bdGerentes.add(new Gerentes(10543990,1001,"Ignacio","Rodríguez","Chuao"));
        super.bdGerentes.add(new Gerentes(11921578,1002,"Carmen Thais","Jaramillo","Petare"));
        super.bdGerentes.add(new Gerentes(19325897,1003,"Matheus","Bustamante","Caricuao"));

/* Esto no es necesario acá        
        super.bdPeliculas = new ArrayList<>();
        super.bdPeliculas.add(new Peliculas(10001,"Maracaibo","Drama",'B',2017,true));
        super.bdPeliculas.add(new Peliculas(10002,"El Amparo","Drama",'C',2016,true));
        super.bdPeliculas.add(new Peliculas(10003,"Azul y No tan Rosa","Drama/Comedia",'B',2011,true));
        super.bdPeliculas.add(new Peliculas(10004,"Coco","Infantil",'A',2017,true));
*/
    }


    @Override
    public Gerentes validarGerente(int _cedula, int _codigoG) {
        Gerentes gerente = null;        
        for (Gerentes gte : this.bdGerentes) {
            if (gte.getCedula() == _cedula && gte.getCodigo() == _codigoG) {
                gerente = gte;
            }
        }
        return gerente;
    }    

    @Override
    public Peliculas validarPelicula(int _codigo) {
        Peliculas pelicula = null;        
        for (Peliculas film : this.bdPeliculas) {
            if (film.getCodigo() == _codigo) {
                pelicula = film;
            }
        }
        return pelicula;
    }    
    
    public int getCodigo() {
        return super.codigo;
    }
    
    public String getNombre() {
    return super.nombre;
    }
    
    public String getUbicacion() {
    return super.ubicacion;
    }
}
