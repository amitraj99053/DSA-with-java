import java.util.HashSet;
import java.util.Set;

public class LeetCodeQn23 {
// Qn 222. Happy Number
 /*
 Input: n = 19
 Output: true
 Explanation:
 12 + 92 = 82
 82 + 22 = 68
 62 + 82 = 100
 12 + 02 + 02 = 1    */

    public boolean isHappy(int n) {
        Set<Integer> seenNumbers = new HashSet<>();

        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = sumOfSquaredDigits(n);
        }
        return n == 1;
    }

    private int sumOfSquaredDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        LeetCodeQn23 solution = new LeetCodeQn23();
        int num1 = 19;
        int num2 = 2;
        int num3 = 7;
        int num4 = 28;

        System.out.println(num1 + " is a happy number: " + solution.isHappy(num1)); // Output: true
        System.out.println(num2 + " is a happy number: " + solution.isHappy(num2)); // Output: false
        System.out.println(num3 + " is a happy number: " + solution.isHappy(num3)); // Output: true
        System.out.println(num4 + " is a happy number: " + solution.isHappy(num4)); // Output: true
    }


}
