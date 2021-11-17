package pizzeria;

public class Order {
    private final int orderNumber;
    private final Customer customer;
    private final OrderItem orderItems;

    public Order(int orderNumber, Customer customer, OrderItem orderItems) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.orderItems = orderItems;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Order addOrder (int orderNumber, Customer customer, OrderItem orderItem) {
        return new Order(orderNumber, customer, orderItem);
    }



    //todo implement constructors, method to add new order item

}
