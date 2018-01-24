package main;
import java.util.Scanner;
import operation.IMCCalculate;
import structure.I_IMC;

public class EntryPoint {
    public static void main(String[] args) {
        // Variable necesarias
        double p;
        double t;
        double imcResult;
        
        // Instancia las clases necesarias
        Scanner scan = new Scanner(System.in);
        IMCCalculate imc = new IMCCalculate();
        
        // Obteniendo los valores (Peso y Estatura)
        System.out.print("Indique Peso:");
        p = scan.nextDouble();        
        System.out.print("Indique Estatura:");
        t = scan.nextDouble();
        
        // Aplicando la operación
        I_IMC inter = (x, y) -> (x / (y * y));
        imcResult = inter.calculateIMC(p, t);
        
        // Imprimiendo el resultado
        System.out.println(imc.resultIMC(imcResult));
    }
}
