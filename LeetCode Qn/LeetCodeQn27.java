import java.util.Scanner;
// Qn 342. Power of four
public class LeetCodeQn27 {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        LeetCodeQn27 leetCodeQn27 = new LeetCodeQn27();
        boolean result = leetCodeQn27.isPowerOfFour(num);

        System.out.println(num+ " is power of four: " +result);
    }
}
