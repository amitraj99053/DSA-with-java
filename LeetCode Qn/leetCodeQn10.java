import java.util.Arrays;
import java.util.Scanner;
// Qn 31. Next Permutation
class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i + 1, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public int minSubArrayLen(int target1, int[] nums1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'minSubArrayLen'");
    }
}

public class leetCodeQn10 { // Or any name for your main class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the elements of the array (space-separated): ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        solution.nextPermutation(nums);

        System.out.println("Next permutation: " + Arrays.toString(nums));

        scanner.close();
    }
}