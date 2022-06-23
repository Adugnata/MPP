package bank;

public class Driver {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccount("checking", "1001");
        bank.addAccount("saving", "1002");
        bank.addInterest();
        System.out.println(bank.getAccountMap());
        for (Account a : bank.getAccountMap().values()
        ) {
            if (a.getAccountnr().equals("1002"))
                a.deposit(1000);
        }
        for (Account a : bank.getAccountMap().values()
        ) {
            System.out.println(a.getClass().getSimpleName() + " " + a.getAccountnr() + " " + a.getAmount());
        }
    }
}
