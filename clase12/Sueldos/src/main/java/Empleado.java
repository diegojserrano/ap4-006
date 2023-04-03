import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Empleado {

    private int legajo;
    private String nombre;
    private double sueldoBasico;

    public double calcularSueldo() {
        return 0;
    }

}
