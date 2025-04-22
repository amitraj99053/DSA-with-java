import java.util.Scanner;
/* 
Enter no: 
5
A
BC
DEF
GHIJ
KLMNO
*/

public class Pattern13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no: ");
        int n = in.nextInt();  // no of lines
        char ch = 'A';

        for (int line = 1; line <= n; line++){
            for (int chars = 1; chars <= line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
