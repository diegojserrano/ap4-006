public class Principal {
    public static void main(String[] args) {

        Empresa em = new Empresa();

        em.agregarEmpleado(new Obrero(1,"Juan",100000, 23));
        em.agregarEmpleado(new Administrativo(2, "Pedro", 100000, false));
        em.agregarEmpleado(new Vendedor(3,"Ana", 100000,5000000));

        // 115
        // 113
        // 150
        // Total: 378

        System.out.println(em.totalSueldos());
    }
}
