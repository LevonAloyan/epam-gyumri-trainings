package pizzeria;

public class Order {

    private int orderNumber;
    private Customer customer;
    private OrderItem[] orderItems;

    public int getOrderNumber() {
        return ++orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public OrderItem[] getOrderItems() {
        return orderItems;
    }

    // todo implement constructors
    // implement method to add new order item

}
