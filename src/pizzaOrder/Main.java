package pizzaOrder;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza("Margarita", Pizza.Type.Regular, 2);
        pizza.addIngredients("Cheese");
        pizza.addIngredients("Bacon");
        pizza.addIngredients("Tomato paste");
        pizza.addIngredients("Olives");
        Pizza pizza1 = new Pizza("PepperoniOro", Pizza.Type.Closed, 4);
        pizza1.addIngredients("Pepperoni");
        pizza1.addIngredients("Olives");
        pizza1.addIngredients("Cheese");
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(pizza);
        pizzas.add(pizza1);
        Order order = new Order(pizzas);
        order.displayingPizzaAttributes(pizza);
        order.displayingPizzaAttributes(pizza1);
        System.out.println();
        order.printCheck();

    }
}


