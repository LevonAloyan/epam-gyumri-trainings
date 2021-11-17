package pizzeria;

public class Pizza {
    private static final int MAX_ALLOWED_INGREDIENTS_SIZE = 7;

    private final String name;
    private final PizzaType pizzaType;
    private final Ingredient[] ingredients;
    private double price;
    private int ingredientsCount;

    public Pizza(String name) {
        this.name = name;
        this.ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS_SIZE];
        this.pizzaType = PizzaType.getRegularType();
    }

    public Pizza(String name, PizzaType pizzaType) {
        this.name = name;
        this.ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS_SIZE];
        this.pizzaType = pizzaType;
    }

    public Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients) {
        if (name.length() < 4 || name.length() > 20) {
            name = "Customer_name_";
        }
        this.name = name;
        this.pizzaType = pizzaType;
        if (ingredients.length > MAX_ALLOWED_INGREDIENTS_SIZE) {
            System.out.println("Ingredient are more than allowed");
            this.ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS_SIZE];
        } else {
            this.ingredients = ingredients;
        }
    }

    public double calculatePrice () {
        double price = 0;
        price = price + pizzaType.getPrice();
        for (Ingredient ingredient : ingredients) {
            price += ingredient.getPrice();
        }
        return price;
    }

    public void addIngredients (Ingredient ingredients) {
        if (ingredientsCount > MAX_ALLOWED_INGREDIENTS_SIZE) {
            System.out.println("No more ingredients allowed");
            return;
        }
        this.ingredients[ingredientsCount++] = ingredients;
    }

    public String getName() {
        return name;
    }
}
