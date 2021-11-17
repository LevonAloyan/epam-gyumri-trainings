package homework.pizzeriaPalmetto.model;

import java.util.List;

public class Pizza {

    private String name;

    private List<Ingredients> ingredients;

    private PizzaType pizzaType;

    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Pizza(String name, List<Ingredients> ingredients, PizzaType pizzaType) {
        this.name = name;
        this.ingredients = ingredients;
        this.pizzaType = pizzaType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                ", pizzaType=" + pizzaType +
                '}';
    }
}

