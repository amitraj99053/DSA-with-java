import java.util.Scanner;

public class breakStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        
        for (int i = 1; i <= num; i++){
            if (i == 10){  // loop will run till 9
                break;
            }
            System.out.println(i);
        }
        System.out.println("I'm out of the loop");
       
    } 
}
