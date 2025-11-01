import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderIt {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = 0;
        if (scanner.hasNextInt()) {
            N = scanner.nextInt();
            scanner.nextLine();
        } else {
            scanner.close();
            return;
        }

        if (scanner.hasNextLine()) scanner.nextLine(); 

        String[] shuffled = new String[N];
        for (int i = 0; i < N; i++) {
            if (scanner.hasNextLine()) {
                shuffled[i] = scanner.nextLine();
            } else {
                scanner.close();
                return;
            }
        }

        if (scanner.hasNextLine()) scanner.nextLine(); 

        Map<String, Integer> originalIndex = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (scanner.hasNextLine()) {
                String instruction = scanner.nextLine();
                originalIndex.put(instruction, i);
            } else {
                scanner.close();
                return;
            }
        }
        scanner.close();

        int[] pi = new int[N];
        for (int i = 0; i < N; i++) {
            if (originalIndex.containsKey(shuffled[i])) {
                pi[i] = originalIndex.get(shuffled[i]);
            } else {
                return; 
            }
        }

        int lisLength = findLISLength(pi, N);

        int minOperations = N - lisLength;

        System.out.println(minOperations);
    }

    private static int findLISLength(int[] arr, int N) {
        if (N == 0) return 0;

        int[] dp = new int[N];
        int maxLIS = 0;

        for (int i = 0; i < N; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLIS = Math.max(maxLIS, dp[i]);
        }
        return maxLIS;
    }
}