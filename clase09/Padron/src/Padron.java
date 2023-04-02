import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Padron {

    private HashMap<Integer, Persona> personas;

    public Padron() {
        personas = new HashMap<>();
    }

    public void agregarPersona(Persona nueva) {
        personas.put(nueva.getDocumento(),nueva);
    }

    public int cantidadPersonas() {
        return personas.size();
    }

    public float promedioEdades() {

        /*int suma = 0;
        for(Persona p: personas.values()) {
            suma += p.getEdad();
        }

        float promedio = (float)suma / cantidadPersonas();
        return promedio;
        */

        return (float) personas.values().stream().mapToDouble(Persona::getEdad).average().getAsDouble();

    }

    public Persona buscarPersona(int documento) {
        return personas.get(documento);
    }

    public List<Persona> listarPorNombre(String nombreBuscado) {
        /*ArrayList<Persona> encontradas = new ArrayList<>();

        for (Persona p: personas.values()) {
            if (p.getNombre().equals(nombreBuscado))
                encontradas.add(p);
        }

        return encontradas;*/

        return personas.values().stream().filter(p -> p.getNombre().equals(nombreBuscado)).toList();
    }


}
