import java.util.Scanner;
// A no is automorphic if the square ends with same digit.
// Example 5^2 = 25
// Example 6^2 = 36
// Example 25^2 = 625
// Example 76^2 = 5776

public class CheckAutomorphicNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (isAutomorphic(num)) {
            System.err.println(num+ " ia an automorphic number");
        } else {
            System.err.println(num+ " is not an automorphic number");
        }
        
        in.close();
    }

    public static boolean isAutomorphic(int num) {
        if (num < 0) {
            return false;
        }
        if (num == 0 || num == 1) {
            return true;
        } 

        long square = (long) num * num;
        String numStr = String.valueOf(square);
        String squareStr = String.valueOf(square);

        if (squareStr.endsWith(numStr)) {
            return true;
        } else {
            return false;
        }
    }
}