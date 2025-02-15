import java.util.Scanner;

public class greaterNoBtTwoNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a >= b){
            System.out.println("A is largest: "+ a);
        }else{
            System.out.println("B is largest: "+ b);
        }
    }
}
