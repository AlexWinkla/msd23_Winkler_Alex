package at.fhj.msd;

import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = Main.logger;

    public Calculator(){

    }


    public double add(double number1, double number2){
        logger.info("Adding two numbers: {} + {}", number1, number2);
        return number1 + number2;
    }
    public double subtract(double number1, double number2){
        logger.debug("Subtracting two numbers: {} - {}", number1, number2);
        return number1 - number2;
    }
    public double multiply(double number1, double number2){
        logger.debug("Multiplying two numbers: {} * {}", number1, number2);
        return number1 * number2;
    }
    public double divide(double number1, double number2) {
        logger.debug("Dividing two numbers: {} / {}", number1, number2);
        if (number2 == 0) {
            Main.logger.error("Dividing with Zero is not possible!");
            throw new ArithmeticException();
        }
        return number1/number2;
    }
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
