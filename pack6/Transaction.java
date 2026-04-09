package pack6;

public class Transaction extends Account {
    double withdrawAmount;

    public Transaction(int accNo, double balance, double withdrawAmount) {
        super(accNo, balance);
        this.withdrawAmount = withdrawAmount;
    }

    public void withdraw() {
        showAccount();

        if (withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
            System.out.println("Withdrawal Successful: " + withdrawAmount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}