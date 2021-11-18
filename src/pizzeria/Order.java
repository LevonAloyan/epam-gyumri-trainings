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


    public OrderItem[] getOrderItems() {
        return orderItems;
    }

    public static Order addNewOrder(Customer customer, OrderItem... orderItems) {
        return new Order(customer, orderItems);
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double calculateOrderPrice() {

        double orderPrice = 0.0d;

        for (OrderItem orderItem : orderItems) {
            orderPrice += orderItem.calculateOrderItemPrice();
        }
        return orderPrice;
    }
}