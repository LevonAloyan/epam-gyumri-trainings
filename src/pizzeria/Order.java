package pizzeria;

public class Order {

    private final int orderNumber;
    private final Customer customer;
    private final OrderItem[] orderItems;

    // todo implement constructors
    // implement method to add new order item
//    public Order(){
//        this.orderNumber = (int)(Math.random() * 10000);
//        this.customer =
//    }
    public Order(Customer customer,OrderItem[] orderItems) {
        this.orderNumber = orderNumberGenerator();
        this.customer = customer;
        this.orderItems = orderItems;
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

    public double orderPrice() {
        double orderPrice = 0.0;
        for (OrderItem orderItem : orderItems) {
            orderPrice += orderItem.calculatePrice();
        }
        return orderPrice;
    }

    private int orderNumberGenerator() {
        return (int)(Math.random() * 10000);
    }


}
