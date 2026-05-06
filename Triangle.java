class Triangle {
    double a, b, c;


    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    boolean isValid() {
        return (a + b > c && a + c > b && b + c > a);
    }


    void type() {
        if (!isValid()) {
            System.out.println("Not a valid triangle");
            return;
        }

        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }


    double area() {
        if (!isValid()) return 0;

        double s = (a + b + c) / 2; 
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }


    void display() {
        if (!isValid()) {
            System.out.println("Invalid triangle!");
            return;
        }

        type();
        System.out.println("Area: " + area());
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);

        System.out.println("Triangle Details:");
        t.display();
    }
}