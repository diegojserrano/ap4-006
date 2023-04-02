public class Persona {

    // Atributos de la clase
    private int documento;
    private String nombre;
    private String apellido;

    // Mensajes de asignación y consulta


    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (!apellido.isBlank())
            this.apellido = apellido;
    }

    // Constructor
    public Persona(int documento, String nombre, String apellido) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }


}
