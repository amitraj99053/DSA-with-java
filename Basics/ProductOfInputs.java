import java.util.Scanner;

public class ProductOfInputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first no: ");
        int num1 = in.nextInt();

        System.out.println("Enter second no: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " + " + num2 + " = "+ (num1+num2));
        System.out.println(num1 + " - " + num2 + " = "+ (num1-num2));
        System.out.println(num1 + " X " + num2 + " = "+ (num1*num2));
        System.out.println(num1 + " / " + num2 + " = "+ (num1/num2));
        System.out.println(num1 + " % " + num2 + " = "+ (num1%num2));

    }
}
