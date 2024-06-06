package at.fhj.msd;

public class Calculator {

    public Calculator(){

    }

    public double add(double number1, double number2){
        return number1 + number2;
    }
    public double subtract(double number1, double number2){
        return number1 - number2;
    }
    public double multiply(double number1, double number2){
        return number1 * number2;
    }
    public double divide(double number1, double number2) {
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
