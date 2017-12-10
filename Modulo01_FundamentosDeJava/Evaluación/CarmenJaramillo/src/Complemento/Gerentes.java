/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Complemento;

import java.util.ArrayList;

/**
 *
 * @author vp50403
 */
public class Gerentes {
    
    private int cedula;
    
    private int codigoG;
    
    private String nombre;
    
    private String apellido;
    
    private String direccion;
    
    public ArrayList<Gerentes> bdGerentes;
    
    public Gerentes(int _cedula, int _codigoG, String _nombre, 
                    String _apellido, String _direccion) 
    {
        this.cedula = _cedula;
        this.codigoG = _codigoG;
        this.nombre = _nombre;
        this.apellido = _apellido;
        this.direccion = _direccion;                     
    }
    
    public int getCedula() {
        return this.cedula;
    }
    
    public int getCodigo() {
        return this.codigoG;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public String getDireccion() {
        return this.direccion;
    }
}
