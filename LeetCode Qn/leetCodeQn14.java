import java.util.Scanner;
// Qn11. Container With Most Water

public class leetCodeQn14 {

    public int maxArea(int[] height) {
            int maxArea = 0;
            int left = 0;
            int right = height.length - 1;
    
            while(left < right) {
                int currentArea = Math.min(height[left], height[right]) * (right - left);
                maxArea = Math.max(maxArea, currentArea);
    
                if(height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
            return maxArea;
    }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] height = new int[n];

            for(int i = 0; i < n; i++){
                height[i] = in.nextInt();
            }

            leetCodeQn14 solution = new leetCodeQn14();
            int maxAre = solution.maxArea(height);

            System.out.println(maxAre);
            in.close();
        }
    
}
