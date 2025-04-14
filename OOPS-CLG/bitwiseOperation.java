import java.util.Scanner;

public class bitwiseOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two no: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt(); 
      
        //AND Operator
        System.out.println("num1 & num2 = " + (num1 & num2));
        
        //OR Operator
        System.out.println("num1 | num2 = " + (num1 | num2) );
        
        //XOR Operator
        System.out.println("num1 ^ num2 = " + (num1 ^ num2) );
        
        //Complement Operator
        int comple = ~num1;
        System.out.println("~num1 = " + comple );
      
        //Left Shift Operator
        int LeftShift = num1 <<  2;
        System.out.println("num1 << 2 = " + LeftShift );
      
        //Right Shift Operator
        int RightShift = num1 >>  2;
        System.out.println("num1 >> 2  = " + RightShift );
      
        //Shift right zero fill operator
        int ShiftRight = num1 >>> 2;
        System.out.println("num1 >>> 2 = " + ShiftRight );
    
        in.close();
    }
    
}
