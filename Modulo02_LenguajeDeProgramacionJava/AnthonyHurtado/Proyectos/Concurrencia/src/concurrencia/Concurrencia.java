package concurrencia;

public class Concurrencia {
    public static void main(String[] args) {
        Contador contador = new Contador(); 
        HiloContador h1 = new HiloContador("HiloUno", contador);
        HiloContador h2 = new HiloContador("HiloDos", contador);
        
        h1.start();
        h2.start();
    }
}
