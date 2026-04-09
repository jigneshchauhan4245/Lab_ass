import pack13.*;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Course c = new Course(3);

        c.acceptDetails();
        c.displayDetails();

        System.out.print("\nEnter course to count students: ");
        String courseName = sc.nextLine();

        c.countStudentsInCourse(courseName);
        sc.close();
    }
}