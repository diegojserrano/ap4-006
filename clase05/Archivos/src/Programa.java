import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Programa {
    public static void main(String[] args) throws IOException {

         Path archivo = Paths.get("archivo.txt");
         Path carpeta = Paths.get(".");

         long tamaño = Files.size(archivo);

         System.out.println(tamaño);
         // No miren esto
         //Files.list(carpeta).forEach(System.out::println);

         for(String linea :Files.readAllLines(archivo)) {
             System.out.println(linea);
         }
    }

}
