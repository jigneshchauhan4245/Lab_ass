package pack4;

public class FullTimeEmployee extends Employee {
    double bonus;
    double totalSalary;

    public FullTimeEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }
    public void calculateSalary() {
        if (basicSalary >= 30000) {
            bonus = 5000;
        } else {
            bonus = 2000;
        }

        totalSalary = basicSalary + bonus;

        System.out.println("Full Time Employee");
        System.out.println("Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}