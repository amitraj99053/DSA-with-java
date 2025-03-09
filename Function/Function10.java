import java.util.Scanner;
// binomial coefficient
public class Function10 {

    public static int factorial(int num){
        int f = 1;

        for (int i=1; i<=num; i++){
            f = f*i;
        }return f; // factorial of num
    }

    public static int binomialCoefficient(int n, int r){
        int fact_n = factorial(n); // factorial of n
        int fact_r = factorial(r); // factorial of r
        int fact_nmr = factorial(n-r);  // factorial of n-r
        return fact_n/(fact_r * fact_nmr);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();

        System.out.println("Binomial Coefficient: "+ binomialCoefficient(n,r));
    }
}
