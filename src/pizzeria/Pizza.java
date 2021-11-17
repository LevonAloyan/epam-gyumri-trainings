package pizzeria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Pizza {

    private String name;
    private PizzaType type;
    private int quantity;
    private int price = 1;
    private List<Ingredient> ingredients = new ArrayList<>();

    public Pizza(String margarita, int quantity, PizzaType closed, List<Ingredient> ingredients) {
        this.name = margarita;
        this.type = closed;
        this.quantity = quantity;
        this.ingredients = ingredients;
    }

    public void setOrderType(PizzaType pizzaType) {
        this.type = pizzaType;
    }

    public enum Ingredient {
        TOMATO_PASTE("Tomato paste", 1),
        CHEESE("Cheese", 1),
        SALAMI("Salami", 1.5),
        BACON("Bacon", 1.2),
        GARLIC("Garlic", 0.3),
        CORN("Corn", 0.7),
        PEPPERONI("Pepperoni", 0.6),
        OLIVES("Olives", 0.5);

        private final String ingredientName;
        private final double price;

        Ingredient(String ingredientName, double price) {
            this.ingredientName = ingredientName;
            this.price = price;
        }

        public String getIngredientName() {
            return ingredientName;
        }

        public double getPrice() {
            return price;
        }
    }

    public enum PizzaType {

        REGULAR, CLOSED
    }
}