import java.util.Scanner;

public class Function17 {
    // decimal to binary conversion

    public static void decToBin(int num){
        int myNum = num;
        int pow = 0;
        int binNum = 0;

        while (num > 0){
            int rem = num % 2;  // remainder ya lastDigit
            binNum = binNum + (rem * (int) Math.pow(10,pow)); // conversion
            pow++;
            num = num / 2;
        }
        System.out.println("Binary form of "+ myNum+ " = "+ binNum);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        decToBin(num);
    }
}
