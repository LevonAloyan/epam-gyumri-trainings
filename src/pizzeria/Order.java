package pizzeria;

import java.util.Random;

public class Order {

    private int orderNumber;
    private Customer customer;
    private OrderItem [] orderItems;
    private Pizza pizza;

    // todo implement constructors
    // todo implement method to add new order item

    public Order (OrderItem [] orderItems, Customer customer){
        this.orderItems = orderItems ;
        this.customer=customer;
        Random order = new Random();
        this.orderNumber=order.nextInt(100000);
    }

    public OrderItem[] getOrderItems() {
        return orderItems;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void orderAttributes (){
        System.out.println("Order: "+ orderNumber + ", Customer: " + customer.getCustomerNumber() +
                ", Pizza name: " + pizza.getPizzaName() + "Quantity: ....." );
    }

}
