import java.util.Scanner;

public class Function18 {
    // check palindrome 1st method
    // ege 121, 1221, 123321


    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        String s = String.valueOf(x);
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(isPalindrome(x));
    }
}


