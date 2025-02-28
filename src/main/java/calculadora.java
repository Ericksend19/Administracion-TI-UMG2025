/**
 * Clase que realiza operaciones matemáticas básicas.
 *
 * @author Erick Alcon <ealconv@miumg.edu.gt>
 * @version 1.1
 */
public class calculadora{

    /**
     * Suma dos números enteros.
     *
     * @param a Primer número.
     * @param b Segundo número.
     * @return Resultado de la suma.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números enteros.
     *
     * @param a Minuendo.
     * @param b Sustraendo.
     * @return Resultado de la resta.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros.
     *
     * @param a Primer número.
     * @param b Segundo número.
     * @return Resultado de la multiplicación.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números enteros.
     *
     * @param a Dividendo.
     * @param b Divisor (debe ser diferente de 0).
     * @return Resultado de la división.
     * @throws ArithmeticException Si el divisor es 0.
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }
}