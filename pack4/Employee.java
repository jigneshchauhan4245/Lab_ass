package pack4;

public abstract class Employee {
    String empName;
    double basicSalary;

    public Employee(String empName, double basicSalary) {
        this.empName = empName;
        this.basicSalary = basicSalary;
    }
    public abstract void calculateSalary();
}