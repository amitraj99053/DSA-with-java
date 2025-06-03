public class Qn1 {
// selection sort in descending order 

    public static void selectionSortDescending(int[] arr) {
        for(int turn=0; turn<arr.length; turn++) {
            int minPos = turn;
            for(int j=turn+1; j<arr.length; j++) {
                if(arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }

            int temp = arr[turn];
            arr[turn] = arr[minPos];
            arr[minPos] = temp;
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
        int[] arr1 = {4, 5, 1, 3, 2};

        selectionSortDescending(arr);
        selectionSortDescending(arr1);
        printArray(arr);
        printArray(arr1);
    }
}
