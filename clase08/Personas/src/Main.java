import java.sql.SQLOutput;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        Persona a = new Persona(111,"Juan", "Perez", 23);
        Persona b = new Persona(112,"Maria", "Romo", 20);

        HashMap<Integer, Persona> plantel = new HashMap<>();

        plantel.put(a.getDocumento(),a);
        plantel.put(b.getDocumento(),b);

        System.out.println("Busqueda de personas");
        System.out.println("Persona 111: " + plantel.get(111));
        System.out.println("Persona 156: " + plantel.get(156));
        System.out.println("Persona 112: " + plantel.get(112));

        System.out.println("Listado de todas las personas");
        for (Persona p: plantel.values()) {
            System.out.println(p);
        }

    }
}