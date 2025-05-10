import java.util.Scanner;

public class ArrayQn6 {
    // input array to ask marks of subject (phy, chem, math )
    public static void main(String[] args) {
        int marks[] = new int[10];

     Scanner in = new Scanner(System.in);

     marks[0] = in.nextInt(); // phy
     marks[1] = in.nextInt(); // chem
     marks[2] = in.nextInt(); // math
     
     System.out.println("Phy : " + marks[0]);
     System.out.println("Chem : " + marks[1]);
     System.out.println("Math : " + marks[2]);
     in.close();
    }
}
