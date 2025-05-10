import java.util.Scanner;

public class ArrayQn11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int marks[] = new int[20];

        marks[0] = in.nextInt(); // phy
        marks[1] = in.nextInt(); // chem
        marks[2] = in.nextInt(); // maths

        System.out.println("Phy : "+ marks[0]);
        System.out.println("Chem : "+ marks[1]);
        System.out.println("Maths : "+ marks[2]);

        int percent = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentile = "+ percent +"%");
        in.close();
    }
}
