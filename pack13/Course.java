package pack13;

import java.util.Scanner;

public class Course {

    String studentNames[];
    String courseNames[];
    int size;

    
    public Course(int size) {
        this.size = size;
        studentNames = new String[size];
        courseNames = new String[size];
    }


    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Student Name: ");
            studentNames[i] = sc.nextLine();

            System.out.print("Enter Course Name: ");
            courseNames[i] = sc.nextLine();
        }
        sc.close();
    }

    
    public void displayDetails() {
        System.out.println("\n--- Student Course Details ---");

        for (int i = 0; i < size; i++) {
            System.out.println("Student: " + studentNames[i]);
            System.out.println("Course: " + courseNames[i]);
        }
    }


    public void countStudentsInCourse(String course) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (courseNames[i].equalsIgnoreCase(course)) {
                count++;
            }
        }

        System.out.println("\nStudents enrolled in " + course + ": " + count);
    }
}