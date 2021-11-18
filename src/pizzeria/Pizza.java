package pizzeria;

public class Pizza {
    private static final int MAX_ALLOWED_INGREDIENTS_SIZE = 7;

    private String name;
    private PizzaType pizzaType;
    private Ingredients[] ingredients;
    private double price;
    private int ingredientsCount;
    private Object Ingredients;

    public Pizza(String name) {
        this.name = name;
        this.ingredients = new Ingredients[MAX_ALLOWED_INGREDIENTS_SIZE];
        this.pizzaType = PizzaType.getRegularType();
    }

    public Pizza(String name, PizzaType pizzaType) {
        this.name = name;
        this.ingredients = new Ingredients[MAX_ALLOWED_INGREDIENTS_SIZE];
        this.pizzaType = pizzaType;
    }

    public Pizza(String name, PizzaType pizzaType, Ingredients[] ingredients) {
        this.name = name;
        this.pizzaType = pizzaType;
        if (ingredients.length > MAX_ALLOWED_INGREDIENTS_SIZE) {
            System.out.println("Ingredients more than allowed 7." + MAX_ALLOWED_INGREDIENTS_SIZE);
            this.ingredients = new Ingredients[MAX_ALLOWED_INGREDIENTS_SIZE];
        } else {

            this.ingredients = ingredients;
        }

    }

    public double calculatePrice() {
        double price = 0;
        price = price + pizzaType.getPrice();
        for (Ingredients ingredient : ingredients) {
            price += ingredient.getPrice();
        }

        return price;
    }

    public void addIngredients(Ingredients ingredient) {
        if (ingredientsCount > MAX_ALLOWED_INGREDIENTS_SIZE) {
            System.out.println("No more ingredients allowed.");
        }
        ingredients[ingredientsCount++] = ingredient;

    }

    public static Pizza addPizza(String name, PizzaType pizzaType, Ingredients... ingredients) {
        return new Pizza(name, pizzaType, ingredients);
    }

    public String getName() {
        return name;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public pizzeria.Ingredients[] getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }

    public int getIngredientsCount() {
        return ingredientsCount;
    }
}

