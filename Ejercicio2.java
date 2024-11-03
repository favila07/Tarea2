/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;
import java.util.Scanner;

/**
 *
 * @author Real Madrid
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (num2 != 0) ? (double) num1 / num2 : 0;
        int modulo = (num2 != 0) ? num1 % num2 : 0;
        System.out.println("Resultados de las operaciones aritmeticas:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + (num2 != 0 ? division : "Error: Division por cero"));
        System.out.println("Modulo: " + (num2 != 0 ? modulo : "Error: Division por cero"));
        scanner.close();
    }
}

