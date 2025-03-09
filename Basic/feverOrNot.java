import java.util.Scanner;
// check if temp is above 100 print fever otherwise not
public class feverOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();

        if (temp > 100){
            System.out.println("You have fever");
        }else {
            System.out.println("You don't have fever");
        }
    }
}
