import pack4.*;

public class Q4 {
    public static void main(String[] args) {

        System.out.println("---- Full Time Employee ----");
        FullTimeEmployee f = new FullTimeEmployee("Rohan", 35000);
        f.calculateSalary();

        System.out.println("\n---- Part Time Employee ----");
        PartTimeEmployee p = new PartTimeEmployee("Rahul", 5, 500);
        p.calculateSalary();
    }
}