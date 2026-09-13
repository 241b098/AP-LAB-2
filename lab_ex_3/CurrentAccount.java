public class CurrentAccount extends BankAccount {

    private double overdraftLimit = 200.0;

    public CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void withdraw(double amt) {
        double newBalance = balance - amt;

        if (newBalance < -overdraftLimit) {
            System.out.println("Error: Overdraft limit exceeded.");
            return;
        }

        balance = newBalance;
    }
}
