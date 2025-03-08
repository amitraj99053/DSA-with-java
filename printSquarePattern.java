import java.util.Scanner;

public class printSquarePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        // both are correct
//        for (int i = 1; i <= n; i++) {
//            System.out.println("****");
//        }

        int i = 1;
        while (i <= n) {
            System.out.println("****");
            i++;
        }
    }
}
