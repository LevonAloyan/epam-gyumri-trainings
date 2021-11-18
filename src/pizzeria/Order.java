package pizzeria;

public class Order {

    private int orderNumber = 10000;
    private Customer customer;
    private OrderItem[] orderItems;


    public Order(Customer customer, OrderItem[] orderItems) {
        this.customer = customer;
        this.orderItems = orderItems;
        this.orderNumber++;
    }
    
    public OrderItem[] getOrderItems() {
        return orderItems;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double calculateOrderPrice() {

        double orderPrice = 0.0;

        for (OrderItem orderItem : orderItems) {
            orderPrice += orderItem.calculatePrice();
        }
        return orderPrice;
    }

    public static Order addNewOrder(Customer customer, OrderItem ...orderItems) {
        return new Order(customer, orderItems);
    }

}
