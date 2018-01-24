/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

/**
 *
 * @author instructor
 */
public class External {// Inicio clase externa
    // Atributos
    public static int ExtAttr1 = 10;
    public int ExtAttr2 = 20;
    private int ExtAttr3 = 30;
    
    // Métodos de clase externa
    public void extMethod() {
        //this.
    }
    
    ///////////////////////////////////
    // Clase interna estática
    public static class InnerStatic {// Inicio clase interna
        public String InnAttr1 = "Hola1";
        public String InnAttr2 = "Hola2";
        
        // Métodos de clase interna
        public static void innMethodOne() {
            System.out.print("Muestra desde clase interna estática: ");
            System.out.println(ExtAttr1);
            
        }
    }// Fin clase interna
    //---------------------------------
    // Clases internas no estáticas
    // Clases internas de miembro
    // Públicas
    public class InnerNonStaticMemberClass {// Inicio clase interna
        
        public InnerNonStaticMemberClass() {
            System.out.println(ExtAttr2);
            System.out.println(ExtAttr3);
        }
    }// Fin clase interna
    
    // Privada
    private class InnerNonStaticMemberClass1 {// Inicio clase interna
        
        public InnerNonStaticMemberClass1() {
            System.out.println(ExtAttr2);
            System.out.println(ExtAttr3);
        }
    }// Fin clase interna
    //------------------------------------------
    // Clases internas de método
    // método de clase externa
    public void getInnerValue() {
        // Variables locales
        int number = 100;
        class InnerNonStaticMethodClass {// Inicio clase interna
            char Letter = 'A';
            
            void showLetter() {
                System.out.println("Atributo de "
                        + "clase interna de "
                        + "método: " + this.Letter);
                System.out.println("Variable local"
                        + " del método: " + number);
            }
        }// Fin clase interna
        
        // Trabajamos con un objeto de la clase interna creada
        InnerNonStaticMethodClass insmc = new InnerNonStaticMethodClass();
        insmc.showLetter();
    }
    
    // Clases internas anónimas
    // Creamos una interfaz interna
    private interface AnonClass {
        void showAnonAttr();
    }
    
    // Método externo
    public void methodOne() {
        AnonClass ac = new AnonClass() {
            public String AnotherAttr = "Soy un dato anónimo.";
            
            public void showAnonAttr() {
                System.out.println("Atributo anónimo: " + this.AnotherAttr);
            }
        };
        
        ac.showAnonAttr();
    }
    ///////////////////////////////////
    
}// Fin clase externa








