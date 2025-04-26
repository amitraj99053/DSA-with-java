import java.util.Scanner;
// Qn 231. Power of Two 
public class LeetCodeQn25 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        LeetCodeQn25 leetCodeQn25 = new LeetCodeQn25();
        boolean result = leetCodeQn25.isPowerOfTwo(num);

        System.err.println(num+ " is a power of two: " +result);
        in.close();
    }
}
