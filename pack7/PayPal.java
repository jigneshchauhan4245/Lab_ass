package pack7;

public class PayPal extends Order {
    double amount;

    public PayPal(int orderId, String productName, int quantity, double price) {
        super(orderId, productName, quantity, price);
        this.amount = quantity * price;
    }

    @Override
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total Amount: " + amount);
    }

    public void processPayment() {
        System.out.println("Payment done using PayPal");
    }
}