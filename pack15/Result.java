package pack15;

public class Result extends Student {
    int marks;
    String grade;

    public Result(String name, int age, int rollNo, int marks) {
        super(name, age, rollNo);
        this.marks = marks;
    }
    public void calculateGrade() {
        if (marks >= 80) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 40) {
            grade = "C";
        } else {
            grade = "Fail";
        }
    }
    public void showDetails() {
        super.showDetails();
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}