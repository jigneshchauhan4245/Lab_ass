package pack2;

public class Student {
    String studentName;
    int rollNo;
    int marks;

    public Student(String studentName, int rollNo, int marks) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void showStudent() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}