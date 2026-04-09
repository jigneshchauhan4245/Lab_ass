import pack9.*;

public class Q9 {
    public static void main(String[] args) {

        System.out.println("---- Regular Ticket ----");
        MovieTicket r = new RegularTicket("Avengers", "PVR", 6);
        r.confirmBooking();

        System.out.println("---- Premium Ticket ----");
        MovieTicket p = new PremiumTicket("Avengers", "INOX", 11);
        p.confirmBooking();

        System.out.println("---- VIP Ticket ----");
        MovieTicket v = new VipTicket("Avengers", "Cinepolis", 9);
        v.confirmBooking();
    }
}