
import java.util.Scanner;

public class ArrayQn9 {
    // Largest Number in array
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;  // negative infinity
        int smallest = Integer.MAX_VALUE; // positive infinity

        for(int i = 0; i < numbers.length; i++){
            if(largest < numbers[i]) {
                largest = numbers[i];
            }

            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest No is : "+ smallest);
        return largest;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of element: ");
        int n = in.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter element : ");
            numbers[i] = in.nextInt();
        }

        int largestNumber = getLargest(numbers);
        System.out.println("Largest No is : "+ largestNumber);

        in.close();
    }
    
}
