package pack9;

public abstract class MovieTicket {
    String movieName;
    String theaterName;
    int numTickets;
    double totalPrice;

    public MovieTicket(String movieName, String theaterName, int numTickets) {
        this.movieName = movieName;
        this.theaterName = theaterName;
        this.numTickets = numTickets;
    }

    public abstract void calculateTotalPrice();

    public void confirmBooking() {
        calculateTotalPrice();

        System.out.println("Movie: " + movieName);
        System.out.println("Theater: " + theaterName);
        System.out.println("Tickets: " + numTickets);

        if (numTickets > 0 && numTickets <= 15) {
            System.out.println("Total Price: ₹" + totalPrice);
        }
        System.out.println("---------------------------");
    }
}