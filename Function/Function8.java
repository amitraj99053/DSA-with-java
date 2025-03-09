public class Function8 {
    // swapping of values

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+ a); // value swapped
        System.out.println("b = "+ b); // value swapped
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a,b); // function call

        System.out.println("a = "+ a); // value not swapped
        System.out.println("b = "+ b); // value not swapped
    }
}
