// Multilevel Inheritance

class Numbers {
    int a = 10, b = 20;
}

class Add2 extends Numbers {
    int c = 30;
    public void sum2() {
        System.out.println("Sum of 2 nos.: " + (a + b));
    }
}

class Add3 extends Add2 {
    public void sum3() {
        System.out.println("Sum of 3 nos.: " + (a + b + c));
    }
}

public class Main {
    public static void main(String[] args) {
        Add3 obj = new Add3();
        obj.sum2();
        obj.sum3();
    }
}
