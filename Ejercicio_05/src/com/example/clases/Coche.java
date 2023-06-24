package com.example.clases;

public class Coche {

    String color;
    String fabicante;
    String modelo;
    Double peso;

    public Coche(){}

    public Coche(String color, String fabicante, String modelo, Double peso) {
        this.color = color;
        this.fabicante = fabicante;
        this.modelo = modelo;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabicante='" + fabicante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                '}';
    }
}
