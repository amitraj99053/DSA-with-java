import java.util.Scanner;
/*
inverted half pyramid (input type)
*****
****
***
**
*      */
public class Pattern3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no: ");
        int num = in.nextInt();

        for (int i=num; i>=1; i--){  //row
            for (int j=1; j<=i; j++){ // column
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
