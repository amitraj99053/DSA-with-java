
import java.util.Scanner;
/* 
floyd's triangle
Enter no: 4
1 
2 3 
4 5 6 
7 8 9 10 
*/

public class Pattern16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n = in.nextInt();
        int count = 1;

        // outer loop
        for (int i=1; i<=n; i++) {
            // inner loop
            for (int j=1; j<=i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
