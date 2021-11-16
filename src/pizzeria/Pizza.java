package pizzeria;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pizza {
    Order order = new Order();
    private final List<String> pizzaName;
    private final List<String> pizzaType;
    private final Set<Ingredients> getFilledPizza = new HashSet<>();

    Pizza(List<String> pizzaName, List<String> pizzaType) {
        for (int i = 0; i < pizzaName.size(); i++) {
            if (pizzaName.get(i).length() < 4 || pizzaName.get(i).length() > 20) {
                pizzaName.set(i, "customer_name_" + order.getOrderNumber() + " ");
            }
        }
        this.pizzaName = pizzaName;
        this.pizzaType = pizzaType;
    }

    public List<String> getPizzaName() {
        return pizzaName;
    }

    public List<String> getPizzaType() {
        return pizzaType;
    }

    public Set<Ingredients> getFillPizza() {
        return getFilledPizza;
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
