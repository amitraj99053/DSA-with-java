import java.util.Scanner;

public class bitwiseOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two no: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt(); 
        int num3 = 0;
      
        //AND
        System.out.println("num1 & num2 = " + (num1 & num2));
        
        //OR
        System.out.println("num1 | num2 = " + (num1 | num2) );
        
        //XOR
        System.out.println("num1 ^ num2 = " + (num1 ^ num2) );
        
        //Complement Operator
        System.out.println("~num1 = " + ~num1 );
      
        //Left Shift Operator
        num3 = num1 <<  2;
        System.out.println("num1 << 1 = " + num3 );
      
        //Right Shift Operator
        num3 = num1 >>  2;
        System.out.println("num1 >> 1  = " + num3 );
      
        //Shift right zero fill operator
        num3 = num1 >>> 2;
        System.out.println("num1 >>> 1 = " + num3 );
    
        in.close();
    }
    
}
