public class ArrayQn10 {
    // Binary Search in array

    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            // compare
            if (numbers[mid] == key) {  // found
                return mid;
            }

            if (numbers[mid] < key) {  // right
                start = mid+1;
            } else {      // left
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 8;

        System.out.println("Index for key is : "+ binarySearch(numbers, key));
    }
}
