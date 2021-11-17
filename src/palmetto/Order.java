package palmetto;

public class Order extends Pizza {
    private int orderNumber = 10000;
    private Customer customer;
    private OrderItem[] orderItems;
    private int quantity;

    public Order (int orderNumber, Customer customer, OrderItem[] orderItems, int quantity){
        super();
        this.orderNumber = ++orderNumber;
        this.customer = customer;
        this.orderItems = orderItems;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity >= 10) {
            System.out.println("More than 10.");
        }
        this.quantity = quantity;
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
        return "[" + orderNumber + ":" + customer.getCustomerNumber() + ":" + pizzaName + ":" + quantity + "]";
    }
}
