public class Qn9 {
    public static void main(String[] args) {
        int $ = 24;
        int a = 4;
        int b = 4;

        System.out.println($);
        System.out.println("Sum = "+ (a+b));

        // pre increment
        int preIncOfA = ++a;
        System.out.println(a); // update
        System.out.println(preIncOfA);  // updated
        System.out.println("----");

        // post increment
        int postIncOfB = b++;
        System.out.println(b);  // update value of b
        System.out.println(postIncOfB); // old value of b
    }
}
