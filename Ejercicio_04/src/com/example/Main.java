/*
En este ejercicio tendréis que crear una clase SmartDevice.
 Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

Agregaréis atributos tal cual tendrían esos objetos en la realidad.
Crear constructor vacío y con todos los parámetros para cada clase.
Desde una clase Main: crearéis objetos de cada una y
los utilizaréis para imprimir sus valores por consola.
*/

package com.example;
import com.example.clases.SmartDevice;
import com.example.clases.SmartPhone;
import com.example.clases.SmartWatch;

public class Main {

    public static void main(String[] args) {

        SmartDevice smartDevice = new SmartDevice();
        SmartDevice smartDevice1 = new SmartDevice("Apple", "I03", "Black", 3500);

        SmartPhone smartPhone = new SmartPhone();
        SmartPhone smartPhone1 = new SmartPhone("Samsung", "A50", "Blue", 5000, 55.36d, 4);

        SmartWatch smartWatch = new SmartWatch();
        SmartWatch smartWatch1 = new SmartWatch("Apple", "Z35", "Black", 4000, true, 16, "Rectangle");

        System.out.println(smartDevice1);
        System.out.println(smartPhone1);
        System.out.println(smartWatch1);
    }
}