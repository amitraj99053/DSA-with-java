import java.util.Scanner;
// Qn 258. Add Digits
/* 
 Example 1:
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.

Example 2:
Input: num = 0
Output: 0                    */
public class LeetCodeQn26 {

    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        LeetCodeQn26 leetCodeQn26 = new LeetCodeQn26();
        int result = leetCodeQn26.addDigits(num);

        System.out.println("Result after repeatedly adding digits: " +result);
        in.close();
    }
}