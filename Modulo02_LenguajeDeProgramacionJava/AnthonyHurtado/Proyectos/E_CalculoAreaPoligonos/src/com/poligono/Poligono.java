package com.poligono;

public abstract class Poligono {
    // Atributos
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    // Método a implementar
    public abstract double calcularArea();
}
