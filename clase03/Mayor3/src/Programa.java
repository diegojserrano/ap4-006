import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1, n2, n3, mayor;

        System.out.println("Ingrese tres números");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();

        // Alternativa 1: Comparo de a dos y voy descartando
        if (n1 > n2) {  // n2 no es el mayor, lo puedo descartar
            if (n1 > n3) {
                mayor = n1;
            } else {
                mayor = n3;
            }
        } else { // n1 no es el mayor, lo puedo descartar
            if (n2 > n3) {
                mayor = n2;
            } else {
                mayor = n3;
            }
        }


        // Alternativa 2: Voy a suponer que el mayor es el primero
        //  && devuelve verdadero si ambos operandos son verdaderos y falso en caso contrario
        if (n1 > n2 && n1 > n3) { // El mayor es el primero
            mayor = n1;
        } else { // Puedo descartar al primero
            if (n2 > n3) {
                mayor = n2;
            } else {
                mayor = n3;
            }
        }

        // Alternativa 3: Calcular mayores parciales
        if (n1 > n2) {
            mayor = n1;
        } else {
            mayor = n2;
        }
        // Aca la variable mayor tiene el mayor parcial entre los dos primeros
        if (n3 > mayor) {
            mayor = n3;
        }

        System.out.println("El mayor es " + mayor);

    }
}
