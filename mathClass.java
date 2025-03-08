import java.util.Scanner;
//  java math class
public class mathClass {

    // return the maximum of two numbers
    public static double maximumOfTwoNum(double n1, double n2){
        return Math.max(n1,n2);
    }

    // return the square root of y
    public static double squareRootOfN2(double n2){
        return Math.sqrt(n2);
    }

    //returns 28 power of 4 i.e. 28*28*28*28
    public static double powerOfN1(double n1, double n2){
        return Math.pow(n1,n2);
    }

    // return the logarithm of given value
    public static double logrithmOfNum(double n1){
        double logri1 = Math.log(n1);
        return logri1;
    }

    // return the logarithm of given value when base is 10
    public static double logritmOfNumWhenBaseIs10(double n1){
        return Math.log10(n1);
    }

    // return the log of x + 1
    public static double log1p(double n1){
        return Math.log1p(n1);
    }


    // return a power of 2
    public static double powerOfTwo(double n1){
        return Math.exp(n1);
    }

    // return (a power of 2)-1
    public static double powerOfTwoNumMinOne(double n1){
        return Math.expm1(n1);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();

        System.out.println("Maximum of two number: "+maximumOfTwoNum(n1,n2));
        System.out.println("Square root of N2: "+squareRootOfN2(n2));
        System.out.println("Power of N1 to N2: "+powerOfN1(n1,n2));
        System.out.println("Logrithm of N1 and N2: "+logrithmOfNum(n1));
        System.out.println("Logrithm of num when base is 10: "+logritmOfNumWhenBaseIs10(n1));
        System.out.println("Log1p: "+log1p(n1));
        System.out.println("Power of 2: "+powerOfTwo(n1));
        System.out.println("(Power of 2) - 1: "+powerOfTwoNumMinOne(n1));

    }
}
