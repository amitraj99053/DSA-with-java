import java.util.Scanner;
// check age
public class checkAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int age = in.nextInt();

         if (age >= 18){
             System.out.println("Adult");
         } else if (age >= 13 && age < 18) {
             System.out.println("Teenager");
         }else {
             System.out.println("Child");
         }
    }
}
