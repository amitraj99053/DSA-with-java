import java.util.Scanner;
// Qn.136  Single Number
public class leetCodeQn12 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the elements separated by spaces: ");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        leetCodeQn12 solution = new leetCodeQn12(); // Create an instance of leetCodeQn12
        int single = solution.singleNumber(nums); // Call singleNumber on the correct instance

        System.out.println("The single number is: " + single);
        in.close();       
    }
}
