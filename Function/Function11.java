import java.util.Scanner;

public class Function11 {
    // function overloading using parameters
    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println("Sum of two no: "+ sum(a,b));
        System.out.println("Sum of three no: "+ sum(a,b,c));
    }
}
