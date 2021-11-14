package pizzeria;

import java.time.LocalTime;
import java.util.*;

public class Order {
    private final int orderNumber;
    private final int customerNumber;
    private final List<String> pizzaName;
    private final String pizzaType;
    private final List<Integer> quantityOfOrder;
    private final LocalTime time = LocalTime.now();
    private final Set<Ingredients> getFilledPizza = new HashSet<>();

    Order(int customerNumber, List<String> pizzaName, List<Integer> quantityOfOrder, String pizzaType) {
        Random order = new Random();
        this.orderNumber = order.nextInt(100000);
        this.customerNumber = customerNumber;
        this.pizzaName = pizzaName;
        this.quantityOfOrder = quantityOfOrder;
        this.pizzaType = pizzaType;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Set<Ingredients> getFillPizza() {
        return getFilledPizza;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public List<String> getPizzaName() {
        int i = 0;
        if (pizzaName.get(i).length() < 4 || pizzaName.get(i).length() > 20) {
            pizzaName.set(i, "customer_name_" + getOrderNumber()+ " ");
        }
        return pizzaName;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public List<Integer> getQuantityOfOrder() {
        for (int i = 0; i < quantityOfOrder.size(); i++) {
            if (quantityOfOrder.get(i) > 10) {
                System.err.println("You can't order more than 10 pizzas at one time. Check your order");
                quantityOfOrder.set(i,10);
            }
        }
        return quantityOfOrder;
    }

    public String toString() {
        return "[" + orderNumber + ": " + customerNumber + ": " + pizzaName + ": "
                + quantityOfOrder + "]";
    }

    public void addIngredient(List<Ingredients> ingredient) {
        Ingredients[] ingredientsToAdd = Ingredients.values();
        int i = 0;
        for (int j = 0; j < ingredientsToAdd.length; j++) {
            if (i == ingredient.size()) {
                return;
            }
            if (getFillPizza().contains(ingredient.get(i))) {
                System.err.println("Check order. You've already added that ingredient");
                break;
            } else if (ingredient.get(i).equals(ingredientsToAdd[j])) {
                getFilledPizza.add(ingredient.get(i++));
                j = 0;
            }
        }
    }
}

