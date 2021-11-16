package pizzeria;

import java.time.LocalTime;
import java.util.*;

public class Order {
    private final int orderNumber;
    private final int customerNumber;
    private final List<Integer> quantityOfOrder;
    private final LocalTime time = LocalTime.now();

    Order(int customerNumber, List<Integer> quantityOfOrder) {
        Random order = new Random(System.currentTimeMillis());
        this.orderNumber = order.nextInt(1000) + 10000;
        this.customerNumber = customerNumber;
        this.quantityOfOrder = quantityOfOrder;
        for (int i = 0; i < this.quantityOfOrder.size(); i++) {
            if (this.quantityOfOrder.get(i) > 10) {
                System.err.println("You can't order more than 10 pizzas at one time");
                this.quantityOfOrder.set(i, 10);
            }
        }
    }

    Order() {
        Random order = new Random(System.currentTimeMillis());
        this.orderNumber = order.nextInt(1000) + 10000;
        this.customerNumber = getCustomerNumber();
        this.quantityOfOrder = getQuantityOfOrder();
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public LocalTime getTime() {
        return time;
    }

    public List<Integer> getQuantityOfOrder() {
        return this.quantityOfOrder;
    }

    public String toString(List <String> name, List<String> type) {
        int i = 0;
        Pizza pizza = new Pizza(name, type);
        return "[" + orderNumber + ": " + customerNumber + ": " + pizza.getPizzaName().get(i) + ": "
                + quantityOfOrder.get(i) + "]";
    }


}

