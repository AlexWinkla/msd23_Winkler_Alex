package at.fhj.msd;

import java.util.Random;
import java.util.Scanner;

public class Main {

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
            System.out.println("Result: " + result);
        }

    }

    private static void separatorLine(){
        System.out.println("-".repeat(50));
    }
}
