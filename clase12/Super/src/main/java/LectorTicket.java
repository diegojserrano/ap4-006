import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LectorTicket {

    public Ticket leer(String nombreArchivo) throws IOException {
        Path archivo = Paths.get(nombreArchivo);
        Scanner lector = new Scanner(archivo);

        lector.useDelimiter("[;\\n]");

        Ticket t = new Ticket();

        while(lector.hasNextLong()) {
            long cod = lector.nextLong();
            String desc = lector.next();
            float cant = lector.nextFloat();
            double pu = lector.nextDouble();

            Item nuevo = new Item(cod, desc, cant, pu);
            t.agregarItem(nuevo);
        }

        lector.close();
        return t;
    }
}
