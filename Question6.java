import java.util.ArrayList;

abstract class Shape {
    public abstract double area();
    public abstract void display();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.printf("Circle [Radius: %.2f] -> Area: %.2f%n", radius, area());
    }
}

public class Question6 {
    public static void main(String[] args) {
        System.out.println("--- Question 6: ArrayList & Polymorphism with Shape ---");
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(3.5));
        shapes.add(new Circle(5.0));
        shapes.add(new Circle(2.1));

        System.out.println("\nCalculating area for Circle objects in ArrayList<Shape>:");
        for (Shape s : shapes) {
            s.display();
        }
    }
}
