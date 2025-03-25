public class productOfAnArray {
    public static long product(long arr[]) {
        long mod = 1000000007;
        long result = 1;
        for (long num : arr) {
            result = (result * num) % mod;
        }
        return result;
    }

    public static void main(String[] args) {
        // Example usage:
        long[] arr1 = {1, 2, 3, 4};
        long result1 = product(arr1);
        System.out.println("Product of arr1: " + result1); // Output: 24

        long[] arr2 = {100000, 100000, 100000};
        long result2 = product(arr2);
        System.out.println("Product of arr2: " + result2); // Output: 993000007

        long[] arr3 = {5,6,7};
        long result3 = product(arr3);
        System.out.println("Product of arr3: "+ result3);

        long[] arr4 = {1000000006, 1};
        long result4 = product(arr4);
        System.out.println("Product of arr4: "+ result4);

        long[] arr5 = {1000000007};
        long result5 = product(arr5);
        System.out.println("Product of arr5: "+ result5);

        long[] arr6 = {1000000007, 2};
        long result6 = product(arr6);
        System.out.println("Product of arr6: "+ result6);
    }
}