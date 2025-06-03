public class Qn1 {
    // bubble sort in descending order 
    
    public static void bubbleSortDescending(int[] arr) {
        for(int turn=0; turn<arr.length-1; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        int[] arr1 = {5, 4, 1, 3, 2};
        bubbleSortDescending(arr);
        bubbleSortDescending(arr1);
        printArray(arr);
        printArray(arr1);
    }
}
