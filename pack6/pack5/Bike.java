package pack5;

public class Bike extends Vehicle {
    int days;
    double totalRent;

    public Bike(String name, double rentPerDay, int days) {
        super(name, rentPerDay);
        this.days = days;
    }

    public void showBike() {
        showVehicle();

        totalRent = rentPerDay * days;

        if (days >= 5) {
            double discount = totalRent * 0.10;
            totalRent = totalRent - discount;
            System.out.println("10% Discount Applied");
        }

        System.out.println("Days: " + days);
        System.out.println("Total Rent: " + totalRent);
    }
}