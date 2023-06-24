package com.example.clases;

public class SmartWatch extends SmartDevice{

    Boolean gps;
    Integer buttons;
    String typeScreen;

    public SmartWatch(){

    }

    public SmartWatch(String marca, String modelo, String color, Integer battery, Boolean gps, Integer buttons, String typeScreen) {
        super(marca, modelo, color, battery);
        this.gps = gps;
        this.buttons = buttons;
        this.typeScreen = typeScreen;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "gps=" + gps +
                ", buttons=" + buttons +
                ", typeScreen='" + typeScreen + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", battery=" + battery +
                '}';
    }
}
