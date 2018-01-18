package clasesanidadas;

public class ClasesAnidadas {
    public static void main(String[] args) {
        
        Operaciones.Suma suma = new Operaciones.Suma();
        suma.setA(3);
        suma.setB(4);
        System.out.println("Resultado: "+ suma.calcular());
    }
}
