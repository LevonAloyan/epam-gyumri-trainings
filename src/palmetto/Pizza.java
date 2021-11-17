package palmetto;

public class Pizza extends Ingredient {
    private static final int MAX_INGREDIENTS_SIZE = 7;

    public String pizzaName;
    private palemetto.PizzaType pizzaType;
    protected palemetto.Ingredient[] ingredients;
    private int ingredientsCount;


    public Pizza() {
        super(null, 0);
        this.pizzaName = pizzaName;
        this.ingredients =new palemetto.Ingredient[MAX_INGREDIENTS_SIZE];
        this.pizzaType = PizzaType.getRegularType();
    }
    public Pizza (String pizzaName, palemetto.PizzaType pizzaType) {
        super(null, 0);
        this.pizzaName = pizzaName;
        this.ingredients =new Ingredient[MAX_INGREDIENTS_SIZE];
        this.pizzaType = pizzaType;
    }
    public Pizza (String pizzaName, PizzaType pizzaType, Ingredient[] ingredients) {
        super(null, 0);
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
        double price = 0;
        price = price + pizzaType.getPrice();

        for (palemetto.Ingredient ingredient : ingredients) {
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
