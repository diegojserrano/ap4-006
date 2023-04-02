import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese dos números");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();

        // La operación de asignación espera a que la suma se termine de calcular
        // y guarda el resultado
        int suma = numero1 + numero2;
        int diferencia = numero1 - numero2;
        int producto = numero1 * numero2;
        // (float) es un "molde" o "cast"


        // Imprimir los resultados
        System.out.println("Entre los números " + numero1 + " y " + numero2);
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + diferencia);
        System.out.println("La multiplicación es: " + producto);

        //Si el numero 2 es distinto de 0....
        if (numero2 != 0) {
            float cociente = (float) numero1 / numero2;
            System.out.println("La división es: " + cociente);
        } else {
            System.out.println("No puedo dividir por 0");
        }

        System.out.println("Gracias por usar la calculadora");

    }

}
