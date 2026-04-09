package pack10;

public class Shopping {

    public void CalculateBill(int price, int quantity) {
        double total = price * quantity;

        if (quantity > 10) {
            total = total * 0.9; // 10% discount
        }

        System.out.println("Total Bill (price, quantity): ₹" + total);
    }
    public void CalculateBill(int price, int quantity, double discount) {
        double total = price * quantity;
        total = total - (total * discount / 100);

        System.out.println("Total Bill (with discount): ₹" + total);
    }
    public void CalculateBill(double price) {
        System.out.println("Total Bill (single item): ₹" + price);
    }
}