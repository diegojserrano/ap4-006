import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Cliente cl0;



        ClienteOnline cl1 = new ClienteOnline(1, "Pedro", "2345654", "pedro@juarez.com.ar");
        ClientePresencial cl2 = new ClientePresencial(2, "Rosa", "----", 46);


        System.out.println(cl1);
        System.out.println(cl2);


        ArrayList<Cliente> clientes = new ArrayList<>();

        clientes.add(cl1);
        clientes.add(cl2);


    }
}
