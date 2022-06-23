package lesson2.prob2B;

public class OrderLine {
    private Order order;
    private int lineNum;
    private double price;
    private int quantity;


    public OrderLine(Order order, int lineNum, double price, int quantity) {
        this.order = order;
        this.lineNum = lineNum;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return "    line num: " + lineNum + "    price: " + price + "    quantity: " + quantity;
    }
}
