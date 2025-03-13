import java.util.Scanner;
// QN34. Find first and last position of element in sorted array 
public class leetCodeQn16 {

    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums == null || nums.length == 0) {
            return result;
        }

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        result[0] = first;
        result[1] = last;

        return result;
    }

    private int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
                if (nums[mid] == target) {
                    index = mid;
                }
            } else {
                left = mid + 1;
            }
        }
        return index;
    }

    private int findLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
                if (nums[mid] == target) {
                    index = mid;
                }
            } else {
                right = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }

        int target = in.nextInt();

        leetCodeQn16 solution = new leetCodeQn16();
        int[] result = solution.searchRange(nums, target);
        
        System.out.println("["+ result[0] +", "+result[1]+ "]");
        in.close();
        
    }
    
}
