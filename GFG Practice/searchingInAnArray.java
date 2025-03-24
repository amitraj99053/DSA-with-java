import java.util.ArrayList;
import java.util.Arrays;

public class searchingInAnArray {
    public int search(int k, ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                return i + 1; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Example 1
        int k = 16;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(9, 7, 16, 16, 4));
        searchingInAnArray solution = new searchingInAnArray(); 
        int result = solution.search(k, arr);
        System.out.println(result); 
        
        // Example 2
        k = 98;
        arr = new ArrayList<>(Arrays.asList(1, 22, 57, 47, 34, 18, 66));
        result = solution.search(k, arr);
        System.out.println(result);
    }
}
