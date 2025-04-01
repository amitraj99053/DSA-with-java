import java.util.Scanner;

public class arithmeticOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // arithmetic operation
        System.out.print("Enter two no.s: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("Sum: "+(num1+num2));
        System.out.println("Sub: "+(num1-num2));
        System.out.println("Mul: "+(num1*num2));
        System.out.println("Div: "+(num1/num2));
        System.out.println("Mod: "+(num1%num2));
        System.out.println(" ");
        System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20+-3*5/8);
        System.out.println(5+15/3*2-8%3);

        in.close();
    }
}
