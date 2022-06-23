package lesson4.partC;

public class Hourly extends Employee {
    private static final int WEEKS_PER_MONTH = 4;
    private final double hourlyWage;
    private final int hoursPerWeek;

    public Hourly(String empId, double hourlyWage, int hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return (hoursPerWeek * WEEKS_PER_MONTH) * hourlyWage;
    }
}
