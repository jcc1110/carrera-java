/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR_Tienda_Video;


public class IR_Peliculas {
    
    private int codigo_p;
   
    private String nombre_p;
   
    private int anno_p;
   
    private String censura_p;
    
            
        public IR_Peliculas(int _codigop, String _nombrep, int _annop, String _censurap) {
        this.codigo_p = _codigop;
        this.nombre_p = _nombrep;
        this.anno_p = _annop;
        this.censura_p = _censurap;
        
        }
    
        public int getCodigoPeli() {
        return this.codigo_p;
    }
    
        public String getNombrePeli() {
        return this.nombre_p;
    }
    
        public int getAnnoPeli() {
        return this.anno_p;
    }
        
        public String getCensuraPeli() {
        return this.censura_p;
    }
}