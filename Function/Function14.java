import java.util.Scanner;
// check prime no in optimised ways
public class Function14 {

    public static boolean isPrime(int n){
        if (n == 2){
            return true;
        }

        for (int i=2; i<=Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }
}
