import java.util.Scanner;
/* 
number half pyramid with 1,0
Enter no: 5
1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/

public class Pattern9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n = in.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                int sum = i+j;
                if (sum % 2 == 0){ // even no
                    System.out.print("1 ");
                }else { // odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
