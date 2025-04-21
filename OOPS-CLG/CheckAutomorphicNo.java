import java.util.Scanner;
// A no is automorphic if the square ends with same digit.
// Example 5^2 = 25
// Example 6^2 = 36
// Example 25^2 = 625

public class CheckAutomorphicNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int square = num * num;
        
        if (num == (square % 10)) {
            System.out.println("Matched Last Digit" +num+ " "+ square);
        } else {
            System.out.println("Not Matched Last Digit");
        }
        
    }
}