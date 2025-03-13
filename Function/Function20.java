import java.util.Scanner;
/*
Write a method named isEven that accepts an int argument.The method should return true if the argument is even,
or false otherwise. Also write a program to test your method.       */
public class Function20 {

    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (isEven(num)){
            System.out.println("Number is even");
        }
        System.out.println("Number is odd");
    }
}
