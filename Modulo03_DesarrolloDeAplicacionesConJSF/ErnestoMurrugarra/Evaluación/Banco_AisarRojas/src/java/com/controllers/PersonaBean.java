package com.controllers;

import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Aisar Rojas.
 * Proyecto: Módulo 3 de Java
 * @version 1.0
 */

@Named(value = "pb")
@SessionScoped
public class PersonaBean {
    //Atributos
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String apellido;
    private String sexo;
    private String nacimiento;
    
    public PersonaBean() {
    }
    
    public PersonaBean(String nombre, String apellido, String sexo, String nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.nacimiento = nacimiento;
    }

    //Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String editar() {
       this.setNombre("");
       this.setApellido("");
       this.setNacimiento("");
       this.setSexo("");
       return "vistas/privadas/datos_personales.xhtml";
    }
    
    public String datosp() {
        String resultadop;
        
        if (nombre.trim().length()==0) {
            resultadop = "registrado";
        } else {
            resultadop = "noregistrado";          
        }
        return resultadop;
    }
}
