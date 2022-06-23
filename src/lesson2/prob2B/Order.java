package lesson2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<OrderLine> orderLineList;
    int orderNum;

    public Order(int orderNum, int lineNum, double price, int quantity) {
        this.orderNum = orderNum;
        orderLineList = new ArrayList<>();
        addOrderLine(lineNum, price, quantity);

    }

    public void addOrderLine(int lineNum, double price, int quantity) {
        orderLineList.add(new OrderLine(this, lineNum, price, quantity));
    }

    @Override
    public String toString() {
        String report = "Order " + orderNum + ":\n";
        for (OrderLine o : orderLineList) {
            report += o.toString() + "\n";

        }
        return report;
    }
}
