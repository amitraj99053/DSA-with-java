import java.util.Scanner;

public class oddEvenByTernaryOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        // ternary operator
        String type =  ((num%2) == 0)? "Even" : "Odd";
        System.out.println(type);
    }
}
