import java.util.Scanner;
public class FindMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two no: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int maximum = Math.max(num1, num2);
        System.out.println("Maximum of "+ num1+ " and "+ num2+ " is: " +maximum);
        in.close();
    }
}
