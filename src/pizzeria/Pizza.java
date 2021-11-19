package pizzeria;

public class Pizza {

    private static final int MAX_ALLOWED_INGREDIENTS_SIZE = 10;

    private String name;
    private PizzaType pizzaType;
    private Ingredients[] ingredient;
    private double price;
    private int ingredientsCount;

    public Pizza(String name) {
        this.name = name;
        this.ingredient = new Ingredients[MAX_ALLOWED_INGREDIENTS_SIZE];
        this.pizzaType = PizzaType.getRegularType();
    }

    public Pizza(String name, PizzaType pizzaType) {
        this.name = name;
        this.ingredient = new Ingredients[MAX_ALLOWED_INGREDIENTS_SIZE];
        this.pizzaType = pizzaType;
    }

    public Pizza(String name, PizzaType pizzaType, Ingredients[] ingredients) {
        this.name = name;
        this.pizzaType = pizzaType;
        if (ingredients.length > MAX_ALLOWED_INGREDIENTS_SIZE) {
            System.out.println("Ingredients more then allowed " + MAX_ALLOWED_INGREDIENTS_SIZE);
            this.ingredient = new Ingredients[MAX_ALLOWED_INGREDIENTS_SIZE];
        } else {
            this.ingredient = ingredients;
        }
    }

    public double calculatePrice() {
        double price = 0;
        price = price + pizzaType.getPrice();

        for (Ingredients ingredients : ingredient) {
            price += ingredients.getPrice();

        }

        return price;
    }

    public void addIngredients(Ingredients ingredients) {
        if (ingredientsCount > MAX_ALLOWED_INGREDIENTS_SIZE) {
            System.out.println("No more ingredient allowed.");
            return;
        }
        ingredient[ingredientsCount++] = ingredients;
    }
    public String toIngredientString(){
        String result = "";
        Ingredients[] ingredient = getIngredient();
        for (Ingredients ingredients : ingredient){
            result += ingredients.toPriceString() + " ";
        }
        return result;
    }

    public static Pizza addPizza(String name, PizzaType regularType, Ingredients... ingredient) {
        return new Pizza(name, regularType, ingredient);
    }

    public String getName() {

        return name;
    }

    public PizzaType getPizzaType() {

        return pizzaType;
    }

    public Ingredients[] getIngredient() {
        return ingredient;
    }
    public double getPrice(){
        return price;
    }

    public int getIngredientsCount() {

        return ingredientsCount;
    }


}
