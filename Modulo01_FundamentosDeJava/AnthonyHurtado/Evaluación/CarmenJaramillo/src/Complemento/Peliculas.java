/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Complemento;

/**
 *
 * @author vp50403
 */
public class Peliculas {
    
    private int codigoP;
    
    private String titulo;
    
    private String genero;
    
    private char clase;
    
    private int anio;
    
    private boolean disponible;
    
    public Peliculas(int _codigoP, String _titulo, String _genero,
                     char _clase, int _anio, boolean _disponible) {
        
        this.codigoP = _codigoP;
        this.titulo = _titulo;
        this.genero = _genero;
        this.clase = _clase;
        this.anio = _anio;
        this.disponible = true;
    }
    
        public int getCodigo() {
        return this.codigoP;
    }
    
        public String getTitulo() {
        return this.titulo;
    }        
        public String getGenero() {
        return this.genero;
    }         
        public char getClase() {
            return this.clase;
    }                  
        public int getAnio() {
            return this.anio;
    }                  
}
