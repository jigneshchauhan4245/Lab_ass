package pack16;

public class UnderGraduate extends University {
    int marks;

    public UnderGraduate(String universityName, int marks) {
        super(universityName);
        this.marks = marks;
    }

    public void checkAdmission() {
        showUniversity();
        System.out.println("Undergraduate Marks: " + marks);

        if (marks >= 50) {
            System.out.println("Admission Eligible");
        } else {
            System.out.println("Admission Not Eligible");
        }
    }
}