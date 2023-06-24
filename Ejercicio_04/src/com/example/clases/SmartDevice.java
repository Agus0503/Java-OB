package com.example.clases;

public class SmartDevice {

    String marca;
    String modelo;
    String color;
    Integer battery;

    public SmartDevice(){

    }

    public SmartDevice(String marca, String modelo, String color, Integer battery) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", battery=" + battery +
                '}';
    }
}
