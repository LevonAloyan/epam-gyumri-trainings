package pizzeria;

import java.time.LocalTime;
import java.util.*;

public class Order {
    private final int orderNumber;
    private final int customerNumber;
    private String pizzaName;
    private String ingredients;
    private final String pizzaType;
    private int quantityOfOrder;
    private final LocalTime time = LocalTime.now();

    Order(int customerNumber, String pizzaName, int quantityOfOrder, String pizzaType) {
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

    public int getCustomerNumber() {
        return customerNumber;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public String getIngredients() {
        return ingredients;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public String setPizzaName(String pizzaName) {
        if (pizzaName.length() < 4 || pizzaName.length() > 10) {
            pizzaName = "customer_name_" + orderNumber;
            this.pizzaName = pizzaName;
            return pizzaName;
        } else {
            Menu[] menus = Menu.values();
            for (Menu value : menus) {
                if (pizzaName.equals(value.name())) {
                    return this.pizzaName = pizzaName;
                }
            }
        }
        return "No such pizza";
    }

    public int setQuantityOfOrder(int number) {
        this.quantityOfOrder = number;
        if (number > 10) {
            System.err.println("You can't order more than 10 pizzas in one order.");
            return 10;
        } else
            return number;
    }

    public int getQuantityOfOrder() {
        return setQuantityOfOrder(quantityOfOrder);
    }

    public String toString() {
        return "[" + orderNumber + ": " + customerNumber + ": " + setPizzaName(pizzaName) + ": "
                + getQuantityOfOrder() + "]";
    }

    public void addIngredient(List<String> ingredient) {

        Ingredients[] ingredientsToAdd = Ingredients.values();
        Set<String> fillPizza = new HashSet<>();

        int i = 0;
        for (int j = 0; j < ingredientsToAdd.length; j++) {
            if (i == ingredient.size()) {
                return;
            }
            if (ingredient.get(i).equals(ingredientsToAdd[j].name())) {
                fillPizza.add(ingredient.get(i));
                System.out.println(ingredient.get(i) + " is added");
                this.ingredients = ingredient.get(i++);
                j = 0;
            }
        }
    }
}

