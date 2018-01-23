/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism2;

import com.polygon.Polygon;
import com.triangle.Triangle;
import com.rectangle.Rectangle;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author instructor
 */
public class Polymorphism2 {
    // Variables globales
    public static ArrayList<Polygon> polyLst = new ArrayList<Polygon>();
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();
        showData();
        
        //sc.close();
    }
    
    // Funciones
    public static void menu() {
        // Variables locales
        int option;
        char again;
        do{
            do {
                System.out.println("Escoja una figura:");
                System.out.println("1. Triángulo.");
                System.out.println("2. Rectángulo.");
                System.out.print("Opción: ");
                option = sc.nextInt();
            } while(option < 1 || option > 2);

            switch(option) {
                case 1: setTriangle(); break;
                case 2: setRectangle(); break;
            }
            System.out.println();
            System.out.print("¿Desea agregar otro polígono? (s/n): ");
            again = sc.next().charAt(0);
            System.out.println("");
        } while(again == 's' || again == 'S');        
    }

    public static void setTriangle() {
        // Variables locales
        double s1, s2, s3;
        
        System.out.println("Ingrese el lado #1: ");
        s1 = sc.nextDouble();
        
        System.out.println("Ingrese el lado #2: ");
        s2 = sc.nextDouble();
        
        System.out.println("Ingrese el lado #3: ");
        s3 = sc.nextDouble();
        
        Polygon t = new Triangle(s1,s2,s3);
        polyLst.add(t);
    }
    
    public static void setRectangle() {
        // Variables locales
        double s1, s2;
        
        System.out.println("Ingrese el lado #1: ");
        s1 = sc.nextDouble();
        
        System.out.println("Ingrese el lado #2: ");
        s2 = sc.nextDouble();
        
        Polygon r = new Rectangle(s1,s2);
        polyLst.add(r);
    }

    public static void showData() {
        for(Polygon p : polyLst) {
            System.out.println(p.toString());
            System.out.println();
        }
    }
    
}