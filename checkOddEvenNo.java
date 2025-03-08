import java.util.Scanner;
// check odd even
public class checkOddEvenNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num%2 == 0){
            System.out.println("Even no");
        }else {
            System.out.println("Odd no");
        }
    }
}
