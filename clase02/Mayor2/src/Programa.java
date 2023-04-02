import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        // Ingresar dos números por teclado y mostrar el mayor

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese dos números: ");

        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();

        if (numero1 != numero2) { // Si son diferentes
            int mayor;

            //if (numero1 > numero2) { // Si el numero 1 es mayor que el numero 2
            //    mayor = numero1;
            //} else {
            //    mayor = numero2;
            //}

            // Operador ternario
            mayor = (numero1 > numero2)? numero1: numero2;

            System.out.println("El mayor es: " + mayor);
        } else {
            System.out.println("Son iguales");
        }

    }
}
