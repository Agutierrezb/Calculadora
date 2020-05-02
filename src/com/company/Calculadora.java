package com.company;

import java.lang.Math;

class Calculadora {
    private double a;
    private double b;

    Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double getA() {
        return a;
    }

    void setA(double a) {
        this.a = a;
    }

    double getB() {
        return b;
    }

    void setB(double b) {
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