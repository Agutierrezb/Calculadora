package com.company;

import java.lang.Math;

public class Calculadora {
    private double a;
    private double b;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

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

    double sumar() {
        return a + b;
    }

    double restar() {
        return a - b;
    }

    double multiplicar() {
        return a * b;
    }

    double dividir() {
        return a / b;
    }

    double mayor() {
        return Math.max(a, b);
    }

    double potencia() {
        return Math.pow(a, b);
    }
}
