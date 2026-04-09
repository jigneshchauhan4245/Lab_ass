package pack5;

public class Car extends Vehicle {
    int days;
    double totalRent;

    public Car(String name, double rentPerDay, int days) {
        super(name, rentPerDay);
        this.days = days;
    }

    public void showCar() {
        showVehicle();

        totalRent = rentPerDay * days;

        if (days >= 7) {
            double discount = totalRent * 0.15;
            totalRent = totalRent - discount;
            System.out.println("15% Discount Applied");
        }

        System.out.println("Days: " + days);
        System.out.println("Total Rent: " + totalRent);
    }
}