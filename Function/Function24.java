
import java.util.Scanner;
// methods of the math class in java with function
public class Function24 {

    // Math.min( )
    public static int minOfTwoNo(int num1, int num2){
        return Math.min(num1, num2);
    }

    // Math.max( )
    public static int maxOfTwoNo(int num1, int num2){
        return Math.max(num1,num2);
    }

    // Math.sqrt( )
    public static int sqrtOfNo(int num1){
        return (int)(Math.sqrt(num1));
    }

    // Math.pow()
    public static int powerOfTwoNo(int num1, int num2){
        return (int)(Math.pow(num1, num2));
    }

    // Math.avg()
    // public static int averageOfTwoNo(int num1, int num2){
    //     return (int)(Math.avg(num1,num2));
    // }

    //Math.abs()
    public static int absoluteNo(int num1){
        return Math.abs(num1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("Minimum of " +num1+ " and "+num2+ " is: "+minOfTwoNo(num1, num2));
        System.out.println("Maximum of " +num1+ " and "+num2+ " is: "+maxOfTwoNo(num1, num2));
        System.out.println("Square root of "+num1+" is: "+sqrtOfNo(num1));
        System.out.println("Power of " +num1+ " and "+num2+ " is: "+powerOfTwoNo(num1, num2));
     //   System.out.println("Average of two no is: ");
        System.out.println("Absolute of "+num1+ " is: "+absoluteNo(num1));


    }
    
}
