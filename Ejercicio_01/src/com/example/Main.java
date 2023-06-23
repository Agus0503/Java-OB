package com.example;

public class Main {

    public static void main(String[] args) {
        byte tipoByte = 4;
        short tipoShort = 50;
        int tipoInt = 24;
        long tipoLong = 2023;
        float tipoFloat = 5.55f;
        double tipoDouble = 35.444d;
        char tipoChar = 'A';
        String tipoString = "Hola Java";
        boolean falso = false;
        boolean verdadero = true;

        System.out.println("Byte => " + tipoByte);
        System.out.println("Short => " + tipoShort);
        System.out.println("Int => " + tipoInt);
        System.out.println("Long => " + tipoLong);
        System.out.println("Float => " + tipoFloat);
        System.out.println("Double => " + tipoDouble);
        System.out.println("Char => " + tipoChar);
        System.out.println("String => " + tipoString);
        System.out.println("Booleans => "  + falso + " | "+ verdadero);
    }
}