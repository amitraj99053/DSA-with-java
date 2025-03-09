import java.util.Scanner;
// check no. is positive or negative
public class NoIsPosiOrNeg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num >= 0){
            System.out.println("Positive");
        }else {
            System.out.println("Negative");
        }
    }
}
