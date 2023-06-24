/*
En este ejercicio tenéis que crear un bucle que permita
concatenar textos e imprima el resultado final por consola.

Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:

String[] nombres = {"", "", "", ""}
*/
public class Main {

    public static void main(String[] args) {

        String[] names = {"Agus", "Victor", "Alan"};
        String[] last_names = {"Ruiz", "Roman", "Sastre"};

        for (int i = 0; i < names.length; i++) {
            names[i] = names [i] + " " + last_names [i];
            System.out.println(names[i]);
        }
    }
}