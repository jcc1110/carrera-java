/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author annatata
 */
public class InventarioPeliculas {
    
}

import estructura.BDPELICULAS;
import java.util.ArrayList;

/**
 * Clase de gestión del banco y cuenta bancaria.
 * @author Anthony Hurtado
 * @version 1.0.0
 * @see Sudeban Herencia para aplicar las regulaciones al banco
 */
public class InventarioPeliculas extends BDPELICULAS {
    /**
     * Constructor de la clase Sudeban y Banco inicializando la lista de clientes.
     * @param _nombreBanco Nombre del banco actual
     * @param _ubicacionBanco Dirección del banco actual
     */
    public InventarioPeliculas(String _nombrePelicula) {
        super(_nombrePelicula);
        super.bdPelicula = new ArrayList<>();     
        super.bdPelicula.add(new Peliculas("Naufrago");
        super.bdPelicula.add(new Peliculas("Ray");
        super.bdPelicula.add(new Peliculas("Armagedon");
        super.bdPelicula.add(new Peliculas("Creed");
        super.bdPelicula.add(new Peliculas("Joy");
        super.bdPelicula.add(new Peliculas("Pasajeros");
        super.bdPelicula.add(new Peliculas("Pixeles");
        super.bdPelicula.add(new Peliculas("Forrest");
        super.bdPelicula.add(new Peliculas("Batman");
        super.bdPelicula.add(new Peliculas("Ronaldo");
        
    }

    @Override
    public Cliente validarCliente(int _numeroCuenta, int _clave) {
        Cliente cliente = null;        
        for (Cliente cli : this.bdClientes) {
            if (cli.getNumeroCuenta() == _numeroCuenta && cli.getClave() == _clave) {
                cliente = cli;
            }
        }
        return cliente;
    }
    
    /**
     * Obtener el nombre del banco.
     * @return String Nombre del banco
     */
    public String getNombre() {
        return super.nombre;
    }
    
    /**
     * Obtener la ubicación del banco.
     * @return String Ubicación del banco
     */
    public String getUbicacion() {
        return super.ubicacion;
    }
}