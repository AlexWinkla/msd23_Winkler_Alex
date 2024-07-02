package at.fhj.msd;

import org.apache.logging.log4j.Logger;

/**
 * Calculator class for various useful methods
 * such as dividing or multiplying
 */
public class Calculator {

    /**
     * <code>logger</code> for protocol messages
     */
    private static final Logger logger = Main.logger;

    /**
     * Constructs new Calculator object
     */
    public Calculator(){}

    /**
     * adds two given numbers and returns the result
     * @param number1 first number to add
     * @param number2 second number to add
     * @return Addition result of the two numbers
     */
    public double add(double number1, double number2){
        logger.info("Adding two numbers: {} + {}", number1, number2);
        return number1 + number2;
    }

    /**
     * subtracts two given numbers and returns the result
     * @param number1 first number to subtract
     * @param number2 second number to subtract
     * @return Subtracts result of the two numbers
     */
    public double subtract(double number1, double number2){
        logger.debug("Subtracting two numbers: {} - {}", number1, number2);
        return number1 - number2;
    }

    /**
     * multiplies two given numbers and returns the result
     * @param number1 first number to multiply
     * @param number2 second number to multiply
     * @return Multiplication result of the two numbers
     */
    public double multiply(double number1, double number2){
        logger.debug("Multiplying two numbers: {} * {}", number1, number2);
        return number1 * number2;
    }

    /**
     * divides two given numbers and returns the result. <code>number2</code> cannot be 0 otherwise
     * <code>ArithmeticException</code> gets thrown.
     * @param number1 first number to divide
     * @param number2 second number to divide (cannot be 0)
     * @return Division result of the two numbers
     * @throws ArithmeticException if the number is 0
     */
    public double divide(double number1, double number2) {
        logger.debug("Dividing two numbers: {} / {}", number1, number2);
        if (number2 == 0) {
            Main.logger.error("Dividing with Zero is not possible!");
            throw new ArithmeticException();
        }
        return number1/number2;
    }

    /**
     * Calculates the factorial of a given number. Factorial means that the
     * number is always multiplied by the number smaller by 1 (of the given number)
     * until the number reaches 1. The factorial of 0 or less is also 1.
     * @param number from which the faculty is to be calculated
     * @return Value of the faculty
     */
    public double factorial(double number){
        //negative number should be 0
        if (number < 0)
            return 0;
        if (number <= 1)
            return 1;
        else
            return number * factorial(number-1);
    }
}
