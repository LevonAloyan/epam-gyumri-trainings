package pizzeria;

public class Order {

    private int orderNumber = 10000;
    private Customer customer;
    private OrderItem[] orderItems;

    // todo implement constructors
    // implement method to add new order item
    public Order(Customer customer, OrderItem[] orderItems) {
        this.customer = customer;
        this.orderItems = orderItems;
        this.orderNumber++;
    }

    public int getOrderNumber() {

        return orderNumber;
    }

    public Customer getCustomer() {

        return customer;
    }

    public OrderItem[] getOrderItems() {
        return orderItems;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setOrderItems(OrderItem[] orderItems) {
        this.orderItems = orderItems;
    }
}
