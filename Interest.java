class Interest {
    double p, r, t;

    Interest(double p, double r, double t) {
        this.p = p;
        this.r = r;
        this.t = t;
    }

    double simpleInterest() {
        return (p * r * t) / 100;
    }

    double compoundInterest() {
        return p * Math.pow((1 + r / 100), t) - p;
    }

    void compare() {
        double si = simpleInterest();
        double ci = compoundInterest();

        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);

        if (ci > si) {
            System.out.println("Compound Interest gives higher return");
        } else if (si > ci) {
            System.out.println("Simple Interest gives higher return");
        } else {
            System.out.println("Both give same return");
        }

        System.out.println("Difference: " + Math.abs(ci - si));
    }

    public static void main(String[] args) {
        Interest i = new Interest(1000, 5, 2);
        i.compare();
    }
}