/*
Para este ejercicio tendréis que crear una función
que reciba un precio y devuelva el precio con el IVA incluido.
*/
package com.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese precio: ");
        double price = scanner.nextDouble();
        price = getIvaPrice(price);
        System.out.println("El precio ingresado + IVA es: " + price);
    }

    static double getIvaPrice(double price){
        return price + (price * 1.21);
    }
}