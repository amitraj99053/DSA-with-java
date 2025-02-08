import java.util.Scanner;

public class Function3 {

    // Enter 3 numbers from the user & make a function to print their average.
    public static int averageOfThreeNo(int num1, int num2, int num3){
        return (num1 + num2 + num3)/3;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three no: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int avg = averageOfThreeNo(num1,num2,num3);
        System.out.println("Average of three no: "+ avg);
    }
}
