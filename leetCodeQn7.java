import java.util.Arrays;
import java.util.Scanner;

public class leetCodeQn7 {
    // 189. Rotate Array
        public void reverse(int[] nums, int start, int end){
            while(start < end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;

                start++;
                end--;
            }
        }

        public void rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n;
            reverse(nums, 0, n-1);
            reverse(nums, 0, k-1);
            reverse(nums, k, n-1);
        }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }

        System.out.print("Enter the number of rotations (k): ");
        int k = in.nextInt();

        leetCodeQn7 solution = new leetCodeQn7();
        solution.rotate(nums, k);

        System.out.println("Rotated array: ");
        System.out.println(Arrays.toString(nums));

        in.close();
    }
}
