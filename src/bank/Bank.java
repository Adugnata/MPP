package bank;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    Map<String, Account> accountMap = new HashMap<>();

    public Map<String, Account> getAccountMap() {
        return accountMap;
    }

    public void addAccount(String accountType, String accountnr) {
        Account account;
        if (accountType.equals("checking"))
            account = new CheckingAccount();
        else account = new SavingAccount();
        account.setAccountnr(accountnr);
        accountMap.put(accountnr, account);
    }

    public void delAccount(String accountnr) {
        accountMap.remove(accountnr);
    }

    public void addInterest() {
        for (Account account : accountMap.values())
            account.addInterest();
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountMap=" + accountMap +
                '}';
    }
}
