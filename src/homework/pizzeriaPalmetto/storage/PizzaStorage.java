package homework.pizzeriaPalmetto.storage;

import homework.pizzeriaPalmetto.model.Ingredients;
import homework.pizzeriaPalmetto.model.Pizza;
import homework.pizzeriaPalmetto.model.PizzaType;

import java.util.ArrayList;
import java.util.List;

public class PizzaStorage {

    private List<Pizza> pizzaList = new ArrayList<>();

    public void addPizza(Pizza pizza) {
        if (pizza.getName().length() < 4) {
            pizza.setName("customer_name_");
        }
        if (pizza.getQuantity() < 10) {
            pizzaList.add(pizza);
        }
    }

    public Pizza getByName(String name) {
        for (Pizza pizza : pizzaList) {
            if (pizza.getName().equalsIgnoreCase(name)) {
                return pizza;
            }
        }
        return null;
    }

    public void addIngredients(String name, Ingredients ingredients) {
        Pizza pizza = getByName(name);
        if (pizza.getIngredients().size() >= 7) {
            System.out.println("Pizza is full");
        } else {
            if (pizza.getIngredients().contains(ingredients)) {
                System.out.println("Please check oder again ");
            }
            pizza.getIngredients().add(ingredients);
        }
    }

    public Pizza addMargarita() {
        List<Ingredients> ingredientsForMargarita = new ArrayList<>();
        ingredientsForMargarita.add(0, Ingredients.TOMATO_PASTE);
        ingredientsForMargarita.add(1, Ingredients.PEPPERONI);
        ingredientsForMargarita.add(2, Ingredients.GARLIC);
        ingredientsForMargarita.add(3, Ingredients.BACON);
        pizzaList.add(0, new Pizza("Margarita", ingredientsForMargarita, PizzaType.CLOSED));
        Pizza margarita = getByName("Margarita");
        return margarita;
    }


}