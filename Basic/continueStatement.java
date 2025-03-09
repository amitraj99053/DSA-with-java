import java.util.Scanner;
// continue statement
// skip the value if matched
public class continueStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num  = in.nextInt();

        for(int i = 1; i <= num; i++){
            if (i == 3){
                continue;  // skip the value
            }
            System.out.println(i);
        }
    }
}
