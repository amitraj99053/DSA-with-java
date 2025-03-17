public class binarySearch {
    // Binary search
    public static int binarysearch(int[] arr, int k) {
        // Code Here
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == k) {
                result = mid; 
                right = mid - 1;
            } else if (arr[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
    
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 4;
    
        System.out.println(binarysearch(arr,k));
    }
}

