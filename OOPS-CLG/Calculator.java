import java.util.Scanner;
/*
Write a Java program that implements a calculator using a switch statement. 
The calculator should support + (Addition), - (Subtraction), * (Multiplication), / (Division), % (Modulus). 
If the operator is invalid, print "Invalid operation!". If division (/ or %) is attempted with 0 as the divisor, 
display "Error: Division by zero not allowed".   */
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two no and operator: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        String operator = in.next();
        int result = 0;

        switch (operator) {
            case "+":
            result = num1 + num2;
            System.out.println("Addition: " +result);
            break;

            case "-":
            result = num1 - num2;
            System.out.println("Subtraction: " +result);
            break;

            case "*":
            result = num1 * num2;
            System.out.println("Multiplication: " +result);
            break;

            case "/":
            if (num2 == 0) {
                System.out.println("Error: Division by zero not allowed");
            } else {
                result = num1 / num2;
                System.out.println("Division: " +result);
            }
            break;

            case "%":
            if (num2 == 0) {
                System.out.println("Error: Division by zero not allowed");
            } else {
                result = num1 % num2;
                System.out.println("Moduls: " +result);
            }
            break;

            default:
            System.out.println("Invalid Operation: ");

        }

    }
}
