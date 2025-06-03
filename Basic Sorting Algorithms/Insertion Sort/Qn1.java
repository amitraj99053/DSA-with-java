public class Qn1 {
    // insertion sort in descending order

    public static void insertionSortDescending(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] < curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 3, 2, 4, 3, 7};
        int[] arr1 = {5, 3, 1, 2, 4};
        
        insertionSortDescending(arr);
        insertionSortDescending(arr1);
        printArray(arr);
        printArray(arr1);
    }
}
