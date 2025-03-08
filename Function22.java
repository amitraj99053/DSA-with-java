import java.util.Scanner;
// sum of the digits in an integer 
public class Function22 {

    public static int sumDigits(int n){
        int sumOfDigits = 0;

        while (n > 0){
            int lastDigit = n % 10;
            sumOfDigits += lastDigit;
            n /= 10;
        }
        return sumOfDigits;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int digits = in.nextInt();
        System.out.println("The sum is "+ sumDigits(digits));
    }
}
