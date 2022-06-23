package lesson2.prob2B;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1, 1, 10, 3);
        order.addOrderLine(2, 5, 3);
        Order order2 = new Order(2, 1, 20, 5);
        order2.addOrderLine(2, 7, 6);
        System.out.printf("%S \n %S", order, order2);
    }
}
