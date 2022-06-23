package association.onetomany;

import java.util.*;

public class ShoppingCart {
    private Customer owner;
    private List<Item> items = new ArrayList<>();


    //package level
    ShoppingCart(Customer cust) {
        owner = cust;
    }

    public void addItem(String itemName) {
        Item item = new Item(itemName, this);
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public Customer getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return items.toString();
    }

}
