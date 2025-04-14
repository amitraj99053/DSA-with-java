import java.util.Scanner;
/*
Write a Java program that solves a quadratic equation of the form ax² + bx + c = 0.Calculate the discriminant (D = b² - 4ac).
If D > 0: Print two distinct real roots.
If D == 0: Print one repeated real root.
If D < 0: Print two imaginary roots in the form real ± imaginary i.           */
public class QuadraticEqnSol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three no: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Two distinct real roots: " +root1+ " and " + root2);
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("One repeated real root: " +root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(Math.abs(d)) / (2 * a);
            System.out.println("Two imaginary roots: " +realPart+ " + " +imaginaryPart+ " i and " +realPart+ " - " +imaginaryPart+ " i");
        }


        in.close();
    }
}
