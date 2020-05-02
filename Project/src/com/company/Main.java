package com.company;


import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Calculadora calculadora = new Calculadora(0, 0);

    public static void main(String[] args) {
        menu();

    }

    private static void menu() {
        int seleccion = -1;
        do {
            System.out.println("Calculadora" + '\n' +
                    "Seleccione una operación:" + '\n' +
                    "1) Suma" + '\n' +
                    "2) Resta" + '\n' +
                    "3) Multiplicación" + '\n' +
                    "4) Division" + '\n' +
                    "5) Mayor de dos números" + '\n' +
                    "6) Potencia de un número" + '\n' +
                    "0) Salir");


            seleccion = scanner.nextInt();
            switch (seleccion) {
                case 1:
                    System.out.println("Ingrese los números a sumar:");
                    System.out.println("a: ");
                    calculadora.setA(scanner.nextDouble());
                    System.out.println("b: ");
                    calculadora.setB(scanner.nextDouble());
                    System.out.println("La suma entre " + calculadora.getA() + " y " + calculadora.getB() + " es: " + calculadora.sumar());
                    break;
                case 2:
                    System.out.println("Ingrese los números a restar:");
                    System.out.println("a: ");
                    calculadora.setA(scanner.nextDouble());
                    System.out.println("b: ");
                    calculadora.setB(scanner.nextDouble());
                    System.out.println("La resta entre " + calculadora.getA() + " y " + calculadora.getB() + " es: " + calculadora.restar());
                    break;
                case 3:
                    System.out.println("Ingrese los números a multiplicar:");
                    System.out.println("a: ");
                    calculadora.setA(scanner.nextDouble());
                    System.out.println("b: ");
                    calculadora.setB(scanner.nextDouble());
                    System.out.println("El producto entre " + calculadora.getA() + " y " + calculadora.getB() + " es: " + calculadora.multiplicar());
                    break;
                case 4:
                    System.out.println("Ingrese los números a dividir:");
                    System.out.println("a: ");
                    calculadora.setA(scanner.nextDouble());
                    System.out.println("b: ");
                    calculadora.setB(scanner.nextDouble());
                    System.out.println("El cociente entre " + calculadora.getA() + " y " + calculadora.getB() + " es: " + calculadora.dividir());
                    break;
                case 5:
                    System.out.println("Ingrese dos números: ");
                    System.out.println("a: ");
                    calculadora.setA(scanner.nextDouble());
                    System.out.println("b: ");
                    calculadora.setB(scanner.nextDouble());
                    System.out.println("El mayor número entre " + calculadora.getA() + " y " + calculadora.getB() + " es: " + calculadora.mayor());
                    break;
                case 6:
                    System.out.println("Ingrese una base y un exponente: ");
                    System.out.println("Base: ");
                    calculadora.setA(scanner.nextDouble());
                    System.out.println("Exponente: ");
                    calculadora.setB(scanner.nextDouble());
                    System.out.println(calculadora.getA() + " elevado a " + calculadora.getB() + " es: " + calculadora.potencia());
                    break;
                case 0:
                    seleccion = 0;
                    break;
                default:
                    seleccion = -1;
                    break;

            }
        } while (seleccion != 0);
    }
}
