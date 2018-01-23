package com.main;
import com.rectangulos.Rectangulo;
import com.triangulos.Triangulo;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        // Variables necesarias
        int opcion;
        double a;
        double b;
        double resultado;
        
        // Clases necesarias
        Scanner scan = new Scanner(System.in);
        
        // Pintando las opciones del menu
        System.out.println("Opciones:");
        System.out.println("1 - Rectangulo:");
        System.out.println("2 - Triangulo:");
        System.out.print("Opción: ");
        
        // Obteniendo la opción del usuario
        opcion = scan.nextInt();
        
        // Solicitando datos necesarios
        System.out.print("Valor a:");
        a = scan.nextInt();
        
        System.out.print("Valor b:");
        b = scan.nextInt();
        
        // Evaluando la opción seleccionada
        if (opcion == 1) {
            Rectangulo rec = new Rectangulo();
            rec.setA(a);
            rec.setB(b);
            resultado = rec.calcularArea();
        } else {
            Triangulo tri = new Triangulo();
            tri.setA(a);
            tri.setB(b);
            resultado = tri.calcularArea();
        }
        
        // Mostrando el resultado
        System.out.println("El calculo del área es: " + resultado);
    }
}
