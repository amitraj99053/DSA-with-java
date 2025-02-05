import java.util.Scanner;
// greatest no between three no
public class GreaterNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first no: ");
        int num1 = in.nextInt();
        System.out.println("Enter second no: ");
        int num2 = in.nextInt();
        System.out.println("Enter third no: ");
        int num3 = in.nextInt();

        if (num1>num2){
            if (num1>num3){
                System.out.println("First no");
            }else {
                System.out.println("Third no");
            }
        } else if (num2>num3){
            System.out.println("Second no");
        }else {
            System.out.println("Third no");
        }
    }
}
