public class Punto {

    public double x;
    public double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public int cuadrante() {
        if (x == 0 && y == 0) return 0; // 0: esta en el origen
        if (x == 0)           return -1; // -1: eje de las ordenadas
        if (y == 0)           return -2; // -2: eje de las abscisas
        if (x > 0)            return (y > 0) ? 1: 4;
        else                  return (y > 0) ? 2: 3;
    }

    public double distanciaOrigen() {
        // Teorema de Pitagoras:
        // raiz cuadrada de la suma de los cuadrados de las coordenadas
        return Math.sqrt(x*x + y*y);
    }

    public String toString() {
        int cuad = cuadrante();
        String donde;
        if (cuad == 0) donde = "en el origen";
        else if (cuad == -1) donde = "en el eje de las ordenadas";
        else if (cuad == -2) donde = "en el eje de las abscisas";
        else donde = "el cuadrante " + cuad;

        return "El punto (" + x + "," + y + ") está " + donde + " y su distancia al origen es de " + distanciaOrigen();
    }
}
