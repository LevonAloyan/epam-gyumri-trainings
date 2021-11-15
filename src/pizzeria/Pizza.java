package pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private Type type;
    private List<Ingredient> ingredients;
    private int quantity;
    private static final int MAX_ALLOWED_INGREDIENTS_SIZE = 7;

    public Pizza(String name, Type type, int quantity) {
        this.checkPizzaName(name);
        this.type = type;
        this.quantity = quantity;
    }

    public void checkPizzaName(String pizzaName) {
        if (pizzaName.length() < 4 || pizzaName.length() > 20) {
            this.name = "customer_" + Order.getCustomerId() + "_" + Order.getOrderId();
        } else {
            this.name = pizzaName;
        }
    }

    public void addIngredients(String ingredientName) {
        if (ingredients == null) {
            ingredients = new ArrayList<>();
        }
        if (ingredients.size() == MAX_ALLOWED_INGREDIENTS_SIZE) {
            System.out.println("You can't add any more ingredients");
            return;
        }
        for (Ingredient ingredient1 : ingredients) {
            if (ingredient1.getName().equals(ingredientName)) {
                throw new IllegalArgumentException("You have already added that ingredient");
            }
        }
        for (Ingredient ingredient : Ingredient.values()) {
            if (ingredient.getName().equals(ingredientName)) {
                ingredients.add(ingredient);
            }
        }
    }


    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.checkPizzaName(name);
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum Type {
        Regular("regular", 1.0F),
        Closed("Closed (Calzone)", 1.5F);

        Type(String name, float price) {
            this.name = name;
            this.price = price;
        }

        private final String name;
        private final float price;

        public String getName() {
            return name;
        }

        public float getPrice() {
            return price;
        }
    }


    public enum Ingredient {
        Tomato_paste("Tomato paste", 1.0F),
        Cheese("Cheese", 1.0F),
        Salami("Salami", 1.5F),
        Bacon("Bacon", 1.2F),
        Garlic("Garlic", 0.3F),
        Corn("Corn", 0.7F),
        Pepperoni("Pepperoni", 0.6F),
        Olives("Olives", 0.5F);

        Ingredient(String name, float price) {
            this.name = name;
            this.price = price;
        }

        private final String name;
        private final float price;

        public String getName() {
            return name;
        }

        public float getPrice() {
            return price;
        }
    }

}


