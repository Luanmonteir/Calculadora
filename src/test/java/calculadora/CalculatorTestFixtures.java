package calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTestFixtures {
    private Calculadora calc;

    private int positiveNumber;
    private int zeroNumber;
    private int negativeNumber;
    private int number1;
    private int number2;
    private int zero;


    @BeforeEach
    void setUp() {

        calc= new Calculadora ();
        positiveNumber = 5;
        zeroNumber = 0;
        number1 = 5;
        number2 = 3;
        zero = 0;
        negativeNumber = -1;


    }
    @Test
    void testFatorialPositive() {
        assertEquals(120, calc.factorial(positiveNumber));
    }

    // Teste para o fatorial de zero
    @Test
    void testFatorialZero() {
        assertEquals(1, calc.factorial(zeroNumber));
    }


    @Test
    void testFatorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.factorial(negativeNumber);  // Exceção para número negativo
        }, "Fatorial não definido para números negativos");
    }

    // Teste para soma
    @Test
    void testAddition() {
        assertEquals(8, calc.soma(number1, number2));
        assertEquals(5, calc.soma(number1, zero));
    }

    // Teste para subtração
    @Test
    void testSubtraction() {
        assertEquals(2, calc.subtracao(number1, number2));
        assertEquals(5, calc.subtracao(number1, zero));
    }

    // Teste para multiplicação
    @Test
    void testMultiplication() {
        assertEquals(15, calc.multiplicacao(number1, number2));
        assertEquals(0, calc.multiplicacao(number1, zero));
    }

    // Teste para divisão
    @Test
    void testDivision() {
        assertEquals(5, calc.divisao(15, number2));

    }
    @Test
    void testDivisionPorZero(){
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divisao(10, 0);
        });
    }

    // Teste para potência
    @Test
    void testPotencia() {
        assertEquals(125, calc.potencia(number1, number2));
        assertEquals(1, calc.potencia(number1, zero));
        assertEquals(9, calc.potencia(number2, 2));
    }
    @Test
    void testMultipleOperations() {
        //Fatoração
        assertEquals(120, calc.factorial(positiveNumber));
        assertEquals(6, calc.factorial(3));
        assertEquals(24, calc.factorial(4));
        assertEquals(1, calc.factorial(zeroNumber));
        // Soma
        assertEquals(8, calc.soma(5, 3));
        assertEquals(0, calc.soma(-3, 3));
        // Subtração
        assertEquals(2, calc.subtracao(5, 3));
        assertEquals(-6, calc.subtracao(-3, 3));
        // Multiplicação
        assertEquals(15, calc.multiplicacao(5, 3));
        assertEquals(0, calc.multiplicacao(5, 0));
        // Divisão
        assertEquals(5, calc.divisao(15, 3));

        // Potência
        assertEquals(32, calc.potencia(2, 5));
        assertEquals(1, calc.potencia(5, 0));
    }

}

