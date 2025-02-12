import java.util.Scanner;

public class Function6 {
    // find circumference of a circle
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius = in.nextInt();
        int circumference = circumferenceOfCircle(radius);
        System.out.println("circumference : "+ circumference);
    }

    public static int circumferenceOfCircle(int radius){
        return (int) (2 * 3.14 * radius);
    }
}
