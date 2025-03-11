
import java.util.Scanner;

public class ArrayQn9 {
    // Largest Number in array
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;  // negative infinity

        for(int i = 0; i < numbers.length; i++){
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
        }

        int largestNumber = getLargest(numbers);
        System.out.println(largestNumber);

        in.close();
    }
    
}
