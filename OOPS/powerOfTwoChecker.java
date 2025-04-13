import java.util.Scanner;

class PowerOfTwoChecker {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        
        System.out.println(num1 + " is a power of 2: " + isPowerOfTwo(num1));

        in.close();
    }
}