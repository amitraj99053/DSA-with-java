import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, new ArrayList<>(), results, 0);
        return results;
    }

    private void backtrack(int[] candidates, int remain, List<Integer> current, List<List<Integer>> results, int start) {
        if (remain == 0) {
            results.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > remain) break;

            current.add(candidates[i]);
            backtrack(candidates, remain - candidates[i], current, results, i);
            current.remove(current.size() - 1);
        }
    }
}

public class CombinationSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Test Case 1
        System.out.println("=== Test Case 1 ===");
        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;
        System.out.println("Candidates: " + Arrays.toString(candidates1));
        System.out.println("Target: " + target1);
        Solution solution = new Solution();
        List<List<Integer>> result1 = solution.combinationSum(candidates1, target1);
        System.out.println("Output: " + result1);
        System.out.println();
        
        // Test Case 2
        System.out.println("=== Test Case 2 ===");
        int[] candidates2 = {2, 3, 5};
        int target2 = 8;
        System.out.println("Candidates: " + Arrays.toString(candidates2));
        System.out.println("Target: " + target2);
        List<List<Integer>> result2 = solution.combinationSum(candidates2, target2);
        System.out.println("Output: " + result2);
        System.out.println();
        
        // Test Case 3
        System.out.println("=== Test Case 3 ===");
        int[] candidates3 = {2};
        int target3 = 1;
        System.out.println("Candidates: " + Arrays.toString(candidates3));
        System.out.println("Target: " + target3);
        List<List<Integer>> result3 = solution.combinationSum(candidates3, target3);
        System.out.println("Output: " + result3);
        System.out.println();
        
        // Interactive Input
        System.out.println("=== Interactive Mode ===");
        System.out.print("Enter number of candidates: ");
        int n = in.nextInt();
        int[] candidates = new int[n];
        System.out.print("Enter candidates (space-separated): ");
        for (int i = 0; i < n; i++) {
            candidates[i] = in.nextInt();
        }
        System.out.print("Enter target sum: ");
        int target = in.nextInt();
        
        List<List<Integer>> result = solution.combinationSum(candidates, target);
        System.out.println("Output: " + result);
        
        in.close();
    }
}
