package pack1;

public class Order {
    int orderId;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public void show_order() {
        System.out.println("Order ID: " + orderId);
    }
}