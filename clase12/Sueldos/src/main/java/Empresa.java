import java.util.HashMap;
public class Empresa {

    private HashMap<Integer,Empleado> plantel;

    public Empresa() {
        plantel = new HashMap<>();
    }

    public void agregarEmpleado(Empleado nuevo) {
        plantel.put(nuevo.getLegajo(), nuevo);
    }

    public double totalSueldos() {
        double suma = 0;

        for (Empleado e: plantel.values()) {
            suma += e.calcularSueldo(); // Polimorfismo: muchas formas
        }

        return suma;
        //return plantel.values().stream()
        //        .mapToDouble(Empleado::calcularSueldo)
        //        .sum();
    }
}
