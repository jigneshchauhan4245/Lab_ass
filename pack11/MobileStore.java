package pack11;

public class MobileStore {
    static String storeName = "Rohan Mobile Store";
    public static void CalculatePrice(int price) {
        System.out.println("Store: " + storeName);
        System.out.println("Price: ₹" + price);
    }
    public static void CalculatePrice(int price, int quantity) {
        double total = price * quantity;

        if (quantity > 10) {
            total = total * 0.9;
        }

        System.out.println("Store: " + storeName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: ₹" + total);
    }
}