import java.util.Scanner;

public class Function7 {
    // check eligible to vote or note
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        boolean eligible = checkAge(age);
        System.out.println("Eligible : "+ eligible);
    }

    public static boolean checkAge(int age){
        return age >= 18;
    }
}
