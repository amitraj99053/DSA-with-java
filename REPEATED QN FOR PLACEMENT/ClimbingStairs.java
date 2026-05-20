import java.util.Scanner;

class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int prev1 = 1;
        int prev2 = 2;

        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return prev2;
    }
}

public class Main {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.println("=== Climbing Stairs Problem ===");
        System.out.println("Problem: You are climbing a staircase. It takes n steps to reach the top.");
        System.out.println("Each time you can climb 1 or 2 steps. How many distinct ways can you climb?");
        System.out.println();

        System.out.print("Enter the number of stairs (n): ");

        // Check if input is integer
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Invalid input! Please enter a positive number.");
            } else {
                int result = solution.climbStairs(n);
                System.out.println("\nNumber of distinct ways to climb " + n + " stairs: " + result);
            }
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }

        // Test cases
        System.out.println("\n=== Test Cases ===");
        int[] testCases = {1, 2, 3, 4, 5, 6, 10};

        for (int testCase : testCases) {
            System.out.println("n = " + testCase + " => " + solution.climbStairs(testCase) + " ways");
        }

        scanner.close();
    }
}
