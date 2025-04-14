import java.util.Scanner;
public class CheckNoIsPositive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if(num >= 0) {
            System.out.println("Positive no: "+num);
        } else {
            System.out.println("Negative no: "+num);
        }

        in.close();
    }
}
