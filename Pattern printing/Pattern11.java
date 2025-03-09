import java.util.Scanner;
// solid rhombus
public class Pattern11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n = in.nextInt();

        for (int i=1; i<=n; i++){
            // space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // stars
            for (int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
