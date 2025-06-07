
class Shape {
   
    public double getPerimeter() {
        System.out.println("Calculating perimeter for a generic shape.");
        return 0.0;
    }

    public double getArea() {
        System.out.println("Calculating area for a generic shape.");
        return 0.0; 
    }
}

class Circle extends Shape {
    private double radius; 

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape genericShape = new Shape();
        System.out.println("--- Generic Shape ---");
        System.out.println("Perimeter: " + genericShape.getPerimeter());
        System.out.println("Area: " + genericShape.getArea());
        System.out.println();

        double circleRadius = 5.0;
        Circle myCircle = new Circle(circleRadius);
        System.out.println("--- Circle with Radius " + myCircle.getRadius() + " ---");
        System.out.println("Perimeter (Circumference): " + myCircle.getPerimeter());
        System.out.println("Area: " + myCircle.getArea());
        System.out.println();

        Shape polymorphicCircle = new Circle(7.5);
        System.out.println("--- Polymorphic Circle with Radius 7.5 (referred as Shape) ---");
        System.out.println("Perimeter (Circunference): " + polymorphicCircle.getPerimeter());
        System.out.println("Area: " + polymorphicCircle.getArea());
    }
}
