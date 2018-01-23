/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import exceptions.NotValidNameException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import person.Person;

/**
 *
 * @author instructor
 */
public class Crud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> personLst = new ArrayList<Person>();
        Person p;
        int option = 0, option2 = 0;
        boolean next = false;
        //Java ManagedBean = controlador
        
        String menu = "OPCIONES:\n1.Crear.\n2.Buscar.\n3.Editar"
                +"\n4.Eliminar.\n5.Salir.\nOpción: ";
        
        do {
            System.out.print(menu);
            try {
                option = sc.nextInt();
                next = true;
            } catch(InputMismatchException ime) {
                System.out.println("Solo números enteros.");
                sc.next();
            } finally {
                if(option < 1 || option > 5) {
                    System.out.println("Debe ingresar una opción válida.");
                    next = false;
                }
            }
            
            if(next) {
                // Continuamos con el programa
                switch(option) {
                    case 1:// Agregar
                        p = new Person();
                        // Pedimos los datos de la persona

                        try {
                            System.out.println("Ingrese el nombre: ");
                            sc.nextLine();
                            p.setCompleteName(sc.nextLine());
                        } catch(NotValidNameException ex) {
                            System.out.println("Sólo letras.");
                        }


                        System.out.println("Ingrese la CI: ");
                        p.setIdentification(sc.nextLine());

                        System.out.println("Ingrese la fecha de nacimiento en formato yyyy-mm-dd: ");
                        p.setBirthDate(sc.nextLine());

                        personLst.add(p);
                    break;
                    case 2:
                        showPeople(personLst);
                    break;
                    case 3:
                        option2 = 0;
                        showPeople(personLst);
                        System.out.print("Ingrese el índice de la persona a modificar: ");
                        option2 = sc.nextInt();
                    break;
                    default:
                        System.out.println("Nos han hackeado, estoy saliendo.");
                    break;
                }
            }
            
        } while((option < 1 || option > 5) || option != 5);
    }
    
    static void showPeople(ArrayList pl) {
        Person pe;
        for(int i = 0; i < pl.size(); i++) {
            pe = (Person)pl.get(i);
            System.out.println(i + " - " +pe.getCompleteName());
            System.out.print("\n");
        }
        
        /*for(Object p: pl) {
            System.out.println();
        }*/
    }
}