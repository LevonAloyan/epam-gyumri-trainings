package pizzeria;

public class Order extends Pizza {
    private int orderNumber = 10000;
    private Customer customer;
    private OrderItem[] orderItems;

    public Order (int orderNumber, Customer customer, OrderItem[] orderItems){
        super();
        this.orderNumber = ++orderNumber;
        this.customer = customer;
        this.orderItems = orderItems;
    }

    public int getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    public OrderItem[] getOrderItems() {
        return orderItems;
    }
    public Customer getCustomer () {
        return customer;
    }

    @Override
    public String toString() {
        return "[" + orderNumber + ":" + customer.getCustomerNumber() + ":" + pizzaName + "]";
    }
}
