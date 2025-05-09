import java.util.Scanner;
/*  
print 0-1 triangle
n = 4
1
01
101
0101    */
public class Pattern17 {

    public static void zero_one_triangle(int n) {
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= i; j++) {
                if ((i+j) % 2 == 0) { // check even is sum of row and col 
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        zero_one_triangle(n);
        in.close();
    }
}
