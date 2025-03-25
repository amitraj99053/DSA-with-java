import java.util.Arrays;
// 1005. Maximize sum of array after k negatives

public class leetCodeQn20 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        while(k > 0 && i < n && nums[i] < 0) {
            nums[i] = -nums[i];
            k--;
            i++;
        }
        if(k % 2 == 1) {
            Arrays.sort(nums);
            nums[0] = -nums[0];
        }
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
        
    } 

    public static void main(String[] args) {
        leetCodeQn20 solution = new leetCodeQn20();

        // Test case 1
        int[] nums1 = {4, 2, 3};
        int k1 = 1;
        int result1 = solution.largestSumAfterKNegations(nums1, k1);
        System.out.println("Test Case 1: " + result1); // Output: 5

        // Test case 2
        int[] nums2 = {3, -1, 0, 2};
        int k2 = 3;
        int result2 = solution.largestSumAfterKNegations(nums2, k2);
        System.out.println("Test Case 2: " + result2); // Output: 6

        // Test case 3
        int[] nums3 = {2, -3, -1, 5, -4};
        int k3 = 2;
        int result3 = solution.largestSumAfterKNegations(nums3, k3);
        System.out.println("Test Case 3: " + result3); // Output: 13

        // Test case 4
        int[] nums4 = {-8,3,-5,-3,-5,-2};
        int k4 = 6;
        int result4 = solution.largestSumAfterKNegations(nums4, k4);
        System.out.println("Test Case 4: " + result4); // Output: 22

        // Test case 5
        int[] nums5 = {5,6,9};
        int k5= 1;
        int result5= solution.largestSumAfterKNegations(nums5, k5);
        System.out.println("Test Case 5: " + result5); // Output: 20
    
    }
}
