package expresioneslambda;

public class ExpresionesLambda {
    public static void main(String[] args) {
        int resultado;
        
        Aritmetica arit = new Aritmetica();
        resultado = arit.sumar(3, 2);
        System.out.println("El resultado es:" + resultado);
        
        Operacion op = (x, y) -> (x+y)/2;
        resultado = op.sumar(3, 5);
        System.out.println("El resultado es:" + resultado);
    }
}
