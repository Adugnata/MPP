package lesson4.partC;

import java.time.LocalDate;

abstract public class Employee {
    private String empId;

    public Employee(String empId) {
        this.empId = empId;
    }

    public void print() {
        System.out.println(calcCompensation(LocalDate.now().getMonthValue(), LocalDate.now().getYear()));
    }

    public Paycheck calcCompensation(int month, int year) {
        return new Paycheck(calcGrossPay(month, year), Tax.FICA, Tax.State,
                Tax.Local, Tax.Medicare, Tax.SocialSecurity);
    }

    abstract public double calcGrossPay(int month, int year);
}
