import java.util.Scanner;

public class findError {
    public static void main(String[] args) {

        for (int i = 1; i<=5; i++){
            System.out.println("i = "+ i);
        }
        //System.out.println("i after the loop = " + i);

        /*
        In this program variable i is declared in the for loop. So scope of variable i
        is limited to the for loop only that is between {and} of the for loop. There is
        a display statement after the for loop where variable i is used which means i is
        used out of scope. This leads to compilation errors.
        */
    }
}
