import java.util.Scanner;
// print number from 1 to N.
public class printNo1toN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int range = in.nextInt();
        int counter = 1;

        while (counter <= range){
            System.out.print(counter +" ");
            counter++;
        }
        System.out.println();
    }
}
