public class Qn13 {
    public static void main(String[] args) {
        int x = 2, y = 5;

        // multiplicative operator
        int exp1 = (x * y / x);  // 2*5/2= 10/2
        int exp2 = (x * (y / x)); // 2*(5/2)= 2*2

        System.out.print(exp1 + " , ");
        System.out.print(exp2);
    }
}
