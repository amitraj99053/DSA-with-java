public class ArrayQn14 {
    // print sub array
    public static void printSubArray(int[] numbers) {
        int tp = 0;
        for (int i=0; i<numbers.length; i++) {
            int start = i;
            for (int j=i; j<numbers.length; j++) {
                int end = j;
                for (int k=start; k<=end; k++) {
                    System.out.print(numbers[k] +" ");  // subarray
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total pair are: "+ tp);
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        printSubArray(numbers);
    }
}
