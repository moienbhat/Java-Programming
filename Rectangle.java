class Rectangle {
    double length, breadth;


    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    double area() {
        return length * breadth;
    }


    double perimeter() {
        return 2 * (length + breadth);
    }


    boolean isSquare() {
        return length == breadth;
    }


    double diagonal() {
        return Math.sqrt(length * length + breadth * breadth);
    }


    void compare(Rectangle r) {
        System.out.println("\n Comparison ");


        if (this.area() > r.area()) {
            System.out.println("Rectangle 1 has larger area");
        } else if (this.area() < r.area()) {
            System.out.println("Rectangle 2 has larger area");
        } else {
            System.out.println("Both have equal area");
        }


        if (this.diagonal() > r.diagonal()) {
            System.out.println("Rectangle 1 has larger diagonal");
        } else if (this.diagonal() < r.diagonal()) {
            System.out.println("Rectangle 2 has larger diagonal");
        } else {
            System.out.println("Both have equal diagonal");
        }
    }


    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println("Is Square: " + isSquare());
        System.out.println("Diagonal: " + diagonal());
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 4);
        Rectangle r2 = new Rectangle(6, 6);

        System.out.println("Rectangle 1:");
        r1.display();

        System.out.println("\nRectangle 2:");
        r2.display();

        r1.compare(r2);
    }
}