/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Complemento.Peliculas;
import Excepciones.MisExcepciones;

/**
 *
 * @author vp50403
 */
public interface I_Peliculas {
    
    public abstract int consultar(Peliculas iCodigo);
    
    public abstract int listar(Peliculas iCodigo);
    
    public abstract int darAlta(Peliculas iCodigo);
    
    public abstract Peliculas darBaja(Peliculas iCodigo, boolean _disponible)
            throws MisExcepciones;    
    
    public abstract Peliculas modificar(Peliculas iCodigo, int _anio)
            throws MisExcepciones;  
    
}
