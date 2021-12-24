package pizzeria.order;

import pizzeria.pizza.Pizza;

import java.util.Random;

public class Order {
    private int orderNumber;
    private int customerNumber;
    private OrderItem[] orderItems;

    public Order(OrderItem[] orderItems){
        this.orderNumber = getOrderNumber();
        this.customerNumber = getCustomerNumber();
        this.orderItems = getOrderItems();
    }

    public Order (int orderNumber, int customerNumber, OrderItem[] orderItems){
        this.orderNumber = orderNumber;
        this.customerNumber = customerNumber;
        this.orderItems = orderItems;
    }

    public int getOrderNumber() {
        Random num = new Random();
        int l = 1000;
        int h = 10000;
        orderNumber = num.nextInt(h - l) + l;
        return orderNumber;
    }
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    public OrderItem[] getOrderItems() {
        return orderItems;
    }
    public int getCustomerNumber () {
        Random num = new Random();
        int l = 10000;
        int h = 100000;
        orderNumber = num.nextInt(h - l) + l;
        return this.customerNumber;
    }
    public void displayAttributes(Pizza pizza, OrderItem orderItem){
        System.out.println("[" + orderNumber + ":" + customerNumber + ":" + pizza.pizzaName + ":"
                + orderItem.getQuantity() + "]");
    }

}
