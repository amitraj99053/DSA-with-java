import java.util.Scanner;
/*

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return
the index where it would be if it were inserted in order. You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
*/

public class leetCodeQn4 {
        public int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;

            while(left <= right){
                int mid = left + (right - left) / 2;

                if(nums[mid] == target){
                    return mid;
                }else if(nums[mid] < target){
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
            return left;
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = in.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the sorted array: ");
        for (int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }

        System.out.println("Enter the target value: ");
        int target = in.nextInt();

        leetCodeQn4 solution = new leetCodeQn4();
        int result = solution.searchInsert(nums, target);

        System.out.println("Result: "+ result);
        in.close();
    }

}
