package pizzeria;

public class Order {

    private int orderNumber;
    private Customer customer;
    private OrderItem[] orderItems;

    // todo implement constructors
    // implement method to add new order item
    public Order(orderNumber, Customer customer, OrderItem[] orderItems) {
        this.customer = customer;
        this.orderItems = orderItems;
        this.orderNumber = customer.getRandomId;
    }

    public OrderItem[] getOrderItems() {
        return orderItems;
    }

    public static Order addOrder(Customer customer, OrderItem... orderItems) {
        return new Order(customer, orderItems);
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }
}
