package pizzeria;

public class Pizza {

    private static final int MAX_ALLOWED_INGREDIENTS_SIZE = 7;

    private String pizzaName;
    private PizzaType pizzaType;
    private Ingredient[] ingredients;
    private Customer customer;
    private Order order;
    private int ingredientsCount;


    public Pizza(String pizzaName) {
        if (pizzaName.length() > 4 && pizzaName.length() < 20) {
            this.pizzaName = pizzaName;
        } else {
            System.out.println(customer.getCustomerName() + " - " + order.getOrderNumber());
        }
        this.ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS_SIZE];
        this.pizzaType = PizzaType.getRegularType();
    }

    public Pizza(String pizzaName, PizzaType pizzaType) {
        this.pizzaName = pizzaName;
        this.ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS_SIZE];
        this.pizzaType = pizzaType;
    }

    public Pizza(String pizzaName, PizzaType pizzaType, Ingredient[] ingredients) {
        this.pizzaName = pizzaName;
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

    public void addIngredients(Ingredient ingredient) {
        if (ingredientsCount > MAX_ALLOWED_INGREDIENTS_SIZE) {
            System.out.println("No more ingredients allowed.");
            return;
        }
        ingredients[ingredientsCount++] = ingredient;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public String getPizzaName() {
        return pizzaName;
    }
}
