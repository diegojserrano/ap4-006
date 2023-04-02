public class ClienteOnline extends Cliente {

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ClienteOnline() {
        System.out.println("Constructor de cliente online");
    }

    public ClienteOnline(int numero, String nombre, String telefono, String email) {
        super(numero, nombre, telefono);
        this.email = email;
    }

    // Cuando tengo intención de sobreescribir:
    @Override
    public String toString() {
        return "Cliente online: " + numero + " " + nombre + " " + telefono + " " + email;
    }

}
