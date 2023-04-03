import java.util.ArrayList;
import java.util.stream.Collectors;

public class Ticket {

    private ArrayList<Item> items;

    public Ticket() {
        items =  new ArrayList<>();
    }

    public void agregarItem(Item nuevo) {
        items.add(nuevo);
    }

    public double total() {
        double suma = 0;

        for (Item it: items) {
            suma += it.subTotal();
        }

        return suma;

        //return items.stream().mapToDouble(Item::subTotal).sum();
    }

    @Override
    public String toString() {
        String listado = "Ticket: \n";
        for (Item it: items)
            listado += it.toString() + "\n";
        listado += String.format("\n| %36s | %8.2f |", "Total: ", total());
        return listado;

        //return "Ticket: \n" +
        //    items.stream().map(Item::toString).collect(Collectors.joining("\n")) +
        //    String.format("\n| %36s | %8.2f |", "Total: ", total());
    }
}
