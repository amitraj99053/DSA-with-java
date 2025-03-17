public class binarySearch {
    // Binary search
    public static int binarysearch(int[] arr, int k) {
        
        int start = 0, end = arr.length-1;
            
        while(start <= end) {
        int mid = (start + end) / 2;
                
        if(arr[mid] == k) {
        return mid;
        }

        if(arr[mid] < k) {
        start = mid+1;
        } else {
        end = mid-1;
        }

        }
            
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 4;
    
        System.out.println(binarysearch(arr,k));
    }
}

