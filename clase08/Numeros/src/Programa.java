import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {

        ArrayList<Integer> listaNumeros = new ArrayList();

        listaNumeros.add(4);
        listaNumeros.add(14);
        listaNumeros.add(5);

        System.out.println("Cantidad de números: " + listaNumeros.size());

        System.out.println("Listado con for común");
        for(int i = 0; i < listaNumeros.size(); i++) {
            System.out.println(listaNumeros.get(i));
        }
        System.out.println("Listado con for mejorado");
        for (Integer cadaNumero : listaNumeros) {
            System.out.println(cadaNumero);
        }

        int suma = 0;
        for (Integer x: listaNumeros) {
            suma += x;
        }
        System.out.println("La suma de los números es: " + suma);


        System.out.println("Existe el 6: " + listaNumeros.contains(6));
        System.out.println("Existe el 14: " + listaNumeros.contains(14));


        ArrayList<String> dias = new ArrayList<>();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miercoles");
        dias.add("Jueves");

        System.out.println("Dias en los que pienso trabajar");
        for(String d: dias) {
            System.out.println(d);
        }

        System.out.println("Voy a trabajar en viernes?: " +

                (dias.contains("Viernes")? "Y bue...": "Minga!"));
    }
}