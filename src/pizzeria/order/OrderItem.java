package pizzeria.order;

import pizzeria.pizza.Pizza;

public class OrderItem {
    private Pizza pizza;
    private int quantity;

    public OrderItem(Pizza pizza, int quantity){
        this.pizza = pizza;
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public static OrderItem addItem(Pizza pizza, int quantity){
        if(quantity >= 10) {
            System.out.println("Quantity more than 10.");
            throw new IllegalArgumentException();
        }
        return new OrderItem(pizza, quantity);
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

}
