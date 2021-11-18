package pizzeria;

import java.util.Random;

public class Order {

    public static int orderNumber = generateOrderNumber();
    private Customer customer;
    private OrderItem[] orderItems;

    public Order(Customer customer, OrderItem[] orderItems){
        this.customer = customer;
        this.orderItems = orderItems;
    }

    public int getCustomerNumber() {
        return this.customer.getCustomerNumber();
    }

    public OrderItem[] getOrderItems() {
        return orderItems;
    }

    private static Integer generateOrderNumber(){
        Random random = new Random();
        return random.nextInt(10) * 10000 + random.nextInt(9000);
    }

    public static Order addOrder(Customer customer, OrderItem ... orderItems){
        for(OrderItem orderItem:orderItems){
            System.out.println("Customer number " + customer.getCustomerNumber() + " wants to order " +
                    orderItem.getCount() + " pieces " + orderItem.getPizza().getName());
        }
        return new Order(customer,orderItems);
    }

    public double calculateOrderPrice(OrderItem ... orderItems){
        double orderPrice = 0;
        for(OrderItem orderItem : orderItems){
            orderPrice += orderItem.calculateOrderItemPrice();
        }

        return orderPrice;
    }

}
