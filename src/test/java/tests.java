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
        assertEquals(8, resultado, "5 + 3 debe ser 8");
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
}