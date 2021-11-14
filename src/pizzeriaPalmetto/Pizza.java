package pizzeriaPalmetto;

public class Pizza {
    private String name;
    private PizzaType pizzaType;
    private Ingredients ingredients;
    private int quantity;



    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", pizzaType=" + pizzaType +
                ", ingredients=" + ingredients +
                ", quantity=" + quantity +
                '}';
    }

    public Pizza(String name, PizzaType pizzaType, Ingredients ingredients, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.ingredients = ingredients;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
