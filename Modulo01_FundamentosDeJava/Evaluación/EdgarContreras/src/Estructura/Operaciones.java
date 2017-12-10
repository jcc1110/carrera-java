/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

import Tienda.Stock;
import java.util.*;

/**
 *
 * @author Edgar Contreras
 */
public class Operaciones implements Stock{

    public Operaciones() {
    }
    
    Scanner teclado = new Scanner(System.in);
    Pelicula _pelicula = new Pelicula("","","",0,0);
    String id = "";
        String Nombre = "";
        String Director = "";
        String Genero = "";
        int Año, ID;
    
    @Override
    public String Listar(ArrayList<Pelicula> Arr) {
         String Salida= "";
                       for( int i = 0 ; i  < Arr.size(); i++){
                        Salida += "ID :"+Arr.get(i).getID()+ "/ ";
                        Salida += "Nombre : "+Arr.get(i).getNombrePelicula()+ "/ ";
                        Salida += "Director : "+Arr.get(i).getDirector()+"/ ";
                        Salida += "Año : "+Arr.get(i).getAño()+"/ ";
                        Salida += "Genero : "+Arr.get(i).getGenero()+". ";
                        Salida += "\n"+"\n";
                       }
        return Salida;
    }
    
    
    @Override
    public void Eliminar(ArrayList<Pelicula> Arr, String id) {
        
                        for(int i=0; i<Arr.size(); i++){
                            if(Arr.get(i).getNombrePelicula().equalsIgnoreCase(id)){
                                Arr.remove(i);
                            }
                        }
    }
    
    @Override
    public String BuscarPorNombre(ArrayList<Pelicula> Arr, String id) {
        String Busqueda = "";
        for(int i=0; i<Arr.size(); i++){
                            if(Arr.get(i).getNombrePelicula().equalsIgnoreCase(id)){
                                Busqueda += Arr.get(i).getNombrePelicula();
                                Busqueda += " / " + Arr.get(i).getDirector();
                                Busqueda += " / "+Arr.get(i).getGenero(); 
                                Busqueda += " / "+Arr.get(i).getAño();
                                Busqueda += " / "+Arr.get(i).getID();
                                Busqueda += "\n"+"\n";
                            }
     
        }
        return Busqueda;
    }
    
      @Override
    public String BuscarPorDirector(ArrayList<Pelicula> Arr, String id) {
        String Busqueda = "";
        for(int i=0; i<Arr.size(); i++){
                            if(Arr.get(i).getDirector().equalsIgnoreCase(id)){
                                Busqueda += Arr.get(i).getNombrePelicula();
                                Busqueda += " / " + Arr.get(i).getDirector();
                                Busqueda += " / "+Arr.get(i).getGenero(); 
                                Busqueda += " / "+Arr.get(i).getAño();
                                Busqueda += " / "+Arr.get(i).getID();
                                Busqueda += "\n"+"\n";
                            }
     
        }
        return Busqueda;
    }

    @Override
    public String BuscarPorGenero(ArrayList<Pelicula> Arr, String id) {
        String Busqueda = "";
        for(int i=0; i<Arr.size(); i++){
                            if(Arr.get(i).getGenero().equalsIgnoreCase(id)){
                                Busqueda += Arr.get(i).getNombrePelicula();
                                Busqueda += " / " + Arr.get(i).getDirector();
                                Busqueda += " / "+Arr.get(i).getGenero(); 
                                Busqueda += " / "+Arr.get(i).getAño();
                                Busqueda += " / "+Arr.get(i).getID();
                                Busqueda += "\n"+"\n";
                            }
     
        }
        return Busqueda;
    }
    
    
    @Override
    public void Añadir(ArrayList<Pelicula> Arr) {
                    System.out.println("Ingrese el Nombre");
                    Nombre = teclado.nextLine();
                    System.out.println("Ingrese el Director");
                    Director = teclado.nextLine();
                    System.out.println("Ingrese el Genero");
                    Genero = teclado.nextLine();
                    System.out.println("Ingrese el Año");    
                    Año = teclado.nextInt();
                    System.out.println("Ingrese el ID");
                    ID = teclado.nextInt();
                    _pelicula.setNombre(Nombre);
                    _pelicula.setDirector(Director);
                    _pelicula.setGenero(Genero);
                    _pelicula.setAño(Año);
                    _pelicula.setID(ID);
                    Arr.add(_pelicula);
    }
    
    @Override
    public void Modificar(ArrayList<Pelicula> Arr) {
        
        
        System.out.println("Ingrese el Nombre de Pelicula a Modificar");
        id = teclado.nextLine();
  
            for(int i=0; i<Arr.size(); i++){
                if(Arr.get(i).getNombrePelicula().equalsIgnoreCase(id)){ 
                    System.out.println("Ingrese el Nuevo Nombre");
                    Nombre = teclado.nextLine();
                    System.out.println("Ingrese el Nuevo Director");
                    Director = teclado.nextLine();
                    System.out.println("Ingrese el Nuevo Genero");
                    Genero = teclado.nextLine();
                    System.out.println("Ingrese el Nuevo Año");    
                    Año = teclado.nextInt();
                    System.out.println("Ingrese el Nuevo ID");
                    ID = teclado.nextInt();
                    _pelicula.setNombre(Nombre);
                    _pelicula.setDirector(Director);
                    _pelicula.setGenero(Genero);
                    _pelicula.setAño(Año);
                    _pelicula.setID(ID);
                    Arr.set(i, _pelicula);
                    
                }    
            }
        }
    }
            
 
