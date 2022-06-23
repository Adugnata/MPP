package lesson5.prob4.driver;


import lesson5.prob4.CustOrderFactory;
import lesson5.prob4.Customer;
import lesson5.prob4.Order;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = CustOrderFactory.createCustomer("Alberto");
        Order order = CustOrderFactory.addOrder(customer, LocalDate.now());
        order.addItem(CustOrderFactory.addItem("Bicycle"));
        order.addItem(CustOrderFactory.addItem("Running Shoes"));

        order = CustOrderFactory.addOrder(customer, LocalDate.now());
        order.addItem(CustOrderFactory.addItem("Watch"));
        order.addItem(CustOrderFactory.addItem("Water"));

        System.out.println(customer.getOrders());
    }
}

		
