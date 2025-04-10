public class getSet {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

    }
}

class Pen {
    private String color;
    private int tip;

    public String getColor() {
        return this.color;
    }

    public int getTip() {
        return this.tip;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }
}

