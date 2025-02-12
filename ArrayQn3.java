import java.util.Scanner;

public class ArrayQn3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of element: ");
        int num = in.nextInt();
        System.out.println("Enter element: ");
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            arr[i] = in.nextInt();
        }


        // main logic
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
