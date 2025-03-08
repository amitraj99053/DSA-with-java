import java.util.Scanner;
// continue statement
// skip the value which is multiple of 10
public class enterNoExceptMultipleOf10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter no: ");
            int num = in.nextInt();
            if (num % 10 == 0){
                continue;
            }
            System.out.println(num);
        }while (true);
    }
}
