package pack3;

public class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(String name, double balance, double interestRate) {
        super(name, balance);
        this.interestRate = interestRate;
    }
    public void showDetails() {
        super.showDetails();

        if (balance >= 5000) {
            double interest = balance * interestRate / 100;
            System.out.println("Interest: " + interest);
        } else {
            System.out.println("No interest (Balance < 5000)");
        }
    }
}