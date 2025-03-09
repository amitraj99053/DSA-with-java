import java.util.Arrays;
import java.util.Scanner;
// plus one
/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain
any leading 0's.

Increment the large integer by one and return the resulting array of digits.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 */

public class leetCodeQn5 {

        public int[] plusOne(int[] digits) {
            int n = digits.length;
            for(int i = n -1; i >= 0; i--){
                if(digits[i] < 9){
                    digits[i]++;
                    return digits;
                }else {
                    digits[i] = 0;
                }
            }
            // it means all digits were 9
            int[] result = new int[n + 1];
            result[0] = 1;
            return result;
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the no digits: ");
        int n = in.nextInt();

        int[] digits = new int[n];
        System.out.print("Enter the digits separated by spaces: ");
        for(int i = 0; i < n; i++){
            digits[i] = in.nextInt();
        }

        leetCodeQn5 solution = new leetCodeQn5();
        int[] result = solution.plusOne(digits);

        System.out.println("Result: "+ Arrays.toString(result));
        in.close();


    }
}
