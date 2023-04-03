public class Administrativo extends Empleado {

    private boolean cumplioPresentismo;

    public Administrativo(int legajo, String nombre, double sueldoBasico, boolean cumplioPresentismo) {
        super(legajo, nombre, sueldoBasico);
        this.cumplioPresentismo = cumplioPresentismo;
    }

    @Override
    public double calcularSueldo() {
        double sueldo = getSueldoBasico();
        if (cumplioPresentismo) sueldo *= 1.13;
        return sueldo;
    }
}
