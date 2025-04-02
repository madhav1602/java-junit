import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    @Test
    public void add() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.add(5, 5));
    }
    @Test
    public void subtract() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.subtract(5, 5));
    }
    @Test
    public void multiply() {
        Calculator calc = new Calculator();
        assertEquals(25, calc.multiply(5, 5));
    }
    @Test
    public void divide() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.divide(5, 5));
    }

    @Test
    public void testException(){
        Calculator calc=new Calculator();
        assertThrows(ArithmeticException.class, ()-> {calc.divide(5,0);});
    }
}
