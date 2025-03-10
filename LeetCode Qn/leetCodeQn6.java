import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// Qn is 3 sum
public class leetCodeQn6 {

        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            if(nums == null || nums.length < 3){
                return result;
            }

            Arrays.sort(nums);

            for(int i = 0; i < nums.length - 2; i++){
                if(i > 0 && nums[i] == nums[i - 1]){
                    continue;
                }

                int left = i + 1;
                int right = nums.length - 1;

                while(left < right){
                    int sum = nums[i] + nums[left] + nums[right];

                    if(sum == 0){
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        while(left < right && nums[left] == nums[left + 1]){
                            left++;
                        }
                        while(left < right && nums[right] == nums[right - 1]){
                            right--;
                        }

                        left++;
                        right--;
                    }else if(sum < 0){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
            return result;
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the elements separated by spaces: ");

        for (int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }

        leetCodeQn6 solution = new leetCodeQn6();
        List<List<Integer>> result = solution.threeSum(nums);

        System.out.println(result);
        in.close();
    }
}
