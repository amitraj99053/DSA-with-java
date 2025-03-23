import java.util.ArrayList;
import java.util.List;
// Qn 448. Find All Numbers Disappeared in an Array
public class leetCodeQn19 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0) {
                nums[val] *= -1;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        leetCodeQn19 solution = new leetCodeQn19();
        System.out.println(solution.findDisappearedNumbers(nums1));
        System.out.println();

        int[] nums2 = {1, 1};
        System.out.println(solution.findDisappearedNumbers(nums2));
    }
}
        
