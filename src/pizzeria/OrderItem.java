package pizzeria;

import java.util.Arrays;

public class OrderItem {
    private Pizza pizza;
    private int pizzaCount;

    public OrderItem(Pizza pizza, int pizzaCount) {
        this.pizza = pizza;
        this.pizzaCount = checkingCount(pizzaCount);
    }

    public static OrderItem addOrderItem(Pizza pizza, int pizzaCount) {
        return new OrderItem(pizza, pizzaCount);
    }

    public int checkingCount(int pizzaCount) {
        if (pizzaCount <= 10 && pizzaCount > 1) {
            return pizzaCount;
        } else {
            System.out.println("You can`t buy more than 10");
            return 0;
        }
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public void setPizzaCount(int pizzaCount) {
        this.pizzaCount = pizzaCount;
    }

    public int getCount() {

        return pizzaCount;
    }


}
