public class Programa {
    public static void main(String[] args) {

        // Llegó una persona nueva, voy a crear un objeto para representarla

        Persona a = new Persona(111, "Juan", "Perez");

        Persona b = new Persona(122, "Juana", "Pereza");


        System.out.println(a.getDocumento() + " " + a.getNombre() + " " + a.getApellido());
        System.out.println(b.getDocumento() + " " + b.getNombre() + " " + b.getApellido());

        a.setNombre("Pablo");
        System.out.println(a.getDocumento() + " " + a.getNombre() + " " + a.getApellido());
    }

}
