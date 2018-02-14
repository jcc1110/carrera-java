
/**
 *
 * @author John Erice / Immer Gonzalez
 * Proyecto modulo 2 de Java
 * @version 1.0
 */
package controllers;


public class operation {
    @FunctionalInterface
    public interface calcular{
        
        public abstract double operacion(double v1, double v2);
    }
    
    public static void main (String[] args){
    
      calcular funcion = (v1,v2) -> v1+v2;

}
}