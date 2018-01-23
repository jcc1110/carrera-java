/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

/**
 *
 * @author instructor
 */
public class Casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Casting implícito
        byte aByte = 100;
        int aInt = 300;
        float aFloat = 100.20F;
        double aDouble = 3988.65;
        
        // aDouble = aFloat = aInt = aByte;
        System.out.println("El byte convertido en int es: " + aDouble);
        
        // Casting explícito
        aFloat = (float) aDouble;
        aInt = (int) aFloat;
        aByte = (byte) aInt;
        System.out.println("El byte convertido en int es: " + aByte);
        
        char aChar;
        aInt = -99876;
        aChar = (char) aInt;
        System.out.println("El int convertido en char es: " + aChar);
    }
    
}
