package pack4;

public class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;
    double totalSalary;

    public PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name, 0);  // no fixed salary
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    public void calculateSalary() {
        totalSalary = hoursWorked * hourlyRate;

        System.out.println("Part Time Employee");
        System.out.println("Name: " + empName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + totalSalary);
    }
}