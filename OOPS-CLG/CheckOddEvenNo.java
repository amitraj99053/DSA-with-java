import java.util.Scanner;
public class CheckOddEvenNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if((num % 2) == 0) {
            System.out.println("Even no: "+ num);
        } else {
            System.out.println("Odd no: "+ num);
        }

        in.close();
    }
}
