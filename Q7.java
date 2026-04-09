import pack7.*;

public class Q7 {
    public static void main(String[] args) {

        System.out.println("---- Credit Card Payment ----");
        Credit c = new Credit(1, "Laptop", 2, 50000);
        c.displayOrderDetails();
        c.processPayment();

        System.out.println("\n---- PayPal Payment ----");
        PayPal p = new PayPal(2, "Mobile", 1, 20000);
        p.displayOrderDetails();
        p.processPayment();

        System.out.println("\n---- UPI Payment ----");
        Upi u = new Upi(3, "Headphones", 3, 2000);
        u.displayOrderDetails();
        u.processPayment();
    }
}