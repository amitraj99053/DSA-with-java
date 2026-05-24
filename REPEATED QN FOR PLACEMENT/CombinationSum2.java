import java.util.*;

class CombinationSum2Complete {
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        
        Arrays.sort(candidates);
        
        backtrack(results, new ArrayList<>(), candidates, target, 0);
        
        return results;
    }

    private void backtrack(List<List<Integer>> results, List<Integer> current, 
                          int[] candidates, int remain, int start) {
        
        if (remain == 0) {
            results.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            
            if (candidates[i] > remain) {
                break;
            }

            current.add(candidates[i]);
            
            backtrack(results, current, candidates, remain - candidates[i], i + 1);
            
            current.remove(current.size() - 1);
        }
    }


    private static void printResults(List<List<Integer>> results) {
        System.out.println("Results:");
        for (List<Integer> combination : results) {
            System.out.println(combination);
        }
    }

    public static void main(String[] args) {
        CombinationSum2Complete solution = new CombinationSum2Complete();
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("=== Combination Sum II Calculator ===\n");
            System.out.println("Choose option:");
            System.out.println("1. Test with predefined examples");
            System.out.println("2. Enter custom input");
            System.out.print("Enter choice (1 or 2): ");
            
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                // Test Case 1
                System.out.println("\n--- Test Case 1 ---");
                int[] candidates1 = {10, 1, 2, 7, 6, 1, 5};
                int target1 = 8;
                System.out.println("Candidates: " + Arrays.toString(candidates1));
                System.out.println("Target: " + target1);
                List<List<Integer>> result1 = solution.combinationSum2(candidates1, target1);
                printResults(result1);
                
                // Test Case 2
                System.out.println("\n--- Test Case 2 ---");
                int[] candidates2 = {2, 5, 2, 1, 2};
                int target2 = 5;
                System.out.println("Candidates: " + Arrays.toString(candidates2));
                System.out.println("Target: " + target2);
                List<List<Integer>> result2 = solution.combinationSum2(candidates2, target2);
                printResults(result2);
                
                // Test Case 3
                System.out.println("\n--- Test Case 3 ---");
                int[] candidates3 = {1};
                int target3 = 1;
                System.out.println("Candidates: " + Arrays.toString(candidates3));
                System.out.println("Target: " + target3);
                List<List<Integer>> result3 = solution.combinationSum2(candidates3, target3);
                printResults(result3);
                
                // Test Case 4 (No valid combinations)
                System.out.println("\n--- Test Case 4 ---");
                int[] candidates4 = {1, 2, 3};
                int target4 = 10;
                System.out.println("Candidates: " + Arrays.toString(candidates4));
                System.out.println("Target: " + target4);
                List<List<Integer>> result4 = solution.combinationSum2(candidates4, target4);
                printResults(result4);
                
            } else if (choice == 2) {
                // Custom input
                System.out.print("\nEnter the size of candidates array: ");
                int n = scanner.nextInt();
                int[] candidates = new int[n];
                
                System.out.println("Enter " + n + " candidates:");
                for (int i = 0; i < n; i++) {
                    System.out.print("Element " + (i + 1) + ": ");
                    candidates[i] = scanner.nextInt();
                }
                
                System.out.print("Enter target sum: ");
                int target = scanner.nextInt();
                
                System.out.println("\nInput:");
                System.out.println("Candidates: " + Arrays.toString(candidates));
                System.out.println("Target: " + target);
                
                List<List<Integer>> result = solution.combinationSum2(candidates, target);
                printResults(result);
                
            } else {
                System.out.println("Invalid choice!");
            }
            
        } finally {
            scanner.close();
        }
    }
}
