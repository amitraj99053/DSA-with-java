import java.util.Scanner;
// number pyramid
/* 
 Enter no: 5
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5
*/
public class Pattern12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n = in.nextInt();

        for (int i=1; i<=n; i++){
            // spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // number ->print no row no time
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
