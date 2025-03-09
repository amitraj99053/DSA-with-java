import java.util.Scanner;

public class Function4 {

    //  sum of all odd numbers from 1 to n.
    // ex: n=6 so output=(1+3+5)=9
    public static int sumOfOddNo(int num){
        if (num < 1) {
            System.out.println("Input must be a positive integer.");
        }

        int sum = 0;
        for (int i = 1; i <= num; i++){
            if (i % 2 != 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int num = in.nextInt();
        int sum = sumOfOddNo(num);
        System.out.println("Sum of odd no: "+ sum);
    }
}
