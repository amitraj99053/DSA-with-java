import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
