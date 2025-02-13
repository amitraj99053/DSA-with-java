import java.util.Scanner;
// average of three number
public class Qn5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int average = (num1 + num2 + num3)/3;
        System.out.println(average);
    }
}
