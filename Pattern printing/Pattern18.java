import java.util.Scanner;
/* 
Enter value of n: 3
*    *
**  **
******
******
**  **
*    *          */
public class Pattern18 {
    public static void butterFly(int n) {
        // 1st half
        for(int i=1; i<=n; i++) {
            // stars i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // space 2*(n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            // satrs i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half (inverted miirror)
        for(int i=n; i>=1; i--) {
            // stars i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            // space 2*(n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            // stars i
            for(int j=1;j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = in.nextInt();
        butterFly(n);
        in.close();
    }
}
