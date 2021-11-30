package pizzeria;

public class Pizza {
    private static final int MAX_INGREDIENTS_SIZE = 7;

    public String pizzaName;
    private PizzaType pizzaType;
    protected Ingredient[] ingredients;
    private int ingredientsCount;


    public Pizza() {
        this.pizzaName = pizzaName;
        this.ingredients =new pizzeria.Ingredient[MAX_INGREDIENTS_SIZE];
        this.pizzaType = PizzaType.getRegularType();
    }
    public Pizza (String pizzaName, PizzaType pizzaType) {
        this.pizzaName = pizzaName;
        this.ingredients =new Ingredient[MAX_INGREDIENTS_SIZE];
        this.pizzaType = pizzaType;
    }
    public Pizza (String pizzaName, PizzaType pizzaType, Ingredient[] ingredients) {
        this.pizzaName = pizzaName;
        this.pizzaType = pizzaType;
        if(ingredients.length > MAX_INGREDIENTS_SIZE){
            System.out.println("Ingredients more then allowed " + MAX_INGREDIENTS_SIZE);
            this.ingredients =new Ingredient[MAX_INGREDIENTS_SIZE];
        } else {
            this.ingredients = ingredients;
        }
    }
    public double calculatePrice(){
        double price = 0.0d;
        price = price + pizzaType.getPrice();

        for (Ingredient ingredient : ingredients) {
            price += ingredient.getPrice();
        }
        return price;
    }
    public void addIngredients(Ingredient ingredient) {
        for (int i = 0; i < ingredients.length; i++) {
            if(ingredients[i] == ingredient){
                System.out.println("Check the order again.");
            }
        }
        if (ingredientsCount > MAX_INGREDIENTS_SIZE){
            System.out.println("No more ingredients allowed.");
            return;
        }
        ingredients[ingredientsCount++] = ingredient;
    }

    public String getPizzaName(Order order) {
        if (pizzaName.length() > 4 && pizzaName.length() < 20) {
            this.pizzaName = pizzaName;
        } else {
            this.pizzaName = "customer_name_" + order.getOrderNumber();
        }
        return pizzaName;
    }
    public Ingredient[] getIngredients(){
        return ingredients;
    }
}
