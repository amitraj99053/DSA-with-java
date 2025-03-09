import java.util.Scanner;
// print prime series till n number
public class Function15 {
    public static boolean isPrime(int n){   // check prime no
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

    public static void primesInRange(int num){  // print prime series
        for (int i=2; i<=num; i++){
            if (isPrime(i)){  // true
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        primesInRange(num);

    }
}
