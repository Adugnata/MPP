package bank;

public class CheckingAccount extends Account {
    private final double interest_rate = 0.0425;

    @Override
    public void addInterest() {
        deposit(getAmount() * interest_rate / 2);
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "interest_rate=" + interest_rate +
                '}';
    }
}
