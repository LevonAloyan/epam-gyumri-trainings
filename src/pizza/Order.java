package pizza;

import java.util.Arrays;

public class Order {

    private final int MAX_ORDER_ITEM_COUNT = 10;
    private int orderNumber;
    private Customer customer;
    private OrderItem[] orderItems;
    private int orderItemCount = 0;


    public Order() {
        orderItems = new OrderItem[MAX_ORDER_ITEM_COUNT];
    }

    public Order (int orderNumber, Customer customer, OrderItem[] orderItems) {
        for (int i = 0; i < orderItems.length; i++) {
            OrderItem orderItem = orderItems[i];
            if (orderItem != null) {
                String pizzaName = checkOfName(orderItem.getPizza().getName());
                orderItem.getPizza().setName(pizzaName);
            }
        }
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.orderItems = orderItems;
    }

    public Order(Customer customer, OrderItem[] orderItems) {
    }

    public static Order addOrder(int orderNumber, Customer customer, OrderItem ... orderItems){
        return new Order(orderNumber, customer,orderItems);
    }

    private String checkOfName(String pizzaName) {
        String result;

        if(pizzaName.length() > 4 && pizzaName.length() < 20){
            result = pizzaName;
        } else {result = "customer_name_10000";
        }

        return result;
    }

    public Customer getCustomer () {
        return this.customer;
    }

    public OrderItem[] getOrderItems() {
        return this.orderItems;
    }

    public int getOrderNumber() {
        return this.orderNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "MAX_ORDER_ITEM_COUNT=" + MAX_ORDER_ITEM_COUNT +
                ", orderNumber=" + orderNumber +
                ", customer=" + customer +
                ", orderItems=" + Arrays.toString(orderItems) +
                ", orderItemCount=" + orderItemCount +
                '}';
    }

    public void addOrderItem(OrderItem orderItem) {
        if (orderItemCount >= MAX_ORDER_ITEM_COUNT) {
            System.out.println("You cannot add order item");
            return;
        }
        orderItems[orderItemCount++] = orderItem;
    }
}