import java.util.Scanner;

public class Function5 {

    //  function which takes 2 numbers and returns the greater of those two.
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("Enter two no: ");
       int num1 = in.nextInt();
       int num2 = in.nextInt();
       int greatest = greatestNo(num1,num2);
        System.out.println("Greater no: "+ greatest);
    }

    public static int greatestNo(int num1, int num2){
        if (num1 > num2){
            return num1;
        }
        return num2;
    }

}

