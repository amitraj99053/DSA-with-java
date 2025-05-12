public class ArrayQn17 {
    // kandanes Algorithm
    public static void kandanesAlgo(int[] numbers) {
        int ms = Integer.MIN_VALUE;    // maxSum
        int cs = 0;                    // currentSum

        for (int i=0; i<numbers.length; i++) {
            cs = cs + numbers[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our max subArray sum is : "+ ms);
    }

    public static void main(String[] args) {
        int[] numbers = {-2, -3, 4, -1, -2, 1, 5, -3};
        kandanesAlgo(numbers);
    }
}
