package pizzeria;

public class Order {

    private int orderNumber;
    private Customer customer;
    private OrderItem[] orderItems;
    private int orderItemCount;

    // todo implement constructors
    // implement method to add new order item
    public Order() {
        this.orderNumber = (int) (10000 + (Math.random() * 1000));
        this.customer = customer;
        this.orderItems = orderItems;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public OrderItem[] addOrderItems() {
        this.orderItems = new OrderItem[orderItemCount++];
        return this.orderItems;
    }

    public OrderItem[] getOrderItems() {
        return orderItems;
    }

}
