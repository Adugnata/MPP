package lesson5.prob4;

import java.time.LocalDate;

public class CustOrderFactory {
    public static Customer createCustomer(String name) {
        if (name == null) throw new NullPointerException("Name can't be null");
        return new Customer(name);
    }

    public static Order addOrder(Customer customer, LocalDate orderDate) {
        if (customer == null) throw new NullPointerException("Customer can't be null");
        Order order = new Order(orderDate);
        customer.addOrder(order);
        return order;

    }

    public static Item addItem(String name) {
        return new Item(name);
    }

}
