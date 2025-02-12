import java.util.Scanner;

public class ArrayQn4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];

        for (int i=0; i<num; i++){
            arr[i] = in.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum no : "+ max);
    }
}
