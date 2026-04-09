package pack9;

public class RegularTicket extends MovieTicket {

    public RegularTicket(String movieName, String theaterName, int numTickets) {
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

        totalPrice = numTickets * 250;

        if (numTickets > 10) {
            totalPrice *= 0.8; // 20% discount
        } else if (numTickets > 5) {
            totalPrice *= 0.9; // 10% discount
        }
    }
}