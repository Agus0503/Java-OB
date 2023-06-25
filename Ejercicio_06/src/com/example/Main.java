package com.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws IOException {

        /*Escribe el código que devuelva una cadena al revés.
         Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".*/

        String result = reverse("Hola Mundo");
        System.out.println(result);

        /*Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.*/
        String arrayList [] = {"value1", "value2", "value3"};
        for(String element : arrayList){
            System.out.println(element);
        }

        /*Crea un array bidimensional de enteros y recórrelo,
         mostrando la posición y el valor de cada elemento en ambas dimensiones.*/

        Integer numbers [][] = {  {1, 2, 3}, {4, 5, 6} };
        for (int i=0; i< numbers.length; i++){
            for(int j=0; j< numbers[i].length; j++){
                System.out.println("Position i: " + i + " " + "Position j: " + j);
                System.out.println("Value: " + numbers[i][j]);
            }
        }

        /*Crea un "Vector" del tipo de dato que prefieras,
         y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.*/

        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        System.out.print("Vector full: " + vector);

        vector.remove(2);
        vector.remove(3);

        System.out.print("\nVector after delete elements: " + vector);


        /*Indica cuál es el problema de utilizar un Vector con la capacidad
         por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
         Respuesta: El vector se duplica provocando una no eficiencia del programa*/

        /*Crea un ArrayList de tipo String, con 4 elementos.
        Cópialo en una LinkedList. Recorre ambos mostrando
         únicamente el valor de cada elemento.*/

        ArrayList<String> list = new ArrayList<>();
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        list.add("Element4");

        LinkedList<String> linkedlist = new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
            linkedlist.add(i, list.get(i));
        }

        System.out.println("ArrayList:");
        for (String elements : list) {
            System.out.print(elements + " ");
        }

        System.out.println("LinkedList:");
        for (String elements : linkedlist) {
            System.out.print(elements + " ");
        }

        /*Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo
         con elementos 1..10. A continuación, con otro bucle, recórrelo y
         elimina los numeros pares. Por último, vuelve a recorrerlo y
         muestra el ArrayList final. Si te atreves, puedes hacerlo en menos
         pasos, siempre y cuando cumplas el primer "for" de relleno.*/

        ArrayList<Integer> arrayList1 = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            if(i % 2 != 0){
                arrayList1.add(i);
            }
        }

        System.out.println("ArrayList point 6");
        for (int i = 0; i < arrayList1.size(); i++){
            System.out.println(arrayList1.get(i));
        }


        /*Crea una función DividePorCero. Esta, debe generar una excepción ("throws")
         a su llamante del tipo ArithmeticException que será capturada por su
         llamante (desde "main", por ejemplo). Si se dispara la excepción,
         mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos
         en cualquier caso: "Demo de código".*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica los numeros a dividir: ");
        System.out.println("Numero 1: ");
        int a = scanner.nextInt();
        System.out.println("Numero 2: ");
        int b = scanner.nextInt();
        try {
            System.out.println("Resultado: " + Divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Error de calculo");
        }

        /*Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros:
         "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero
          dado en el parámetro "fileIn" al fichero dado en "fileOut".*/

        copyFile("filePath", "destinyFile");

    }

    public static String reverse(String text) {

        char[] reverseTextArray = new char[text.length()];

        for (int i = 0; i < text.length() ; i++)
            reverseTextArray[text.length()-i-1] = text.charAt(i);

        String reverseText = new String(reverseTextArray);

        return reverseText;
    }

    private static int Divide(int a, int b) throws ArithmeticException {

        return a / b;
    }

    private static void copyFile(String fileIn, String fileOut) throws ArithmeticException, IOException {
        InputStream in = new FileInputStream(fileIn);
        byte [] dates = in.readAllBytes();

        PrintStream out = new PrintStream(fileOut);
        out.write(dates);
    }
}