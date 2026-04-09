import pack10.*;

public class Q10 {
    public static void main(String[] args) {

        Shopping s = new Shopping();

        System.out.println("---- Case 1 ----");
        s.CalculateBill(100, 5);

        System.out.println("\n---- Case 2 ----");
        s.CalculateBill(100, 12);

        System.out.println("\n---- Case 3 ----");
        s.CalculateBill(200, 5, 15);

        System.out.println("\n---- Case 4 ----");
        s.CalculateBill(500.0);
    }
}