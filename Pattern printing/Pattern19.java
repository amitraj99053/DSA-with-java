import java.util.Scanner;
/* 
Solid Rhombus
Enter value of N: 5
    *****
   *****
  *****
 *****
*****          */
public class Pattern19 {
    public static void solid_rhombus(int n) {
        for(int i=1; i<=n; i++) {
            // space 
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            // stars
            for(int k=1; k<=n; k++) {
                System.out.print("*");
            }
            
            System.out.println();  
        }
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = in.nextInt();
        solid_rhombus(n);
        in.close();
    }
}
