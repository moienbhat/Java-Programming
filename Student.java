import java.util.*;

class Student {
    String name;
    int marks[];
    int total;
    double percentage;

    Student(String name, int marks[]) {
        this.name = name;
        this.marks = marks;
        calculateTotal();
        calculatePercentage();
    }

    void calculateTotal() {
        total = 0;
        for (int m : marks) {
            total += m;
        }
    }

    void calculatePercentage() {
        percentage = (double) total / marks.length;
    }

    String getGrade() {
        if (percentage >= 90) return "A";
        else if (percentage >= 75) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "Fail";
    }

    void failedSubjects() {
        boolean found = false;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 40) {
                System.out.println("Failed in Subject " + (i + 1));
                found = true;
            }
        }
        if (!found) System.out.println("No failed subjects");
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + getGrade());
        failedSubjects();
    }

    public static void main(String[] args) {
        Student s1 = new Student("amaan", new int[]{80, 75, 90});
        Student s2 = new Student("faheem", new int[]{60, 50, 40});
        Student s3 = new Student("sahil", new int[]{95, 92, 88});

        Student students[] = {s1, s2, s3};

        for (Student s : students) {
            s.display();
        }

        Arrays.sort(students, (a, b) -> b.total - a.total);

        System.out.println("\n Class Rank ");
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + " Rank: " + students[i].name +
                               " (Total: " + students[i].total + ")");
        }
    }
}
