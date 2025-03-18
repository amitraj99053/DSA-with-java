import java.util.ArrayList;
import java.util.Collections;

public class arrayLeaders {
    static ArrayList<Integer> leaders(int arr[]) {
    
        ArrayList<Integer> leadersList = new ArrayList<>();
        int n = arr.length;
        if (n == 0) {
            return leadersList;
        }
        
        int maxRight = arr[n - 1];
        leadersList.add(maxRight);
        
        for(int i = n -2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                leadersList.add(maxRight);
            }
        }
        
        Collections.reverse(leadersList);
        return leadersList;
    } 

    public static void main(String[] args) {
        int[] n = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result = leaders(n);
        System.out.println(result);
        System.out.println();

        int[] n1 = {10, 4, 2, 1};
        ArrayList<Integer> result1 = leaders(n1);
        System.out.println(result1);
        System.out.println();

        int[] n2 = {5, 10, 20, 40};
        ArrayList<Integer> result2 = leaders(n2);
        System.out.println(result2);
        System.out.println();

        int[] n3 = {30, 10, 10, 5};
        ArrayList<Integer> result3 = leaders(n3);
        System.out.println(result3);
        System.out.println();
    }
}
