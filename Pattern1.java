import java.util.Scanner;
/*
Solid rectangle (input type)
****
****
****
****         */
public class Pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no: ");
        int num = in.nextInt();

        for(int i=1; i<=num; i++){
            for (int j=1; j<=num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
