import java.util.Scanner;
/*
Enter cost of 3 items from the user (using float data type)-
a pencil, a pen and an eraser. You have to output the total
cost of the items back to the user as their bill in java.
You can also try adding 18% gst tax to the items in the bill
as an advanced problem.

*/
public class Qn7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float pencil = in.nextFloat();
        float pen = in.nextFloat();
        float eraser  = in.nextFloat();

        float totalCost = pencil + pen + eraser;

        System.out.println("----Your Bill----");
        System.out.println("Pencil:₹ " +pencil);
        System.out.println("Pen:₹ " +pen);
        System.out.println("Eraser:₹ " +eraser);
        System.out.println("------------------");
        System.out.println("Subtotal:₹ " +totalCost);

        // gst calculating
        float gstRate = 0.18f;
        float gstAmount = totalCost * gstRate;
        float totalAmount = totalCost + gstAmount;

        System.out.println("GST (18%):₹ " +gstAmount);
        System.out.println("------------------");
        System.out.println("Total Amount:₹ " +totalAmount);
        System.out.println("------------------");

    }
}
