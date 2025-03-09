import java.util.Scanner;
// half pyramid with numbers
public class Pattern6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n = in.nextInt();

        for (int line=1; line<=n; line++){
            for (int num=1; num<=line; num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
