import java.util.Scanner;
// binary to decimal conversion
public class Function16 {

    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit *(int) Math.pow(2,pow));

            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal of "+ myNum +" = "+ decNum);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter binary no only: ");
        int binNum = in.nextInt();
        binToDec(binNum);
//        binToDec(101);
    }
}
