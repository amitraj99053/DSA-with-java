import java.util.Scanner;
// display the day of the week based on a given number.
public class WeekDayCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dayNum = in.nextInt();

        switch (dayNum) {
            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wednesday");
            break;

            case 4:
            System.err.println("Thursday");
            break;

            case 5:
            System.out.println("Friday");
            break;

            case 6:
            System.out.println("Saturday");
            break;

            case 7:
            System.out.println("Sunday");
            break;

            default :
            System.out.println("Please enter number between 1 to 7 only: ");
        }
    }
}
