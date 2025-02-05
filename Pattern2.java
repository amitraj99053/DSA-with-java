import java.util.Scanner;
/*
half pyramid (Input type)
*
**
***
****     */

public class Pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no: ");
        int num = in.nextInt();

        for (int i=1; i<=num; i++){  // row
            for (int j=1; j<=i; j++){  // column
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
