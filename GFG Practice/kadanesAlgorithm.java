public class kadanesAlgorithm {
    public static int maxSubarraySum(int[] arr) {
        
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3}; 
        System.out.println(maxSubarraySum(arr));
        System.out.println();

        int[] arr1 = {-2, -4};
        System.out.println(maxSubarraySum(arr1));
        System.out.println();

        int[] arr2 = {5, 4, 1, 7, 8};
        System.out.println(maxSubarraySum(arr2));
    }
}
