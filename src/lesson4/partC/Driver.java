package lesson4.partC;

import java.time.LocalDate;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        Salaried salaried = new Salaried("001", 5000);
        salaried.calcCompensation(3, 2022).print();

        Hourly hourly = new Hourly("002", 200, 8);
        hourly.calcCompensation(3, 2022).print();

        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(1, LocalDate.of(2022, 03, 05), 1000));
        orders.add(new Order(2, LocalDate.of(2022, 03, 06), 1000));
        orders.add(new Order(3, LocalDate.of(2022, 03, 07), 1000));

        Commissioned commissioned = new Commissioned("003", 0.5, 3000, orders);
        commissioned.calcCompensation(04, 2022);
        commissioned.print();
    }
}
