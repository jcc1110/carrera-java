package com.rectangulos;
import com.poligono.Poligono;

public class Rectangulo extends Poligono {
    @Override
    public double calcularArea() {
        double resultado = super.getA() * super.getB();
        return resultado;
    }
}
