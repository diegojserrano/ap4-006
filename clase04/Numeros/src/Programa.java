// Ingresar números por teclado, solicitando previamente al usuario
// la cantidad de dichos números.
// Informar:
//        * Listado de todos los números cargados
//        * Suma de todos los números
//        * Promedio de todos los pares

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int []numeros; // numeros es un arreglo de enteros

        System.out.print("Ingrese la cantidad de números que desea cargar: ");
        int cantidad = sc.nextInt();

        numeros = new int[cantidad]; // crea el arreglo de tamaño igual a la cantidad pedida


        System.out.println("Ingrese " + cantidad + " números: ");
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("Listado de los números ingresados:");
        //for(int i = 0; i < numeros.length; i++) {
        //    System.out.println(numeros[i]);
        //}

        for (int num:numeros) { // Por cada valor x que pertenece al arreglo
            System.out.println(num);
        }

        int suma = 0;
        //for(int i = 0; i < numeros.length; i++) {
        //    suma += numeros[i];
        //}

        for(int num: numeros) {
            suma += num;
        }

        System.out.println("La suma de todos es: " + suma);

        int sumaPares = 0, cantidadPares = 0;
        for(int num: numeros) {
            // Un numero es par si al dividirlo por 2,
            // el resto de la división es 0.
            if (num % 2 == 0) {
                sumaPares += num;
                cantidadPares++;
            }
        }

        if (cantidadPares > 0) {
            float promedio = (float) sumaPares / cantidadPares;
            System.out.println("El promedio de los pares es: " + promedio);
        } else {
            System.out.println("No se ingresó ningún número par");
        }


    }
}
