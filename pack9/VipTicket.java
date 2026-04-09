package pack9;

public class VipTicket extends MovieTicket {

    public VipTicket(String movieName, String theaterName, int numTickets) {
        super(movieName, theaterName, numTickets);
    }
    public void calculateTotalPrice() {

        if (numTickets <= 0) {
            System.out.println("Invalid number of tickets");
            return;
        }

        if (numTickets > 15) {
            System.out.println("Booking limit exceeded");
            return;
        }

        totalPrice = numTickets * 450;

        if (numTickets > 10) {
            totalPrice *= 0.8;
        } else if (numTickets > 5) {
            totalPrice *= 0.9;
        }

        // Extra VIP discount
        if (numTickets > 8) {
            totalPrice -= 100;
        }
    }
}