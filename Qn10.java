public class Qn10 {
    public static void main(String[] args) {

        // pre decrement
        int a = 10;
        int b = --a;
        System.out.println(a); // updated in decrement
        System.out.println(b);

        // post decrement
        int c = 100;
        int d = c--;
        System.out.println(c);
        System.out.println(d);
    }
}
