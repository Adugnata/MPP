package lesson5.prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Order {
    private LocalDate orderDate;
    private List<Item> itemList;

    Order(LocalDate orderDate) {
        this.orderDate = orderDate;
        itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    @Override
    public String toString() {
        return orderDate + ": " + itemList.toString();
    }
}
