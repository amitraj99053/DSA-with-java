import java.util.Scanner;
// Missing in Array 
// to single number
public class MissingInArray {
   
    int missingNumber(int arr[]) {
        int n = arr.length + 1;
        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return (int) (expectedSum - actualSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n - 1]; 

        for (int i = 0; i < n - 1; i++) { 
            nums[i] = in.nextInt();
        }

        MissingInArray missingInArray = new MissingInArray(); 
        int missing = missingInArray.missingNumber(nums); 

        System.out.println(missing); 
        in.close(); 

    }
}
