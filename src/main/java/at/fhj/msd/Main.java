package at.fhj.msd;

import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int progNum = getUserInput();
        String prog = "";
        switch (progNum){
            case 1 -> prog = "add";
            case 2 -> prog = "subtract";
            case 3 -> prog = "multiply";
            case 4 -> prog = "divide";
        }
        separatorLine();
        double num1 = getNumInput("1", prog);
        double num2 = getNumInput("2", prog);
        separatorLine();
        double result = 0;
        switch (progNum){
            case 1 -> result = new Calculator().add(num1, num2);
            case 2 -> result = new Calculator().subtract(num1, num2);
            case 3 -> result = new Calculator().multiply(num1, num2);
            case 4 -> result = new Calculator().divide(num1, num2);
        }
        System.out.println("Result: " + result);
    }

    private static int getUserInput(){
        int programNumber = 0;
        System.out.println("Hello Sir, welcome to Super Double Calculator");
        while (true){
            System.out.println("Please enter a number which chooses the program");
            System.out.println();
            System.out.println("1 => add to numbers");
            System.out.println("2 => subtract to numbers");
            System.out.println("3 => multiply to numbers");
            System.out.println("4 => divide to numbers");
            separatorLine();
            System.out.print("Program: ");
            try {
                programNumber = Integer.parseInt(SCANNER.nextLine());
                if (programNumber < 1 || programNumber > 4)
                    throw new RuntimeException();
                return programNumber;
            }catch (NumberFormatException ignored){
                System.out.println("This was not a valid input");
            }catch (RuntimeException ignored){
                System.out.println(" " + programNumber + " is not a valid program");
            }

        }
    }

    private static double getNumInput(String count, String prog){
        double num = 0;
        while (true){
            System.out.print("Number " + count + ": ");
            try {
                num = Double.parseDouble(SCANNER.nextLine());
                if (prog.equals("divide") && num <= 0  && count.equals("2"))
                    throw new RuntimeException();
                return num;
            }catch (NumberFormatException ignored){
                System.out.println("Invalid double input");
            }catch (RuntimeException ignored){
                System.out.println("division with 0 is not possible");
            }
        }
    }
    private static void separatorLine(){
        System.out.println("-".repeat(50));
    }
}
