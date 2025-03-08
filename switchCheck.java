import java.util.Scanner;

public class switchCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        switch (num){
            case 1:
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("Mango Shake");
                break;
            case 4:
                System.out.println("Water");
                break;
            default:
                System.out.println("Not match");
        }
    }
}
