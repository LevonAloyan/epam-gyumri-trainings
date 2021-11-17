package pizzeria;

import java.time.LocalTime;

public class OrderItem {

    private final int orderQuantity;
    private final LocalTime time = LocalTime.now();

    public LocalTime getTime() {
        return time;
    }

    public OrderItem(int orderQuantity) {
        if (orderQuantity > 10) {
            System.err.println("You can't order more than 10 pizzas");
            orderQuantity = 10;
        }
        this.orderQuantity = orderQuantity;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }
}