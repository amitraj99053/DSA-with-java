
import java.util.PriorityQueue;
// 786. K-th Smallest Prime Fraction
public class leetCodeQn21 {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Double.compare((double) arr[a[0]] / arr[a[1]], (double) arr[b[0]] / arr[b[1]]));

        for (int i = 0; i < n - 1; i++) {
            pq.offer(new int[] { i, n - 1 });
        }

        for (int i = 0; i < k - 1; i++) {
            int[] top = pq.poll();
            if (top[1] - 1 > top[0]) {
                pq.offer(new int[] { top[0], top[1] - 1 });
            }
        }

        int[] result = pq.poll();
        return new int[] { arr[result[0]], arr[result[1]] };
    }

    public static void main(String[] args) {
        leetCodeQn21 solution = new leetCodeQn21();

        int[] arr1 = {1, 2, 3, 5};
        int k1 = 3;
        int[] result1 = solution.kthSmallestPrimeFraction(arr1, k1);
        System.out.println("Example 1: [" + result1[0] + ", " + result1[1] + "]"); 

        int[] arr2 = {1, 7};
        int k2 = 1;
        int[] result2 = solution.kthSmallestPrimeFraction(arr2, k2);
        System.out.println("Example 2: [" + result2[0] + ", " + result2[1] + "]"); 

        int[] arr3 = {1, 2, 3, 5, 7, 11, 13};
        int k3 = 10;
        int[] result3 = solution.kthSmallestPrimeFraction(arr3, k3);
        System.out.println("Example 3: [" + result3[0] + ", " + result3[1] + "]"); 

        int[] arr4 = {1,13,17,29,31,41,43,47,53,59,61,67,71,73,79,83,89,97};
        int k4 = 1;
        int[] result4 = solution.kthSmallestPrimeFraction(arr4,k4);
        System.out.println("Example 4: [" + result4[0] + ", " + result4[1] + "]");

        int[] arr5 = {1,13,17,29,31,41,43,47,53,59,61,67,71,73,79,83,89,97};
        int k5 = 100;
        int[] result5 = solution.kthSmallestPrimeFraction(arr5, k5);
        System.out.println("Example 5: [" + result5[0] + ", " + result5[1] + "]");

    }
}