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
        int num = in.nextInt();

        for (int line=1; line<=num; line++){  // row
            for (int star=1; star<=line; star++){  // column
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}
