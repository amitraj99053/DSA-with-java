import java.util.Scanner;
// checks if a number is positive, negative or zero.
public class CheckNoIsPositive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();

        if(num > 0) {
            System.out.println("Positive no: "+num);
        } else if (num < 0) {
            System.err.println("Negative no: "+num);
        } else {
            System.out.println("Zero no: "+ num);
        }

        in.close();
    }
}
