import java.util.Scanner;
// print table of any number
public class printTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        for (int i=1; i<=10; i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}
