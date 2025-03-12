import java.util.Scanner;
// inverted half pyramid with numbers

public class Pattern7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n = in.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=(n-i+1); j++){
                System.out.print(j);
            }
            System.out.println();
        }
        in.close();
    }
}
