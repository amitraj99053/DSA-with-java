
import java.util.Scanner;

public class leetCodeQn15 {
// Qn33. Search in Rotated Sorted Array
        public int search(int[] nums, int target) {
            if (nums == null || nums.length == 0) {
                return -1;
            }
    
            int left = 0;
            int right = nums.length - 1;
    
            while (left <= right) {
                int mid = left + (right - left) / 2;
    
                if (nums[mid] == target) {
                    return mid;
                }
    
                // Check if the left half is sorted
                if (nums[left] <= nums[mid]) {
                    if (nums[left] <= target && target < nums[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else { // Right half is sorted
                    if (nums[mid] < target && target <= nums[right]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
    
            return -1;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int size = in.nextInt();

            int[] nums = new int[size];
            System.out.print("Enter the elements of the array (space-separated): ");
            for (int i = 0; i < size; i++) {
               nums[i] = in.nextInt();
            }

            System.out.print("Enter the target value: ");
            int target = in.nextInt();

            leetCodeQn15 solution = new leetCodeQn15();
            int result = solution.search(nums, target);

            if (result != -1) {
            System.out.println("Target " + target + " found at index " + result);
            } else {
            System.out.println("Target " + target + " not found in the array.");
            }

            in.close();
        }
    }
