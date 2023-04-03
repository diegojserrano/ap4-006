public class Vendedor extends Empleado {

    public double totalVentas;

    public Vendedor(int legajo, String nombre, double sueldoBasico, double totalVentas) {
        super(legajo, nombre, sueldoBasico);
        this.totalVentas = totalVentas;
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBasico() + totalVentas * 0.01;
    }
}
