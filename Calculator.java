import java.util.*;

class Calculator {
    double a, b;
    char op;
    static LinkedList<String> history = new LinkedList<>();

    Calculator(double a, double b, char op) {
        this.a = a;
        this.b = b;
        this.op = op;
    }

    void calculate() {
        double result = 0;
        try {
            switch (op) {
                case '+': result = a + b; break;
                case '-': result = a - b; break;
                case '*': result = a * b; break;
                case '/':
                    if (b == 0) throw new ArithmeticException("Divide by zero");
                    result = a / b; break;
                default:
                    System.out.println("Invalid operator");
                    return;
            }

            String res = a + " " + op + " " + b + " = " + result;
            history.add(res);

            if (history.size() > 5)
                history.removeFirst();

            System.out.println(res);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void showHistory() {
        System.out.println("\nLast 5 Calculations:");
        for (String h : history) {
            System.out.println(h);
        }
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator(10, 2, '/');
        Calculator c2 = new Calculator(5, 3, '+');
        Calculator c3 = new Calculator(8, 0, '/');

        c1.calculate();
        c2.calculate();
        c3.calculate();

        showHistory();
    }
}