import java.util.Scanner;
public class LeetCodeQn28 {
// Qn 476. Number Complement
/* 
Example 1:
Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.

Example 2:
Input: num = 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.             */
    public int findComplement(int num) {
        if (num == 0) {
            return 1;
        }

        int temp = num;
        int bit = 1;
        while (temp > 0) {
            num = num ^ bit;
            bit = bit << 1;
            temp = temp >> 1;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        LeetCodeQn28 leetCodeQn28 = new LeetCodeQn28();
        int result = leetCodeQn28.findComplement(num);

        System.out.println(num+ "Complement is: "+ result);
    }
}