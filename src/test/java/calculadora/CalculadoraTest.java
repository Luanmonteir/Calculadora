package calculadora;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    void testFactorialPositiveNumber() {
        Calculadora calc = new Calculadora();
        assertEquals(120,calc.factorial(5));
        assertEquals(1, calc.factorial(0));
    }

    @Test
    void testFactorialNegativeNumber() {
        Calculadora calc = new Calculadora();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.factorial(-1);
        });
        assertEquals("Negative number", exception.getMessage());
    }
    @Test
    public void testSoma() {
        Calculadora calc = new Calculadora()
                ;
        assertEquals(5, calc.soma(2, 3)); // 2 + 3 = 5
        assertEquals(0, calc.soma(-1, 1)); // -1 + 1 = 0
    }

    @Test
    public void testSubtracao() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.subtracao(3, 2)); // 3 - 2 = 1
        assertEquals(-2, calc.subtracao(1, 3)); // 1 - 3 = -2
    }

    @Test
    public void testDivisao() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.divisao(6, 3)); // 6 / 3 = 2
        assertEquals(5, calc.divisao(10, 2)); // 10 / 2 = 5
    }

    @Test
    public void testDivisaoPorZero() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divisao(10, 0);
        });
    }

    @Test
    void testMultiplicacao() {
        Calculadora calc = new Calculadora();
        assertEquals(20, calc.multiplicacao(4,5));
    }
    @Test
    void testPotencia() {
        Calculadora calc = new Calculadora();
        assertEquals(16, calc.potencia(2, 4));
        assertEquals(1, calc.potencia(5, 0));  // Qualquer número elevado a 0 é 1

    }


}
