package quintaPregunta;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class BancoTest {
    private static Banco banco;

    @BeforeAll
    public static void setUp() {
        List<Cuenta> cuentas = new ArrayList<>();
        cuentas.add(new Cuenta("Alice", "12345", 1000.0));
        cuentas.add(new Cuenta("Bob", "67890", 2000.0));
        cuentas.add(new Cuenta("Charlie", "54321", 1500.0));

        banco = new Banco(cuentas);
    }

    @Test
    public void existeCuenta() {
        assertTrue(banco.existeCuenta("Alice"), "La cuenta debería existir");
    }

    @Test
    public void existeCuentaFallido() {
        assertFalse(banco.existeCuenta("NonExistentUser"), "La cuenta no debería existir");
    }

    @Test
    public void depositarTestExitoso() {
        banco.depositar("12345", 500.0);
        assertEquals(1500.0, banco.getCuentas().get(0).getSaldo(), "El saldo debería ser 1500.0");
    }

    @Test
    public void retirarTestExitoso() {
        banco.retirar("67890", 1000.0);
        assertEquals(1000.0, banco.getCuentas().get(1).getSaldo(), "El saldo debería ser 1000.0");
    }

    @Test
    public void depositarTestFallido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            banco.depositar("00000", 500.0);
        });
        assertEquals("No existe el numero de Cuenta", exception.getMessage());
    }

    @Test
    public void retirarTestFallido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            banco.retirar("54321", 2000.0);
        });
        assertEquals("Fondos insuficientes", exception.getMessage());
    }
}