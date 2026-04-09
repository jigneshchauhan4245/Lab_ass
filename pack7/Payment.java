package pack7;

public abstract class Payment {
    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();
}