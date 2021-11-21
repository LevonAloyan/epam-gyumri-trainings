package pizzeria;

public class Pizza {

    private static final int MAX_ALLOWED_INGREDIENTS_SIZE = 7;

    private String name;
    private PizzaType pizzaType;
    private Ingredient[] ingredients;
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
        this.name = name;
        this.pizzaType = pizzaType;
        if (ingredients.length > MAX_ALLOWED_INGREDIENTS_SIZE) {
            System.out.println("Ingredients more then allowed " + MAX_ALLOWED_INGREDIENTS_SIZE);
            this.ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS_SIZE];
        } else {
            this.ingredients = ingredients;
        }
    }

    public double calculatePrice() {
        double price = 0;
        price = price + pizzaType.getPrice();

        for (Ingredient ingredient : ingredients) {
            price += ingredient.getPrice();
        }

        return price;
    }

    public Ingredient addIngredients(Ingredient ingredient) {
        if (ingredientsCount > MAX_ALLOWED_INGREDIENTS_SIZE) {
            System.out.println("No more ingredients allowed.");
        }
        ingredients[ingredientsCount++] = ingredient;

        return ingredients[ingredientsCount];
    }
    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public String getName() {
        return name;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }
}
