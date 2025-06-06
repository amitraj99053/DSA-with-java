import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Qn6 {
    /* Given an integer array nums, return all the triplets [nums[i], 
    nums[j],  nums[k]] such that i != j, i != k, and j != k, and 
    nums[i] + nums[j] + nums[k] == 0. Notice that the solution set 
    must not contain duplicate triplets
    */

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; 
                } else {
                    right--; 
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Qn6 solution = new Qn6();

        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println("Triplets for nums1: " + solution.threeSum(nums1)); 

        int[] nums2 = {0, 1, 1};
        System.out.println("Triplets for nums2: " + solution.threeSum(nums2)); 

        int[] nums3 = {0, 0, 0};
        System.out.println("Triplets for nums3: " + solution.threeSum(nums3)); 

        int[] nums4 = {-2, 0, 1, 1, 2};
        System.out.println("Triplets for nums4: " + solution.threeSum(nums4));

        int[] nums5 = {};
        System.out.println("Triplets for nums5: " + solution.threeSum(nums5));

        int[] nums6 = {1, 2};
        System.out.println("Triplets for nums6: " + solution.threeSum(nums6));
    }
}