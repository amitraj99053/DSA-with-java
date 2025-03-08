import java.util.Scanner;

public class printFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int fact = 1;

        System.out.print("Enter positive no: ");
        num = in.nextInt();

        for (int i=1; i<=num; i++){
            fact *= i;
        }
        System.out.println("Factorial: "+ fact);
    }
}
