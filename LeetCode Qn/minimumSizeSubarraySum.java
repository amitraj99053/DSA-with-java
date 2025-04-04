public class minimumSizeSubarraySum {
    // Qn 209. Minimum Size Subarray Sum
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        minimumSizeSubarraySum solution = new minimumSizeSubarraySum();

        // Example 1
        int target1 = 7;
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int result1 = solution.minSubArrayLen(target1, nums1);
        System.out.println("Example 1: target = " + target1 + ", nums = " + java.util.Arrays.toString(nums1) + ", Result = " + result1); // Output: 2

        // Example 2
        int target2 = 4;
        int[] nums2 = {1, 4, 4};
        int result2 = solution.minSubArrayLen(target2, nums2);
        System.out.println("Example 2: target = " + target2 + ", nums = " + java.util.Arrays.toString(nums2) + ", Result = " + result2); // Output: 1

        // Example 3
        int target3 = 11;
        int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
        int result3 = solution.minSubArrayLen(target3, nums3);
        System.out.println("Example 3: target = " + target3 + ", nums = " + java.util.Arrays.toString(nums3) + ", Result = " + result3); // Output: 0

        // Example 4
        int target4 = 15;
        int[] nums4 = {1,2,3,4,5};
        int result4 = solution.minSubArrayLen(target4, nums4);
        System.out.println("Example 4: target = " + target4 + ", nums = " + java.util.Arrays.toString(nums4) + ", Result = " + result4);

        //Example 5
        int target5 = 213;
        int[] nums5 = {12,28,83,4,25,26,25,2,25,25,25,12};
        int result5 = solution.minSubArrayLen(target5, nums5);
        System.out.println("Example 5: target = " + target5 + ", nums = " + java.util.Arrays.toString(nums5) + ", Result = " + result5);

        
    }
}
