import java.util.Scanner;
// butterfly pattern

public class Pattern10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n = in.nextInt();

        // upper half
        for (int i=1; i<=n; i++){
            //1st part
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            // space
            int spaces = 2*(n-i);
            for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            // 2nd part
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // lower part
        for (int i=n; i>=1; i--){
            //1st part
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            // space
            int spaces = 2*(n-i);
            for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            // 2nd part
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
