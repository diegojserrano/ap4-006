import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor
public class Item {

    private long codigo;
    private String descripcion;
    private float cantidad;
    private double precioUnitario;

    public double subTotal() {
        return cantidad * precioUnitario;
    }

    @Override
    public String toString() {
        return String.format("| %10d | %-15s | %5.2f | %8.2f |",
                codigo, descripcion, cantidad, precioUnitario);
    }
}
