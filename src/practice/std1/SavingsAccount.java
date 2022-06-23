package practice.std1;

public class SavingsAccount extends Account {
    private double balance;
    private double interestRate;
    private String accId;

    public SavingsAccount(String accId, double interestRate, double balance) {
        super();
        this.balance = balance;
        this.interestRate = interestRate;
        this.accId = accId;
    }

    @Override
    public String getAccountID() {
        return accId;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double computeUpdatedBalance() {
        return balance + (interestRate * balance);
    }

}
