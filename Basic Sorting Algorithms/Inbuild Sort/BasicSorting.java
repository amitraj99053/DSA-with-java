import java.util.*;

public class BasicSorting {
    public static void printArray(Integer[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arr = {5, 4, 1, 3, 2};
        // type 1
        // Arrays.sort(arr);  
        // type 2
        // Arrays.sort(arr,0,3);
        // type 3
        // Arrays.sort(arr,Collections.reverseOrder());
        // type 4
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArray(arr);
    }
}
