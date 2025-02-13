public class Qn8 {
    public static void main(String[] args) {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        // all data type promoted into double because it's larger size.
        double result = (f * b) + (i % c) - (d * s);
        System.out.println(result);
    }
}
