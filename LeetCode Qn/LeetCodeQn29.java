import java.util.Scanner;

public class LeetCodeQn29 {
    // Qn 509 Fibonacci Number
    public static int Fabonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        LeetCodeQn29 leetCodeQn29 = new LeetCodeQn29();
        int result = leetCodeQn29.Fabonacci(n);

        System.out.println("fabonacci for " +n+ " is: " +result);
        in.close();

    }
}
