public class TrapRainWater {
    public static int trappedRainWater(int height[]) {
        int n = height.length;
        if (n <= 2) {
            return 0; 
        }

        // Calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        // Loop through each bar (excluding the first and last)
        for (int i = 1; i < n - 1; i++) {
            // Water level at the current bar is the minimum of the left and right max boundaries
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // If the water level is higher than the current bar, water can be trapped
            if (waterLevel > height[i]) {
                trappedWater += waterLevel - height[i];
            }
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainWater(height)); 

        int[] height2 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappedRainWater(height2)); 

        int[] height3 = {4, 2, 3};
        System.out.println(trappedRainWater(height3)); 
    }
}