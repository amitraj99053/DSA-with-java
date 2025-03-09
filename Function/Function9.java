import java.util.Scanner;
// find factorial
public class Function9 {

    public static int factorial(int num){
        int f = 1;

        for (int i=1; i<=num; i++){
            f = f*i;
        } return f;  // factorial of num
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println("factorial of num: "+ factorial(num));
    }
}
