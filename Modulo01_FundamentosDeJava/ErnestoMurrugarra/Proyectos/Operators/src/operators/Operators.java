/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

/**
 *
 * @author instructor
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variables numéricas
        float a = 40.20F, b = 10.13F;
        int c = 9, d = 3;
        
        System.out.println("Operadores Aritméticos");
        System.out.println(a + b);
        System.out.println(-a - b);
        System.out.println(c / d);
        System.out.println(c % d);
        
        System.out.println("\nOperadores de relación");
        System.out.println(c > d);
        System.out.println(c > d);
        
        System.out.println("\nOperadores lógicos");
        System.out.println((c < d) && (c > 0));
        System.out.println((c < d) || (c > 0));
        System.out.println(!(c < d) && (c > 0));
        
        System.out.println("\nOperadores de asignación");
        System.out.println("EL valor de la variable \"d\" es: " + d);
        d++; // Incrementando. Equivalente sería: d = d + 1;
        d++;
        d--;
        d--;
        System.out.println("El valor de la variable \"d\" es: " + d);
        c += 2; // c = c + 2;
        c += 5; // c = c + 5;
        c += 10; // c = c + 10;
        System.out.println("EL valor de la variable \"c\" es: " + c);
        
        System.out.println("\nProcedencia de operadores");
        int result = 0;
        
        result = (3 + (4 * (9 / 3)) - (3 * (9 * 9)));
        System.out.println(result);
    }
    
}
