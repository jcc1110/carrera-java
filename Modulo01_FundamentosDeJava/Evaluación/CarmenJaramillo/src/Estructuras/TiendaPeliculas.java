/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Complemento.Gerentes;
import Complemento.Peliculas;
import java.util.ArrayList;

/**
 *
 * @author vp50403
 */
public abstract class TiendaPeliculas {
    protected int codigo;
    protected String nombre;
    protected String ubicacion;
    public ArrayList<Gerentes> bdGerentes;    
    public ArrayList<Peliculas> bdPeliculas;    
    
    public TiendaPeliculas(int _codigo, String _nombre, String _ubicacion) {
        this.codigo = _codigo;
        this.nombre = _nombre;
        this.ubicacion = _ubicacion;          
    }
    
    public abstract Gerentes validarGerente(int cedula, int _codigoG);
    
    public abstract Peliculas validarPelicula(int _codigoP);    
}
