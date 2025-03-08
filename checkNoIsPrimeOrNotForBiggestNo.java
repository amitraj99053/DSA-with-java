import java.util.Scanner;
// check prime number for large number
public class checkNoIsPrimeOrNotForBiggestNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();


        if (num == 2){
            System.out.println("Num is prime");
        }else {
            boolean isPrime = true;
            for (int i=2; i<=Math.sqrt(num); i++){
                if (num % i == 0){  // num is a multiple of i (i not equal to 1 or num)
                    isPrime = false;
                }
            }


            if (isPrime == true){
                System.out.println("Num is prime");
            }else {
                System.out.println("Num in not prime");
            }

        }
    }

}
