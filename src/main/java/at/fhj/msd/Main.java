package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class Main {

    protected static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        System.out.println("Winkler Alex");
        separatorLine();
        Random random = new Random();
        double result = 0, num1, num2;
        for (int i = 0; i < 4; i++) {
            num1 = random.nextInt(1,201);
            num2 = random.nextInt(1,201);
            switch (i){
                case 0 -> result = new Calculator().add(num1, num2);
                case 1 -> result = new Calculator().subtract(num1, num2);
                case 2 -> result = new Calculator().multiply(num1, num2);
                case 3 -> result = new Calculator().divide(num1, num2);
            }
            if (i == 2)
                logger.error("Error on multiply result");
            if (i == 1)
                logger.info("Here is an info for add method");
            System.out.println("Result: " + result);
        }
        separatorLine();
        System.out.println(new Calculator().divide(10, 0));

    }

    private static void separatorLine(){
        System.out.println("-".repeat(50));
    }
}
