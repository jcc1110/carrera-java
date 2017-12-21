/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Complemento;

import Estructuras.I_Peliculas;
import Excepciones.MisExcepciones;

/**
 *
 * @author vp50403
 */
public class Operaciones implements I_Peliculas {

    @Override
    public int consultar(Peliculas iCodigo) {
       int codigoO = iCodigo.getCodigo();
       return codigoO;
    }

    @Override
    public int listar(Peliculas iCodigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int darAlta(Peliculas iCodigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public Peliculas darBaja(Peliculas iCodigo, boolean _disponible) throws MisExcepciones {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Peliculas modificar(Peliculas iCodigo, int _anio) throws MisExcepciones {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
}
