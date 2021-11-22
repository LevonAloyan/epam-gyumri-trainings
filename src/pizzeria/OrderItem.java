package pizzeria;

import java.util.Arrays;

public class OrderItem {

    private Pizza pizza;
    private int pizzaCount;

    public OrderItem(Pizza pizza, int pizzaCount) {
        this.pizza = pizza;
        this.pizzaCount = countCheck(pizzaCount);
    }

    public static OrderItem addOrderItem(Pizza pizza, int pizzaCount) {
        return new OrderItem(pizza, pizzaCount);
    }

    public int countCheck(int pizzaCount) {
        this.pizzaCount = pizzaCount;
        if (pizzaCount <= 10  && pizzaCount > 1) {
            return pizzaCount;
        }
        System.out.println("The number of ordered pizzas shouldn't exceed 10");
        return 0;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public int getCount() {
        return pizzaCount;
    }

    public double calculateOrderItemPrice() {
        double itemPrice = 0.0d;
        for (int i = 0; i < pizzaCount; i++) {
            itemPrice += getPizza().calculatePrice();
        }
        return itemPrice;
    }
    public String toStringDescription() {

        return String.join("\n", "Pizza name: " + getPizza().getName(),
                "Quantity: " + getCount(), getPizza().getPizzaType().toString() + "\n",
                Arrays.toString(getPizza().getIngredients()).replace("[","").replace(",","").replace("]",""),
                "\n" + "Amount: " + calculateOrderItemPrice() + " $");
    }
}




