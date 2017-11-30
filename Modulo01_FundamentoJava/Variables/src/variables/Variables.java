package variables;

public class Variables {
    // Declaraciòn de mis variables globales
    static byte a = 10;
    static Integer c = 2;

    public static void main(String[] args) {
        // Declaraciòn de mis variables
        int b = 5;
        
        // Presentaciòn de los valores
        System.out.println("El valor de mi variable global es: " + a);
        System.out.println("El valor de mi variable local es: " + b);
        System.out.println("El valor de mi variable referencial es: " + c.compareTo(b));
        
        // Modificar mi variable global
        a = 12;
        
        // Realizando una llamada a un método
        saludar();
    }
    
    public static void saludar() {
        // Declaraciòn de mis variables
        int b = 15;
        
        // Presentaciòn de los valores
        System.out.println("El valor de mi variable global es:" + a);
        System.out.println("El valor de mi variable local es:" + b);
    }
}
