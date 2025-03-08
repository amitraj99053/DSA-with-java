import java.util.Scanner;
// calculate income tax
public class incomeTaxCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int income = in.nextInt();
        int tax;

        if (income < 500000){
            tax = 0;  // 0% tax
        } else if (income >= 500000 && income <= 1000000) {
            tax = (int) (0.2*income);  // 20% tax
        }else {
            tax = (int) (0.3*income);  // 30% tax
        }
        System.out.println("Your tax is: "+ tax);
    }
}
