import java.util.Arrays;
import java.util.Scanner;
// 16. 3sum closest
public class leetCodeQn8 {

        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int closestSum = nums[0] + nums[1] + nums[2];
            int minDiff = Math.abs(closestSum - target);

            for(int i = 0; i < nums.length - 2; i++){
                int left = i + 1;
                int right = nums.length - 1;

                while(left < right){
                    int currentSum = nums[i] + nums[left] + nums[right];
                    int currentDiff = Math.abs(currentSum - target);

                    if(currentDiff < minDiff){
                        minDiff = currentDiff;
                        closestSum = currentSum;
                    }

                    if(currentSum < target){
                        left++;
                    } else if(currentSum > target){
                        right--;
                    }else {
                        return target;
                    }
                }
            }

            return closestSum;
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target = in.nextInt();

        leetCodeQn8 solution = new leetCodeQn8();
        int result = solution.threeSumClosest(nums, target);

        System.out.println("The closest sum to the target is: "+ result);
        in.close();
    }

}
