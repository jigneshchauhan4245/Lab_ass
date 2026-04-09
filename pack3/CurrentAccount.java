package pack3;

public class CurrentAccount extends Account {
    double withdrawalAmount;

    public CurrentAccount(String name, double balance, double withdrawalAmount) {
        super(name, balance);
        this.withdrawalAmount = withdrawalAmount;
    }

    @Override
    public void showDetails() {
        super.showDetails();

        if (balance >= withdrawalAmount) {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal Successful: " + withdrawalAmount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}