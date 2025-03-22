public class sort0s1sAnd2s {
    public void sort012(int[] arr) {
        // code here
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        
        while(mid <= high) {
            if(arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if(arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }
    
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        sort0s1sAnd2s solution = new sort0s1sAnd2s();

        int[] arr1 = {0, 1, 2, 0, 1, 2};
        solution.sort012(arr1);
        System.out.print("Sorted array 1: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        
        int[] arr2 = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        solution.sort012(arr2);
        System.out.print("Sorted array 2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
