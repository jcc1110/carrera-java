/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR_Estructuras_Datos;
import IR_Tienda_Video.IR_Peliculas;
import java.util.ArrayList;

/**
 *
 * @author Carmen Thais
 */
public abstract class IR_SBD_Peliculas {

    /**
     * Base de datos de Peliculas
     */
    protected ArrayList<IR_Peliculas> bdpeliculas;
    
     public IR_SBD_Peliculas() {
       
    }
    
     public abstract IR_Peliculas validarIR_Peliculas(int _codigop);
}
