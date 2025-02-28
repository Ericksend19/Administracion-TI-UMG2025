import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para la clase Calculadora.
 *
 * @author Erick Alcon <ealconv@miumg.edu.gt>
 * @version 1.0
 */
public class tests {
/**
     * Prueba el método sumar de la clase Calculadora.
     */
    @Test
    public void testSumar() {
        calculadora calc = new calculadora();
        int resultado = calc.sumar(2, 3);
        assertEquals(5, resultado, "2 + 3 debe ser 5");
    }

    /**
     * Prueba el método multiplicar de la clase Calculadora.
     */
    @Test
    public void testMultiplicar() {
        calculadora calc = new calculadora();
        int resultado = calc.multiplicar(5, 3);
        assertEquals(15, resultado, "5 * 3 debe ser 15");
    }

    /**
     * Prueba el método restar de la clase Calculadora.
     */
    @Test
    public void testRestar() {
        calculadora calc = new calculadora();
        int resultado = calc.restar(10, 4);
        assertEquals(6, resultado, "10 - 4 debe ser 6");
    }

    /**
     * Prueba el método dividir de la clase Calculadora.
     */
    @Test
    public void testDividir() {
        calculadora calc = new calculadora();
        int resultado = calc.dividir(20, 4);
        assertEquals(5, resultado, "20 / 4 debe ser 5");
    }

    /**
     * Prueba la división por cero en la clase Calculadora.
     */
    @Test
    public void testDividirPorCero() {
        calculadora calc = new calculadora();
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0), "Dividir por 0 debe lanzar una excepción");
    }
}