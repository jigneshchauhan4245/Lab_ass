package pack5;

public class Vehicle {
    String vehicleName;
    double rentPerDay;

    public Vehicle(String vehicleName, double rentPerDay) {
        this.vehicleName = vehicleName;
        this.rentPerDay = rentPerDay;
    }

    public void showVehicle() {
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Rent per Day: " + rentPerDay);
    }
}