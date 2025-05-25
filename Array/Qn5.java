public class Qn5 {
    /* 
    Given n non-negative integers representing an elevation map where 
    the width of each bar is 1, compute how much water it can trap after 
    raining.
    */

    public int trap(int[] height) {
        int n = height.length;
        int res = 0, l = 0, r = n - 1;
        int rMax = height[r], lMax = height[l];

        while (l < r) {
            if (lMax < rMax) {
                l++;
                lMax = Math.max(lMax, height[l]);
                res += lMax - height[l];
            } else {
                r--;
                rMax = Math.max(rMax, height[r]);
                res += rMax - height[r];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
        
    }
}
