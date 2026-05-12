class Shape {
    double calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Program10_ShapeArea {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        Triangle t = new Triangle(4, 6);

        System.out.println("Rectangle Area: " + r.calculateArea());
        System.out.println("Triangle Area: " + t.calculateArea());
    }
}