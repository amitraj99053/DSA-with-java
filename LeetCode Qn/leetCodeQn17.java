import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// QN.219 Contains Duplicate II
public class leetCodeQn17 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                if(i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of element: ");
        int n = in.nextInt();

        System.out.println("Enter element: ");
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }

        System.out.println("Enter Kth no: ");
        int k = in.nextInt();
        
        leetCodeQn17 solution = new leetCodeQn17();
        boolean result = solution.containsNearbyDuplicate(nums, k);

        System.out.println(result);

    }
}
