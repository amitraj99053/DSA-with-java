public class Qn3 {
    // For this problem structure, making them static is generally simpler
    public static int search(int[] num, int target) {
        // min will have index of minimum element of nums
        int min = minSearch(num);
        // find in sorted left
        if (target >= num[min] && target <= num[num.length - 1]) {
            return search(num, min, num.length - 1, target);
            // find in sorted right (actually, the first half before rotation point)
        } else {
            return search(num, 0, min - 1, target); 
        }
    }

    // binary search to find target in left to right boundary
    public static int search(int[] num, int left, int right, int target) {
        int l = left;
        int r = right;

        while(l <= r) {
            int mid = l + (r - l)/2;
            if (num[mid] == target) {
                return mid;
            } else if(num[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    // smallest element index
    public static int minSearch(int[] num) {
        int left = 0;
        int right = num.length - 1;

        // Handle edge case for an array with one element
        if (num.length == 1) {
            return 0;
        }

        // Handle case where array is not rotated
        if (num[left] < num[right]) {
            return left;
        }

        while(left <= right) { 
            int mid = left + (right - left) / 2;

            // Check if mid is the minimum element
            // Condition for a peak element, meaning the next element is smaller
            if (mid < num.length - 1 && num[mid] > num[mid + 1]) {
                return mid + 1;
            }
            // Condition for a dip element, meaning the current element is smaller than previous
            if (mid > 0 && num[mid - 1] > num[mid]) {
                return mid;
            }

            // Decide which half to go
            if (num[left] <= num[mid]) { // Left half is sorted, min must be in the right half
                left = mid + 1;
            } else { // Right half is sorted, min must be in the left half including mid
                right = mid - 1;
            }
        }
        return -1; // Should ideally not be reached if array contains at least one element
    }

    public static void main(String[] args) {
        int[] num = {4, 5, 6, 7, 0, 1, 2};
        int[] num1 = {1};

        int target = 3; 
        int target2 = 0; 

        System.out.println("Searching for " + target + " in num: " + search(num, target)); // op: -1
        System.out.println("Searching for " + target2 + " in num: " + search(num, target2)); // op: 4
        System.out.println("Searching for 1 in num1: " + search(num1, 1)); // op: 0
        System.out.println("Searching for 0 in num1: " + search(num1, 0)); // op: -1

    }
}