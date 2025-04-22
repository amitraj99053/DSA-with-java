import java.util.Scanner;
/*
inverted half pyramid (rotated by 180 deg)
    *
   **
  ***
 ****
*****    */
public class Pattern5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no: ");
        int num = in.nextInt();

        // outer loop
        for(int i=1; i<=num; i++){
            // space
            for (int j=1; j<=num-i; j++){
                System.out.print(" ");
            }

            // star print
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        in.close();
    }
}
