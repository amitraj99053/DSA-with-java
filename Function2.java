import java.util.Scanner;

public class Function2 {
    public static int calculateSum(int num1, int num2){  // Addition
        return num1 + num2;
    }

    public static int calculateSub(int num1, int num2){ // subtraction
        return num1 - num2;
    }

    public static int calculateMul(int num1, int num2){  // multiplication
        return num1 * num2;
    }

    public static int calculateDiv(int num1, int num2){ // division
        return num1 / num2;
    }

    public static int calculateRemainder(int num1, int num2){  // remainder
        return num1 % num2;
    }

    public static void printFactorial(int num1){  // factorial
        if (num1 < 0){
            System.out.println("Negative num");
        }

        int factorial = 1;
        for(int i=num1; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println("Factorial of num1: "+ factorial);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two no's : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int sum = calculateSum(num1,num2);
        System.out.println("Sum of two no: "+ sum);

        int sub = calculateSub(num1,num2);
        System.out.println("Sub of two no: "+ sub);

        int mul = calculateMul(num1,num2);
        System.out.println("Multi of two no: "+ mul);

        int div = calculateDiv(num1,num2);
        System.out.println("Division of two no: "+ div);

        // same work as above in different this way
        System.out.println("Remainder of two no: "+ calculateRemainder(num1,num2));

        printFactorial(num1);
    }
}
