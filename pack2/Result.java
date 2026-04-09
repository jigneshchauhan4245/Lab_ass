package pack2;

public class Result extends Student {
    String grade;

    public Result(String studentName, int rollNo, int marks) {
        super(studentName, rollNo, marks);
    }

    public void calculateGrade() {
        if (marks >= 75) {
            grade = "Distinction";
        } else if (marks >= 60) {
            grade = "First Class";
        } else if (marks >= 50) {
            grade = "Second Class";
        } else {
            grade = "Fail";
        }
    }

    public void showResult() {
        showStudent();  // Parent method
        System.out.println("Grade: " + grade);
    }
}