package forkjoinframework;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinFramework {
    public static void main(String[] args) {
        // Variables necesarias
        int[] numerosASumar = new int[200];
        
        // Llenamos el arreglo con valores
        Random ran = new Random();
        for(int i=0; i<numerosASumar.length; i++) {
            numerosASumar[i] = ran.nextInt();
        }
        
        // Creamos la instancia
        ForkJoinPool fjp = new ForkJoinPool();
        
        // Tomamos el tiempo al iniciar
        long tiempoInicio = System.currentTimeMillis();
        
        // Iniciamos la ejecución
        System.out.println("Total de la suma: " + fjp.invoke(new SumarEnteros(numerosASumar, 0)));
        
        // Tomamos el tiempo al terminar
        float tiempo = (System.currentTimeMillis() - tiempoInicio);
        
        // Lo imprimimos
        System.out.println("Tiempo: " + tiempo);
    }
}