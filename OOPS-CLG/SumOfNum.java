
class SumOfNum {
    // Properties
    private int a;
    private int b;

    // Setter methods
    public void setA(int a) { this.a = a; }
    public void setB(int b) { this.b = b; }

    // Methods
    public void sum() { System.out.println(a + b); }
    public void sub() { System.out.println(a - b); }

    public static void main(String[] args) {
    SumOfNum obj = new SumOfNum();

    // Using setters instead of direct access
    obj.setA(1);
    obj.setB(2);

    obj.sum();
    obj.sub();

    }
}