public class ternryOperat {
    public static void main(String[] args) {
        
        int a = 10, b = 20, max;
        max = (a > b) ? a : b; // ternary operator
        System.out.println("Max is: " + max);
        // nested ternary operator
        int max1 = (a > b) ? a : (b > a) ? b : 0;
        System.out.println("Max is: " + max1);
    }
}
