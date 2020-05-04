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
                                            retornando el resultado de esta operación.
                                            Autor: Felipe Sanzana*/

    double restar() {
        return a - b;
    }                                   /*  Metodo restar
                                            Entrada: Double
                                            Salida: Double
                                            El metodo toma la variable "a" y la resta con la variable "b",
                                            retornando el resultado de esta operación.
                                            Autor: Felipe Sanzana*/

    double multiplicar() {
        return a * b;
    }                                   /*  Metodo multiplicar
                                            Entrada: Double
                                            Salida: Double
                                            El metodo toma la variable "a" y la mutiplica con la variable "b",
                                            retornando el resultado de esta operación.
                                            Autor: Arturo Gutiérrez*/

    double dividir() {
        return a / b;
    }                                   /* Metodo dividir
                                            Entrada: Double
                                            Salida: Double
                                            El metodo toma la variable "a" y la divide con la variable "b",
                                            retornando el resultado de esta operación.
                                            Autor: Arturo Gutiérrez*/

    double mayor() {
        return Math.max(a, b);
    }                                   /* Metodo mayor
                                            Entrada: Double
                                            Salida: Double
                                            El metodo compra la variable "a" y "b", retornando el numero mayor.
                                            Autor: Vicente Silva*/

    double potencia() {
        return Math.pow(a, b);
    }                                   /* Metodo potencia
                                            Entrada: Double
                                            Salida: Double
                                            El metodo toma la variable "a" como base y su exponente es "b",
                                            retornado el resultado de la potencia.
                                            Autor: Vicente Silva*/
}
