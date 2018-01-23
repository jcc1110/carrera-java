package expresioneslambda;

public class Aritmetica implements Operacion {
    @Override
    public int sumar(int x, int y) {
        int resultado;
        resultado = x + y;
        return resultado;
    }
}
