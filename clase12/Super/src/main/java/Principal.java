import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {

        LectorTicket lt = new LectorTicket();

        Ticket t = lt.leer("ticket.csv");

        System.out.println(t);
    }
}
