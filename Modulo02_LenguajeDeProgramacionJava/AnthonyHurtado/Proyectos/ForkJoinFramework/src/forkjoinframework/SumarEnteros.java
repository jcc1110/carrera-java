package forkjoinframework;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RecursiveTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SumarEnteros extends RecursiveTask<Long> {
    // Atributos
    private int[] numeros;
    private Long suma = new Long(0);
    private int inicio = 0;
    private static int pasos = 50;
    
    // Constructor
    public SumarEnteros(int[] numeros, int inicial) {
        this.numeros = numeros;
        this.inicio = inicial;
    }
 
    @Override
    protected Long compute() {
        // Tomar un parte del arreglo para procesarlo
        int fin = (this.inicio + this.pasos) > this.numeros.length ? this.numeros.length : (this.inicio + this.pasos);
        /*if ((this.inicio + this.pasos) > this.numeros.length) {
            fin = this.numeros.length;
        } else {
            fin = (this.inicio + this.pasos);
        }*/
        int[] parte = Arrays.copyOfRange(this.numeros, this.inicio, fin);
        SumarEnteros subTarea = null;
    
        // Mientras no llegue al final del arreglo
        if(this.inicio < this.numeros.length) {
            
            // creo otra tarea para seguir partiendo el arreglo
            subTarea = new SumarEnteros(this.numeros, this.inicio + this.pasos);
      
            // Dejo la tarea disponible para que el pool la ejecute
            subTarea.fork();
        }
        
        // Hago el trabajo de sumar la parte que guarde
        int i = 0;
        while(parte != null && i < this.pasos && i+1 < parte.length) {
            try { 
                System.out.println(parte[i]);
                this.suma += parte[i];
            } catch (Exception ex) {
                System.out.println("Error:" + ex.getMessage());
            }
            i++;
        }
        
        // Le pido a mi subtarea que me regrese su resultado y se lo sumo a la cuenta que llevo
        if(subTarea != null) {
            this.suma += subTarea.join();
            
            /*try {
                this.suma += subTarea.get();
            } catch (InterruptedException ex) {
                Logger.getLogger(SumarEnteros.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(SumarEnteros.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }

        // Retorno el resultado de la suma
        return this.suma;
    }
}
