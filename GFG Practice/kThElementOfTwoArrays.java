public class kThElementOfTwoArrays {
    // K-th element of two Arrays
    public int kthElement(int a[], int b[], int k) {
        int n = a.length;
        int m = b.length;
        int[] merged = new int[n + m];
        int i = 0, j = 0, l = 0;

        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                merged[l++] = a[i++];
            } else {
                merged[l++] = b[j++];
            }
        }

        while (i < n) {
            merged[l++] = a[i++];
        }

        while (j < m) {
            merged[l++] = b[j++];
        }

        return merged[k - 1];
    }

    public static void main(String[] args) {
        kThElementOfTwoArrays solution = new kThElementOfTwoArrays(); 

        // Test case 1
        int[] a1 = {2, 3, 6, 7, 9};
        int[] b1 = {1, 4, 8, 10};
        int k1 = 5;
        System.out.println("Test Case 1: " + solution.kthElement(a1, b1, k1)); 

        // Test case 2
        int[] a2 = {100, 112, 256, 349, 770};
        int[] b2 = {72, 86, 113, 119, 265, 445, 892};
        int k2 = 7;
        System.out.println("Test Case 2: " + solution.kthElement(a2, b2, k2)); 

        // test case 3
        int[] a3 = {1,2,3};
        int[] b3 = {4,5,6};
        int k3 = 3;
        System.out.println("Test Case 3: " + solution.kthElement(a3, b3, k3)); 

        // test case 4
        int[] a4 = {1,2,3};
        int[] b4 = {4,5,6};
        int k4 = 6;
        System.out.println("Test Case 4: " + solution.kthElement(a4, b4, k4)); 

        // test case 5
        int[] a5 = {1,2,3};
        int[] b5 = {};
        int k5 = 2;
        System.out.println("Test Case 5: " + solution.kthElement(a5, b5, k5)); 

        // test case 6
        int[] a6 = {};
        int[] b6 = {1,2,3};
        int k6 = 3;
        System.out.println("Test Case 6: " + solution.kthElement(a6, b6, k6)); 
    
    }
}
