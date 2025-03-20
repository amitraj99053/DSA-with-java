import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
// Two sum -Pairs with 0 Sum
public class TwoSumPairsWithZeroSum {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Set<List<Integer>> resultSet = new HashSet<>();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);

                if(resultSet.add(pair)){
                    result.add(pair);
                }
                left++;
                right--;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(getPairs(arr));
        System.out.println();

        int[] arr1 = {6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
        System.out.println(getPairs(arr1));
    }
}
