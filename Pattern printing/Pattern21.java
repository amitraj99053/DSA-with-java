import java.util.Scanner;
/* Diamond pattern
Enter value of N: 3
  *
 ***
*****
*****
 ***
  *          */
public class Pattern21 {
    public static void diamond(int n) {

        // 1st half
        for(int i=1; i<=n; i++) {
            // space 
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            // stars
            for(int k=1; k<=(2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for(int i=n; i>=1; i--) {
            // space
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int k=1; k<=(2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = in.nextInt();
        diamond(n);
        in.close();
    }
}
