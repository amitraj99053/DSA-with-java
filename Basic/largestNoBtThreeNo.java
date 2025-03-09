import java.util.Scanner;

// largest among three no
public class largestNoBtThreeNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("Num1 is greater: "+ num1);
        } else if (num2 >= num3) {
            System.out.println("Num2 is greater: "+ num2);
        }else {
            System.out.println("Num3 is greater: "+ num3);
        }
    }
}
