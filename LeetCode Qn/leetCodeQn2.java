import java.util.Scanner;

//  removing duplicates from a sorted array
public class leetCodeQn2 {
        public static int removeDuplicates(int[] nums) {
            if(nums.length == 0){
                return 0;
            }
            int k = 1;
            for(int i = 1; i < nums.length; i++){
                if(nums[i] != nums[i -1]){
                    nums[k] = nums[i];
                    k++;
                }
            }
            return k;
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the elements of the array(sorted): ");
        for (int i = 0; i < size; i++){
            nums[i] = in.nextInt();
        }

        int k = removeDuplicates(nums);
        System.out.println("Number of unique elements: "+ k);

        System.out.println("Modified array: ");
        for(int i = 0; i < k; i++){
            System.out.println(nums[i] + " ");
        }
        System.out.println();
        in.close();
    }
}
