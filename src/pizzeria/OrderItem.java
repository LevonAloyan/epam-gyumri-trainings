package pizzeria;

import java.time.LocalDateTime;

public class OrderItem {
    private Pizza pizza;
    private Integer count;
    private final int MAX_PIZZA_COUNT = 10;
    private LocalDateTime time;

    public OrderItem(Pizza pizza, int pizzaCount){
        this.pizza = pizza;
        this.count = getOrderedPizzaCount(pizzaCount);
    }

    public Pizza getPizza(){
        return this.pizza;
    }

    public void setTime(){
        this.time = LocalDateTime.now();
    }

    public LocalDateTime getTime(){
        return this.time;
    }

    private int getOrderedPizzaCount(int pizzaCount){
        if(pizzaCount > MAX_PIZZA_COUNT){
            System.out.println("Your ordered pizza count is more than allowed count");
            return 0;
        }
        return pizzaCount;
    }

    public int getCount(){
        return this.count;
    }
    public double calculateOrderItemPrice(){
        return pizza.calculatePrice();
    }

    public static OrderItem addOrderItem(Pizza pizza, int count){
        return new OrderItem(pizza, count);
    }

}
