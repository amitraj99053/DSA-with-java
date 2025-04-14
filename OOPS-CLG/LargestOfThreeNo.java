import java.util.Scanner;
// largest of three numbers.
public class LargestOfThreeNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three no: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if(num1 > num2) {
            System.out.println("Num1 is largest");
        } else if(num2 > num3){
            System.out.println("Num2 is largest");
        } else if (num1 > num3) {
            System.out.println("Num1 is largest");
        } else {
            System.out.println("Num3 is largest");
        }

        in.close();
    }
}
