import java.util.Scanner;

public class switchQn2 {

    // match age with 25 & 30
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Integer age = in.nextInt();

            switch (age) { // Extract primitive value for switch
                case 25:
                    System.out.println("You are 25.");
                    break;
                case 30:
                    System.out.println("You are 30.");
                    break;
                default:
                    System.out.println("Age not matched.");
            }
        }
    }
