import java.sql.*;

public class Principal {

    public static void main(String[] args) throws SQLException {

        // Establece la conexión a la base de datos
        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/Personas006","root","root");

        // Crea un objeto statement para enviar sentencias SQL
        Statement st = conn.createStatement();

        // Ejecuta una sentencia
        ResultSet rs = st.executeQuery("select * from personas");
        while(rs.next()) {
            // Una vuelta por cada fila del resultado
            int doc = rs.getInt("documento");
            String nom = rs.getString("nombre");
            String ape = rs.getString("apellido");
            int edad = rs.getInt("edad");

            System.out.println(doc + " - " + nom + " - " + ape + " - " + edad);
        }

        rs.close();
        conn.close();
    }
}
