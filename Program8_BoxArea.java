class Shape {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

class Box extends Rectangle {
    double height;

    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    double getArea() {
        return 2 * ((length * width) + (width * height) + (length * height));
    }
}

public class Program8_BoxArea {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println("Shape Area: " + s.getArea());

        Rectangle r = new Rectangle(5, 4);
        System.out.println("Rectangle Area: " + r.getArea());

        Box b = new Box(5, 4, 3);
        System.out.println("Box Surface Area: " + b.getArea());
    }
}