import java.util.Scanner;
// enter number till multiple of 10
public class enterNumberTillMultipleOf10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter your no: ");
            int num = in.nextInt();
            if (num % 10 == 0){ // stop loop
                break;
            }
            System.out.println(num);
        }while (true);
        System.out.println("Loop stop");

    }
}
