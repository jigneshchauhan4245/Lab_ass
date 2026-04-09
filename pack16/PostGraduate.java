package pack16;

public class PostGraduate extends University {
    int marks;

    public PostGraduate(String universityName, int marks) {
        super(universityName);
        this.marks = marks;
    }

    public void checkAdmission() {
        showUniversity();
        System.out.println("Postgraduate Marks: " + marks);

        if (marks >= 50) {
            System.out.println("Admission Eligible");
        } else {
            System.out.println("Admission Not Eligible");
        }
    }
}