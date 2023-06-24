/*
Crear una interfaz CocheCRUD.
Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
Como métodos de CocheCRUD podemos poner:
save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
Ejemplo:
CocheCRUD cocheCrud = new CocheCRUDImpl()
*/

package com.example.clases;
import com.example.interfaces.CocheCRUD;

public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.save(new Coche());
        cocheCrud.findAll();
        cocheCrud.delete(new Coche());

    }
}