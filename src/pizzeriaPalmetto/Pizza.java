package pizzeriaPalmetto;

public class Pizza {
    private String pizzaName;
    private String ingredient;
    private String pizzaType;
    private int quantity;

    public Pizza(String pizzaName, String ingredient, String pizzaType, int quantity) {
        this.pizzaName = pizzaName;
        this.ingredient = ingredient;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    public String getPizzaName() {
        if (pizzaName.length()<4 || pizzaName.length()>20){
            System.out.println("The pizza name is not valid");
        }
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public int getQuantity() {
       if (quantity>10){
           System.out.println("You can not order more than 10");
       }
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaName='" + pizzaName + '\'' +
                ", ingredient='" + ingredient + '\'' +
                ", pizzaType='" + pizzaType + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
