import pack5.*;

public class Q5 {
    public static void main(String[] args) {

        System.out.println("---- Car Rental ----");
        Car c = new Car("Swift", 2000, 8);
        c.showCar();

        System.out.println("\n---- Bike Rental ----");
        Bike b = new Bike("Activa", 500, 6);
        b.showBike();
    }
}