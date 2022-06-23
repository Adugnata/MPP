package practice.std1;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Account> accounts = new ArrayList<Account>();

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account acct) {
        accounts.add(acct);
    }

    public double computeUpdatedBalanceSum() {
        double sum = 0;
        try {
            for (Account acct : accounts)
                sum += acct.computeUpdatedBalance();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        return sum;
    }
}
