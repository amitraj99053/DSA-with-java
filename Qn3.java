public class Qn3 {
    // type promotion in expression
    public static void main(String[] args) {
        char a = 'a'; // 97
        char b = 'b'; // 98
        float c = 89.999999f;
        int d = 8;
        long l = 78;

        System.out.println(b-a); // 98 - 97 ascii value
        System.out.println((a + d ) * (c / l));
    }
}
