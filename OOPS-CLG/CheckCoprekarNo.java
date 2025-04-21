import java.util.Scanner;

// A no is coprekate if the square can be split and the sum of parts equals the no.
// Example 45^2 = 2025
// Example 9^2 = 81
public class CheckCoprekarNo {

    public static boolean isCoprekate(int num) {
        if (num < 0) {
            return false;
        }
        long square = (long) num * num;
        String squareStr = String.valueOf(square);

        for (int i = 1; i < squareStr.length(); i++) {
            String part1Str = squareStr.substring(0, i);
            String part2Str = squareStr.substring(i);

            long part1 = Long.parseLong(part1Str);
            long part2 = Long.parseLong(part2Str);

            if (part1 + part2 == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (isCoprekate(num)) {
            System.out.println(num+ "is a coprekate number.");
        } else {
            System.err.println(num+ "is not a coprekate number.");
        }

        in.close();

    }
}
