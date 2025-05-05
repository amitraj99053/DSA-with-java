import java.util.Scanner;
// Print the minimum number of coins/notes.
public class MinCoins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int[] denomi = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int count = 0;
        
        for (int i = denomi.length - 1; i >= 0; i--) {
            while (v >= denomi[i]) {
                v -= denomi[i];
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }

}
