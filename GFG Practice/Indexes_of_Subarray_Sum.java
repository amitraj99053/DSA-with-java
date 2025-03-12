
import java.util.ArrayList;
import java.util.Scanner;


public class Indexes_of_Subarray_Sum {
    
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int n = arr.length;
        int currentSum = 0;
        int start = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int end = 0; end < n; end++) {
            currentSum += arr[end];

            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == target) {
                result.add(start + 1);
                result.add(end + 1);
                return result;
            }
        }

        result.add(-1);
        return result;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int t = in.nextInt();

        while (t-- > 0) {
            System.out.print("Enter the size of the array: ");
            int n = in.nextInt();

            int[] arr = new int[n];
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            System.out.print("Enter the target sum: ");
            int target = in.nextInt();

            ArrayList<Integer> result = subarraySum(arr, target);

            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        in.close();

    }
}
