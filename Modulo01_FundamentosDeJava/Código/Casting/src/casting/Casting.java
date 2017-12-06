package casting;

public class Casting {
    public static void main(String[] args) {
        // Declarando mis variables
        byte a = 12;
        Byte b = 10;
        Double c = 12.9;
        
        // Casting con variables primitivas
        System.out.println("El valor es: " + (int)a);
        
        // Casting con variables referenciales
        System.out.println("El valor es: " + b.intValue());
        System.out.println("El valor es: " + c.intValue());
    }
}
