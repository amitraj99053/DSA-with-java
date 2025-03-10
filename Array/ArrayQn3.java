import java.util.Scanner;
// sum of numbers entered by user

public class ArrayQn3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter no of element: ");
        int num = in.nextInt();

        System.out.print("Enter element: ");
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){ // scanning number 
            arr[i] = in.nextInt();
        }


        // adding of number by caliing index address
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
