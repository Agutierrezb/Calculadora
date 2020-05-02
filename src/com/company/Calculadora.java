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
}                                      /*   Metodo sumar
                                            Entrada: Double
                                            Salida: Double
                                            El metodo toma la variable "a" y la suma con la variable "b",
                                            retornando el resultado de esta operación.*/

    double restar() {
        return a - b;
    }                                   /*  Metodo restar
                                            Entrada: Double
                                            Salida: Double
                                            El metodo toma la variable "a" y la resta con la variable "b",
                                            retornando el resultado de esta operación.*/

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
