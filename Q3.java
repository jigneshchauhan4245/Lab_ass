import pack3.*;

public class Q3 {
    public static void main(String[] args) {

        System.out.println("---- Savings Account ----");
        SavingsAccount s = new SavingsAccount("Rohan", 8000, 5);
        s.showDetails();

        System.out.println("\n---- Current Account ----");
        CurrentAccount c = new CurrentAccount("Rahul", 3000, 4000);
        c.showDetails();
    }
}