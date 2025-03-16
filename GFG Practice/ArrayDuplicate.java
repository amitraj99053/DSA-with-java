import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
// Array Duplicates
public class ArrayDuplicate {

    public List<Integer> findDuplicates(int[] arr) {
        // code here
        if(arr == null || arr.length <= 1) {
            return new ArrayList<>();
        }
        
        Map<Integer, Integer> counts = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();
        
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        
        for( Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if(entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        
        return duplicates;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        ArrayDuplicate solution = new ArrayDuplicate();
        List<Integer> result = solution.findDuplicates(nums);

        for(int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
        in.close();

    }
}


