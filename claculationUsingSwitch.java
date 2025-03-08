import java.util.Scanner;

public class claculationUsingSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        String operation = in.next();

        switch (operation){
            case "+" :
                System.out.println("Sum: "+ (num1 + num2));
                break;
            case "-" :
                System.out.println("Sub: "+ (num1 - num2));
                break;
            case "*" :
                System.out.println("Mul: "+ (num1 * num2));
                break;
            case "/" :
                System.out.println("Div: "+ (num1 / num2));
                break;
            case "%" :
                System.out.println("Remainder: "+ (num1 % num2));
                break;
            default:
                System.out.println("Not match");
        }
    }
}
