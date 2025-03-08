import java.util.Scanner;

public class switchQn1 {

    // increase 1 with current value till 2
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();

            switch (x + 1) {
                case 1:
                    System.out.println(1);
                    break;
                case 1 + 1:
                    System.out.println(2);
                    break;
                case 2 + 1:
                    System.out.println(3);
                    break;
                default:
                    System.out.println("Default");
            }
        }
    }
