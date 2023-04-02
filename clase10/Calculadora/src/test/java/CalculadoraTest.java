import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    public void sumar() {

        Calculadora c = new Calculadora();
        assertEquals(4, c.sumar(2,2), " Suma de dos positivos ");
        assertEquals(0, c.sumar(0,0), "Suma de dos ceros");
        assertEquals(-1, c.sumar(-2,1), "Suma con resultado negativo");

    }

}