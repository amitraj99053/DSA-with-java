import java.util.Scanner;

public class Function19 {
// average of three number using function
    public static double average(double num1, double num2, double num3){
        double avg = (num1 + num2 + num3)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        double num3 = in.nextDouble();
        double store = average(num1,num2,num3);
        System.out.println(store);
    }
}
