import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Path archivo = Paths.get("personas2.txt");
        Scanner lector = new Scanner(archivo);

        lector.useDelimiter("[;\\n]");

        Padron listaPersonas = new Padron();

        while (lector.hasNextInt()) {
            int doc = lector.nextInt();
            String nom = lector.next();
            String ape = lector.next();
            int edad = lector.nextInt();

            Persona nueva = new Persona(doc, nom, ape, edad);
            listaPersonas.agregarPersona(nueva);
            //System.out.println(nueva);
        }

        lector.close();

        System.out.println("Se leyeron del archivo " + listaPersonas.cantidadPersonas() + " personas ");
        System.out.println("El promedio de sus edades es: " + listaPersonas.promedioEdades());



        Scanner teclado = new Scanner(System.in);
/*
        System.out.println("Ingrese el documento de la persona que quiere buscar: ");
        int documentoBuscado = teclado.nextInt();
        Persona encontrada = listaPersonas.buscarPersona(documentoBuscado);
        if (encontrada == null)
            System.out.println("No la encontré");
        else
            System.out.println("Encontré " + encontrada);
*/
        System.out.println("Ingrese el nombre de las personas que quiere buscar: ");
        String nombreBuscado = teclado.nextLine();

        List<Persona> enc = listaPersonas.listarPorNombre(nombreBuscado);

        if (enc.isEmpty()) {
            System.out.println("No se encuentran personas llamadas " + nombreBuscado);
        } else {
            System.out.println("Listado de todas las personas que se llaman " + nombreBuscado);
            //for (Persona p : enc) {
            //    System.out.println(p);
            //}

            enc.stream().forEach(System.out::println);
        }
    }

}