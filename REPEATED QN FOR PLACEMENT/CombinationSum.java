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
