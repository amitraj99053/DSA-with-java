import java.util.Scanner;

// reverse number 2nd method
public class reverseTheNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int rev = 0;

        while (num > 0){
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num = num/10;
        }
        System.out.println(rev);
    }
}
