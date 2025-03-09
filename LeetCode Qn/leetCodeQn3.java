import java.util.Scanner;
/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the
elements may be changed. Then return the number of elements in nums which are not equal to val.      */
public class leetCodeQn3 {

        public int removeElement(int[] nums, int val) {
            int k = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != val){
                    nums[k] = nums[i];
                    k++;
                }
            }
            return k;
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Read the size of the array
        int val = in.nextInt(); // Read the value to remove

        int[] nums = new int[n]; // Create the array
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt(); // Read the array elements
        }

        leetCodeQn3 solution = new leetCodeQn3();
        int k = solution.removeElement(nums, val);

        System.out.println(k); // Print the number of elements not equal to val

        // Optionally, print the modified array (first k elements)
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        in.close();
    }
}
