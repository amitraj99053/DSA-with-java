import java.util.Scanner;

// hollow rectangle (input type)
public class Pattern4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st no: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd no: ");
        int num2 = in.nextInt();

        for (int i=1; i<=num1; i++){
            for (int j=1; j<=num2; j++){
                if (i == 1 || j == 1 || i == num1 || j == num2){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
