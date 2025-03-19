import java.util.ArrayList;

public class MissingAndRepeating {
    // Missing And Repeating
    ArrayList<Integer> findTwoElement(int arr[]) {
        
        int n = arr.length;
        int repeating = -1;
        int missing = -1;
        
        for(int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            if(arr[index] > 0) {
               arr[index] = -arr[index];
            } else {
                repeating = Math.abs(arr[i]);
            }
        }
        
        for(int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
    }

    public static void main(String[] args) {

        MissingAndRepeating solution = new MissingAndRepeating();
        
        int[] arr1 = {2, 2};
        ArrayList<Integer> result1 = solution.findTwoElement(arr1);
        System.out.println(result1);
        System.out.println();

        int[] arr2 = {1, 3, 3};
        ArrayList<Integer> result2 = solution.findTwoElement(arr2);
        System.out.println(result2);
        System.out.println();

        int[] arr3 = {4, 3, 6, 2, 1, 1};
        ArrayList<Integer> result3 = solution.findTwoElement(arr3);
        System.out.println(result3);
        System.out.println();
    }
    
}
