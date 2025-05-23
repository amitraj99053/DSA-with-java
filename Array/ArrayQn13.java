public class ArrayQn13 {
// print pairs
    public static void printPairs(int[] numbers) {
        int tp = 0; // total no of pairs
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("("+current+ ","+ numbers[j] +")");
                tp++;
            }
            System.out.println();
        }

        System.out.println("Total pairs is : "+ tp);
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7};

        printPairs(numbers);
        printPairs(numbers1);
    }
}
