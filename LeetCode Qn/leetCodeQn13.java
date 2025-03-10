import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
// Qn217. Contains Duplicate

public class leetCodeQn13 {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return false;
        }

        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }

        leetCodeQn13 solution = new leetCodeQn13();
        boolean result = solution.containsDuplicate(nums);
        System.out.println(result);
        in.close();

    }
}
