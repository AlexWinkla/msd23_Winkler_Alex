package at.fhj.msd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void calculationAddition(){
        final double expected = 4;
        double actual = new Calculator().add(2, 2);

        assertEquals(expected, actual, expected-actual);
    }

    @Test
    public void testCalcDiv(){
        assertThrows(ArithmeticException.class, () -> calculateDivision(5,0));
    }

    @Test
    public void testCalcDiv_1(){
        final double expected = 2;
        double actual = calculateDivision(20,10);
        assertEquals(expected, actual, expected - actual);
    }

    private double calculateDivision(int num1, int num2){
        return new Calculator().divide(num1, num2);
    }





    @Test
    public void testFactorial(){
        final double expected = 120;
        double actual = new Calculator().factorial(5);
        assertEquals(expected, actual, expected - actual);
    }
    @Test
    public void testFactorial_1(){
        final double expected = 0;
        double actual = new Calculator().factorial(-10);
        assertEquals(expected, actual, expected-actual);
    }
    @Test
    public void testFactorial_2(){
        final double expected = 1;
        double actual = new Calculator().factorial(1);
        assertEquals(expected, actual, expected-actual);
    }
    @Test
    public void testFactorial_3(){

        final double expected = 6;
        double actual = new Calculator().factorial(3);
        assertEquals(expected, actual, expected-actual);
    }

}
