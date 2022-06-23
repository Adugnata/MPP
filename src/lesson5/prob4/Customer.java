package lesson5.prob4;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orderList;

    Customer(String name) {
        this.name = name;
        orderList = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orderList;
    }
}
