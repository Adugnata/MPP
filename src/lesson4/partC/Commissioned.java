package lesson4.partC;

import java.time.LocalDate;
import java.util.List;

public class Commissioned extends Employee {
    private double commission;
    private double baseSalary;
    private List<Order> orders;

    public Commissioned(String empId, double commission, double baseSalary, List<Order> orders) {
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orders = orders;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        LocalDate current = LocalDate.of(year, month, 1);
        int cm = current.getMonthValue();
        int cy = current.getYear();
        double sum = 0.0;
        for (Order order : orders) {
            LocalDate previous = order.getOrderDate();
            int pm = previous.getMonthValue();
            int py = previous.getYear();
            if ((cm - pm == 1 && cy == py) || (cm == 1 && pm == 12 && cy - py == 1))
                sum += order.getOrderAmount();
        }
        return baseSalary + sum * commission;
    }
}
