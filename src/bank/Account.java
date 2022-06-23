package bank;

public abstract class Account {
    private double current_amount;
    private String accountnr;

    public abstract void addInterest();

    public void deposit(double amount) {
        current_amount += amount;
    }

    public void withdraw(double amount) {
        current_amount -= amount;
    }

    public String getAccountnr() {
        return accountnr;
    }

    public void setAccountnr(String accountnr) {
        this.accountnr = accountnr;
    }

    public double getAmount() {
        return current_amount;
    }
}
