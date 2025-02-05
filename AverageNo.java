import java.util.Scanner;

public class AverageNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three no: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int avg = (num1+num2+num3)/3;
        System.out.println("Average of three no: "+avg);
    }
}
