package com.example.clases;

public class SmartPhone extends SmartDevice{

    Double sizeScreen;
    Integer ramMemory;

    public SmartPhone() {

    }

    public SmartPhone(String marca, String modelo, String color, Integer battery, Double sizeScreen, Integer ramMemory) {
        super(marca, modelo, color, battery);
        this.sizeScreen = sizeScreen;
        this.ramMemory = ramMemory;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "sizeScreen=" + sizeScreen +
                ", ramMemory=" + ramMemory +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", battery=" + battery +
                '}';
    }
}
