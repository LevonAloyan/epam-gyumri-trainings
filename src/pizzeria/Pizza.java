package pizzeria;

public class Pizza {

    private static final int MAX_ALLOWED_INGREDIENTS_SIZE = 7;

    private String name;
    private PizzaType pizzaType;
    private Ingredient[] ingredients;
    private int ingredientsCount;
    private int indexNumberPizza = 0;

    public Pizza(String name) {
        this.name = name;
        this.ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS_SIZE];
        this.pizzaType = PizzaType.REGULAR;
        this.indexNumberPizza++;
    }

    public Pizza(String name, PizzaType pizzaType) {
        this.name = name;
        this.ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS_SIZE];
        this.pizzaType = pizzaType;
        this.indexNumberPizza++;
    }

    public Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.indexNumberPizza++;
        if (ingredients.length > MAX_ALLOWED_INGREDIENTS_SIZE) {
            System.out.println("Ingredients more then allowed " + MAX_ALLOWED_INGREDIENTS_SIZE);
            this.ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS_SIZE];
        } else {
            this.ingredients = ingredients;
        }
    }

    public int getIndexNumberPizza() {
        return this.indexNumberPizza;
    }

    public String getName(){
        return this.name;
    }

    public Ingredient[] getIngredients(){
        return this.ingredients;
    }

    public PizzaType getPizzaType(){
        return this.pizzaType;
    }

    public double calculatePrice() {
        double price = 0;
        price = price + this.pizzaType.getPrice();

        for (Ingredient ingredient : ingredients) {
            price += ingredient.getPrice();
        }

        return price;
    }

    public void addIngredients(Ingredient ingredient) {
        if (ingredientsCount > MAX_ALLOWED_INGREDIENTS_SIZE) {
            System.out.println("No more ingredients allowed.");
            return;
        }
        ingredients[ingredientsCount++] = ingredient;
    }

    public static Pizza makePizza(String name, PizzaType type, Ingredient... ingredients){
        return new Pizza(name, type, ingredients);
    }

}
