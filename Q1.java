import pack1.*;

public class Q1 {
    public static void main(String[] args) {

        Website w = new Website("Amazon");
        Product p = new Product("Mobile", 100000);
        Order o = new Order(1);

        System.out.println("---- Website Info ----");
        w.show_web();

        System.out.println("\n---- Product Info ----");
        p.showpro();

        System.out.println("\n---- Order Info ----");
        o.show_order();
    }
}