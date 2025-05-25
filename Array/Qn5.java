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
        Qn5 solution = new Qn5();

        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.err.println("Water trapped in height1 : " + solution.trap(height1));

        int[] height2 = {4, 2, 0, 3, 2, 5};
        System.out.println("Water trapped in height2 : " + solution.trap(height2));

        int[] height3 = {1,2,3,4,5};
        System.out.println("Water trapped in height3 : " + solution.trap(height3));
    }
}
