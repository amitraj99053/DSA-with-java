import java.util.Scanner;

public class Function13 {
    // check a number is prime or not
    public static boolean isPrime(int n){
        for (int i=2; i<=(n-i); i++){
            if (n % i == 0){     // completely dividing
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
