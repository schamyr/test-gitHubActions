import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private ICalculator calc;
    private int a, b;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
        a = 10;
        b = 5;
    }


    @Test
    void multiply() {
        int res = a*b;
        assertTrue(calc.multiply(a, b) == res, "multiplication de a et b");
    }

    @Test
    void divide() {
        int res = a/b;
        assertTrue(calc.divide(a, b) == res, "division de a et b");
    }

    @Test
    void add() {
        int res = a + b;
        assertTrue(calc.add(a, b) == res, "addition de a et b");
    }

    @Test
    void substract() {
        int res = a-b;
        assertTrue(calc.substract(a, b) == res, "soustraction de a et b");
    }
}