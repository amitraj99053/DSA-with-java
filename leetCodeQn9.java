import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// Qn18.  4sum
public class leetCodeQn9 {

        public static List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> result = new ArrayList<>();
            if(nums == null || nums.length < 4){
                return result;
            }

            Arrays.sort(nums);
            int n = nums.length;

            for(int i = 0; i < n - 3; i++){
                if(i > 0 && nums[i] == nums[i - 1]){
                    continue;
                }
                for(int j = i + 1; j < n - 2; j++){
                    if(j > i + 1 && nums[j] == nums[j - 1]){
                        continue;
                    }
                    int left = j + 1;
                    int right = n - 1;

                    while(left < right){
                        long sum = (long) nums[i] + nums[j] +nums[left] + nums[right];
                        if(sum == target){
                            result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                            while(left < right && nums[left] == nums[left + 1]){
                                left++;
                            }
                            while(left < right && nums[right] == nums[right - 1]){
                                right--;
                            }
                            left++;
                            right--;
                        } else if(sum < target){
                            left++;
                        }else{
                            right--;
                        }
                    }
                }
            }
            return result;
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums1 = {1, 0, -1, 0, -2, 2};
        int target1 = 0;
        List<List<Integer>> result1 = fourSum(nums1, target1);
        System.out.println("Example 1: " + result1);

        int[] nums2 = {2, 2, 2, 2, 2};
        int target2 = 8;
        List<List<Integer>> result2 = fourSum(nums2, target2);
        System.out.println("Example 2: " + result2);

        int[] nums3 = {-3,-2,-1,0,0,1,2,3};
        int target3 = 0;
        List<List<Integer>> result3 = fourSum(nums3, target3);
        System.out.println("Example 3: " + result3);
    }
}

