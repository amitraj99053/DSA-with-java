import java.util.Scanner;

// check palindrome 2nd method
// ege 121, 1221, 123321
public class Function21 {

    public static boolean isPalindrome(int num){
        int palindrome = num;
        int reverse = 0;

        while (palindrome != 0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if (num == reverse){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int palindrome = in.nextInt();

        if (isPalindrome(palindrome)){
            System.out.println("Number : "+ palindrome +" is a palindrome");
        }else {
            System.out.println("Number : "+ palindrome +" is not a palindrome");
        }

    }
}
