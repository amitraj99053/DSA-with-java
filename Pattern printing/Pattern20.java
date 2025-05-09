import java.util.Scanner;
/* 
Hollow rhombus
Enter value of n: 5
    *****
   *   *
  *   *
 *   *
*****        */
public class Pattern20 {
    public static void hollow_rhombus(int n) {
        for(int i=1; i<=n; i++) {
            // space
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            // hollow rectangle - stars
            for(int j=1; j<=n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = in.nextInt();
        hollow_rhombus(n);
        in.close();
    }
}
