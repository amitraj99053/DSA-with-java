import java.util.Scanner;
/* 
inverted half-pyramid with numbers
Enter no: 6
1 2 3 4 5 6 
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/
public class Pattern15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n = in.nextInt();

        // outer lopp
        for (int i=1; i<=n; i++) {
            // inner loop
            for (int j=1; j<=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        in.close();
    }
}
