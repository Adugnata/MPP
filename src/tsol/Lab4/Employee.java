package tsol.Lab4;

import java.util.*;

public class Employee {
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account acct) {
        if (acct == null) throw new IllegalArgumentException("Cannot create null account");
        accounts.add(acct);
    }

    public double computeUpdatedBalanceSum() {
        double sum = 0.0;
        for (Account a : accounts) {
            sum += a.computeUpdatedBalance();
        }
        return sum;
    }
}


