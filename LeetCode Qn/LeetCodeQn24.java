import java.util.Scanner;
// Qn 326. Power of three
// Given an integer n, return true if it is a power of three. Otherwise, return false.
class LeetCodeQn24 {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = in.nextInt();

        LeetCodeQn24 leetCodeQn24 = new LeetCodeQn24(); 
        boolean result = leetCodeQn24.isPowerOfThree(num);

        System.out.println(num + " is a power of three: " + result);
        in.close();
    }
}