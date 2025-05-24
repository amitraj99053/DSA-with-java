import java.util.ArrayList;
import java.util.List;
// Qn 46. Permutations 

public class LeetCodeQn31 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> currentPermutation, int[] nums) {
        if (currentPermutation.size() == nums.length) {
            result.add(new ArrayList<>(currentPermutation));
            return;
        }

        for (int num : nums) {
            if (!currentPermutation.contains(num)) {
                currentPermutation.add(num);
                backtrack(result, currentPermutation, nums);
                currentPermutation.remove(currentPermutation.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        LeetCodeQn31 solution = new LeetCodeQn31(); 

        int[] nums1 = {1, 2, 3};
        List<List<Integer>> permutations1 = solution.permute(nums1);
        System.out.println("Input: " + java.util.Arrays.toString(nums1));
        System.out.println("Output: " + permutations1);

        int[] nums2 = {0, 1};
        List<List<Integer>> permutations2 = solution.permute(nums2);
        System.out.println("Input: " + java.util.Arrays.toString(nums2));
        System.out.println("Output: " + permutations2);
       
        int[] nums3 = {1};
        List<List<Integer>> permutations3 = solution.permute(nums3);
        System.out.println("Input: " + java.util.Arrays.toString(nums3));
        System.out.println("Output: " + permutations3);
    }
}