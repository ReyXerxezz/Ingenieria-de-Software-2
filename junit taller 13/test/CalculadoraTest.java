import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private static Calculadora calculadora;

    @BeforeAll
    public static void init() {
        calculadora = new Calculadora();
    }

    @Test
    void sumar() {
        int resultant = calculadora.sumar(2, 3);
        assertEquals(5, resultant);
        assertNotEquals(4, resultant);
        assertTrue(resultant > 0);
        assertFalse(false);
    }

    @Test
    void restar() {
        int resultant = calculadora.restar(5, 3);
        assertEquals(2, resultant);
        assertNotEquals(0, resultant);
        assertTrue(resultant >= 0);
        assertFalse(false);
    }

    @Test
    void multiplicar() {
        int resultant = calculadora.multiplicar(4, 2);
        assertEquals(8, resultant);
        assertNotEquals(0, resultant);
        assertTrue(resultant > 0);
        assertFalse(false);
    }

    @Test
    void dividir() {
        double resultant = calculadora.dividir(10, 2);
        assertEquals(5.0, resultant);
        assertNotEquals(3.0, resultant);
        assertTrue(resultant > 0);
        assertFalse(false);
    }
}