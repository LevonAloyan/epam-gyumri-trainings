package pizzeria;

public class Pizza {

    private static final int MAX_ALLOWED_INGREDIENTS_SIZE = 7;

    private String name;
    private PizzaType pizzaType;
    private Ingredient1 [] ingredients1;
    private int ingredientsCount;

    public Pizza(String name) {
        this.name = name;
        this.ingredients1 = new Ingredient1[MAX_ALLOWED_INGREDIENTS_SIZE];
        this.pizzaType = PizzaType.REGULAR;
    }

    public Pizza(String name, PizzaType pizzaType) {
        this.name = name;
        this.ingredients1 = new Ingredient1[MAX_ALLOWED_INGREDIENTS_SIZE];
        this.pizzaType = pizzaType;
    }

    public Pizza(String name, PizzaType pizzaType, Ingredient1[] ingredients1) {
        this.name = name;
        this.pizzaType = pizzaType;
        if (ingredients1.length > MAX_ALLOWED_INGREDIENTS_SIZE) {
            System.out.println("Ingredients more then allowed " + MAX_ALLOWED_INGREDIENTS_SIZE);
            this.ingredients1 = new Ingredient1[MAX_ALLOWED_INGREDIENTS_SIZE];
        } else {
            this.ingredients1 = ingredients1;
        }
    }

    public double calculatePrice() {
        double price = 0;
        price = price + this.pizzaType.getPrice();


        for (Ingredient1 ingredients1 : ingredients1) {
            price += ingredients1.getPrice();
        }

        return price;
    }

    public void addIngredients(Ingredient1 ingredients1) {
        if (ingredientsCount > MAX_ALLOWED_INGREDIENTS_SIZE) {
            System.out.println("No more ingredients allowed.");
            return;
        }
        this.ingredients1[ingredientsCount++] = ingredients1;
    }

    public String getName() {
        return name;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public Ingredient1[] getIngredients() {
        return ingredients1;
    }

}
