/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR_Estructuras_Datos;

import IR_Tienda_Video.IR_Peliculas;
import IR_Excepciones.IR_Peliculas_Excepsiones;


/**
 *
 * @author Carmen Thais
 */
public interface IR_Pelicula_Interf {
    
    public abstract int Listado_P(IR_Peliculas pelicula);
    
    public abstract IR_Peliculas Buscar_P(IR_Peliculas pelicula, int _codigo) throws IR_Peliculas_Excepsiones;
   
    public abstract IR_Peliculas Incluir_P(IR_Peliculas pelicula, int  _codigo) throws IR_Peliculas_Excepsiones;
    
    public abstract IR_Peliculas Modificar_P (IR_Peliculas pelicula, int  _codigo) throws IR_Peliculas_Excepsiones;
    
    public abstract IR_Peliculas Eliminar_P (IR_Peliculas pelicula, int  _codigo) throws IR_Peliculas_Excepsiones;
}
