import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el nombre del archivo: ");
        String nombre = teclado.nextLine();

        Path archivo = Paths.get(nombre);
        if (Files.exists(archivo)) {
            System.out.print("Ingrese el texto que quiere buscar: ");
            String buscado = teclado.nextLine();
            int numeroLinea = 0;
            boolean encontrado = false;

            for(String linea :Files.readAllLines(archivo)) {
                numeroLinea++;
                if (linea.toLowerCase().contains(buscado.toLowerCase())) {
                    System.out.println("Linea " + numeroLinea + ": " + linea);
                    encontrado = true;
                }
            }

            if (encontrado == false) {
                System.out.println("No se encontró.");
            }

        } else {
            System.out.println("El archivo no existe.");
        }

    }

}
