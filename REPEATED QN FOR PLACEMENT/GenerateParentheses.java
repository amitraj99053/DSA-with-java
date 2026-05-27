import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GenerateParenthesesComplete {
    
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder current, int open, int close, int n) {
        if (current.length() == n * 2) {
            result.add(current.toString());
            return;
        }

        if (open < n) {
            current.append("(");
            backtrack(result, current, open + 1, close, n);
            current.deleteCharAt(current.length() - 1); 
        }

        if (close < open) {
            current.append(")");
            backtrack(result, current, open, close + 1, n);
            current.deleteCharAt(current.length() - 1); 
        }
    }

    public static void main(String[] args) {
        GenerateParenthesesComplete solution = new GenerateParenthesesComplete();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Generate Valid Parentheses ===\n");
        
        System.out.print("Enter the number of parentheses pairs (1-8): ");
        int n = scanner.nextInt();
        
        if (n < 1 || n > 8) {
            System.out.println("Invalid input! Please enter a number between 1 and 8.");
            scanner.close();
            return;
        }

        List<String> results = solution.generateParenthesis(n);
        
        System.out.println("\nInput: n = " + n);
        System.out.println("Output: " + results);
        System.out.println("Total combinations: " + results.size());
        
        System.out.println("\nDetailed Output:");
        for (int i = 0; i < results.size(); i++) {
            System.out.println((i + 1) + ". " + results.get(i));
        }

        System.out.println("\n=== Predefined Test Cases ===\n");
        
        int[] testCases = {1, 2, 3, 4};
        for (int testN : testCases) {
            List<String> testResult = solution.generateParenthesis(testN);
            System.out.println("n = " + testN + " -> " + testResult);
            System.out.println("Count: " + testResult.size() + "\n");
        }

        scanner.close();
    }
}
