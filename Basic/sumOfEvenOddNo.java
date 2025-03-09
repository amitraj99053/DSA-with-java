import java.util.Scanner;
// Write a program that reads a set of integers,and then prints the sum of the even and odd integers.
public class sumOfEvenOddNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("Enter no: ");
            num = in.nextInt();

            if (num % 2 == 0){
                evenSum += num;
            }else {
                oddSum += num;
            }

            System.out.print("Press 1 for continue: ");
            choice = in.nextInt();

        }while (choice == 1);
        System.out.println("Sum of even number: "+ evenSum);
        System.out.println("Sum of odd number: "+ oddSum);
    }
}
