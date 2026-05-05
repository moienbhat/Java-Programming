class Circle {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double area() {
        return Math.PI * r * r;
    }

    double circumference() {
        return 2 * Math.PI * r;
    }

    boolean canFitInside(Circle c) {
        return this.r < c.r;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);

        System.out.println("Area: " + c1.area());
        System.out.println("Fits inside: " + c1.canFitInside(c2));
    }
}