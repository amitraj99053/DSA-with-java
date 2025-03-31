public class Qn12 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // AND logical operators
        System.out.println((3>2) && (5>2)); // ture operation return true only

        // OR logical operators
        System.out.println((3>2) || (5>2)); // except both false operation return always true

        // NOT logical operators
        System.out.println( !(8>5) ); // return opposite operation

        // assignment operator
        int a = 10;
        a += 20;
        System.out.println(a);

        int b = 9;
        b -= 8;
        System.out.println(b);

        int c =9;
        c *= 8;
        System.out.println(c);

        int d = 23;
        d /= 5;
        System.out.println(d);

        int x = 3*4-1;
        System.out.println(x);

    }
}
