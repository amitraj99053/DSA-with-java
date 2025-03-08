import java.util.Arrays;
import java.util.Scanner;
// Qn 88 Merge Sorted Array
public class leetCodeQn11 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input m and n
        System.out.print("Enter m: ");
        int m = scanner.nextInt();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        // Input nums1
        int[] nums1 = new int[m + n];
        System.out.print("Enter nums1 (first " + m + " elements, space separated): ");
        for (int i = 0; i < m; i++) {
            nums1[i] = scanner.nextInt();
        }

        // Input nums2
        int[] nums2 = new int[n];
        System.out.print("Enter nums2 (space separated): ");
        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }

        leetCodeQn11 merger = new leetCodeQn11();
        merger.merge(nums1, m, nums2, n);

        System.out.println("Merged nums1: " + Arrays.toString(nums1));

        scanner.close();
    }
}