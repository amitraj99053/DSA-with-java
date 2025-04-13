import java.util.Scanner;
public class swapOfTwoNoWithoutThirdVar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Two number: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Before swap: a = " + a + ", b = " + b);
        // Swap using arithmetic operations 
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);

        in.close();
    }
}
