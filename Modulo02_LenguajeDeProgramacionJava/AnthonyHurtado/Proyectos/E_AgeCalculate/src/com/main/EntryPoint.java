package com.main;

import com.structure.AgeOperation;
import java.util.Scanner;

public class EntryPoint {
    public static void main(String[] args) {        
        // Declarando las clases necesarias
        Scanner scan = new Scanner(System.in);
        AgeOperation ao = new AgeOperation();
        
        // Obteniendo los datos del usuario
        System.out.print("Introduce el año: ");
        ao.setYear(scan.nextInt());
        
        System.out.print("Introduce el mes: ");
        ao.setMonth(scan.nextInt());
        
        System.out.print("Introduce el día: ");
        ao.setDay(scan.nextInt());
        
        // Calculando la edad
        System.out.println(ao.ageCalculate());
    }
}
