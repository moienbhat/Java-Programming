package result;

public class PGStudent implements Result {
    private String name;
    private String rollNo;
    private int[] marks;

    public PGStudent(String name, String rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String calculateGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else return "D";
    }

    public void displayResult() {
        int total = 0;
        for (int m : marks) total += m;
        double percentage = total / 5.0;

        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        for (int i = 0; i < marks.length; i++)
            System.out.println("Subject " + (i+1) + "  : " + marks[i]);
        System.out.println("Total      : " + total + " / 500");
        System.out.printf("Percentage : %.2f%%%n", percentage);
        System.out.println("Grade      : " + calculateGrade(percentage));

    }
}
