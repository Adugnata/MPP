package lesson4.partC;

final public class Paycheck {
    private final double grossPay;
    private final double fica;
    private final double state;
    private final double local;
    private final double medicare;
    private final double socialSecurity;

    public Paycheck(double grossPay, Tax fica, Tax state, Tax local, Tax medicare, Tax socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica.getValue();
        this.state = state.getValue();
        this.local = local.getValue();
        this.medicare = medicare.getValue();
        this.socialSecurity = socialSecurity.getValue();
    }

    public double getNetPay() {
        return grossPay
                - grossPay * fica
                - grossPay * state
                - grossPay * local
                - grossPay * medicare
                - grossPay * socialSecurity;
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Income statement: \n "
                + "\tGross Pay: " + grossPay + "\n"
                + "deduction: \n "
                + "\tFica: " + grossPay * fica + "\n"
                + "\tState: " + grossPay * state + "\n"
                + "\tLocal: " + grossPay * local + "\n"
                + "\tMedicare: " + grossPay * medicare + "\n"
                + "\tSocial Security: " + grossPay * socialSecurity + "\n"
                + ".............................................\n"
                + "\tNet Income: " + getNetPay() + "\n"
                + ".............................................\n";
    }
}
