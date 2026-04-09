import pack15.*;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        Result r = new Result(name, age, rollNo, marks);

        r.calculateGrade();
        System.out.println("\n--- Result Details ---");
        r.showDetails();
        sc.close();
    }
}