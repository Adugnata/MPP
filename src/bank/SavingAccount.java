package bank;

public class SavingAccount extends Account {
    private double interest_rate = 0.01;

    @Override
    public void addInterest() {
        deposit(getAmount() * interest_rate);
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "interest_rate=" + interest_rate +
                '}';
    }
}
