package com.triangulos;
import com.poligono.Poligono;

public class Triangulo extends Poligono {
    @Override
    public double calcularArea() {
        double resultado = 1/2 * (super.getA() * super.getB());
        return resultado;
    }   
}
