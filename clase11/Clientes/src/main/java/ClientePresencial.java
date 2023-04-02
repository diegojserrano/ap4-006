public class ClientePresencial extends Cliente {

    private int sucursal;

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public ClientePresencial(int numero, String nombre, String telefono, int sucursal) {
        super(numero, nombre, telefono);
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Cliente presencial: " + numero + " " + nombre + " " + telefono + " " + sucursal;
    }
}
