class Solution {
    public int mySqrt(int x) {
        // Handle base cases for 0 and 1
        if (x < 2) return x;

        int left = 1, right = x / 2;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if mid is the square root or part of the lower bound
            if (mid <= x / mid) {
                result = mid; 
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
