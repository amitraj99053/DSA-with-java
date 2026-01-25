
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            System.out.print("Enter the number of elements in the array: ");
            int size = in.nextInt();
            int[] nums = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                nums[i] = in.nextInt();
            }

            System.out.print("Enter the target sum: ");
            int target = in.nextInt();

            TwoSum solution = new TwoSum();
            int[] result = solution.twoSum(nums, target);

            if (result.length == 2) {
                System.out.println("Indices: " + Arrays.toString(result));
                System.out.println("Values: [" + nums[result[0]] + ", " + nums[result[1]] + "]");
            } else {
                System.out.println("No two sum solution found.");
            }
        }

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (map.containsKey(rem)) {
                return new int[]{map.get(rem), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
