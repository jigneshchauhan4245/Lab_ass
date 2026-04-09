package pack15;

public class Student extends Person {
    int rollNo;

    public Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Roll No: " + rollNo);
    }
}