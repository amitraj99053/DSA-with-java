import java.util.Scanner;
public class ComplexNoClasifier {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter imaginary no: ");
        int imgNo = in.nextInt();
        System.out.println("Enter real no: ");
        int realNo = in.nextInt();

        if(imgNo == 0) {
            System.out.println("Purely Real no: ");
        } else if(realNo == 0) {
            System.out.println("Purely Imaginary no: ");
        } else {
            System.out.println("Purely Complex no:");
        }

        in.close();
    }
}
