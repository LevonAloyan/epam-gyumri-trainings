package pizzeria;

public class OrderItem {

    private Pizza pizza;
    private int pizzaCount;

    public OrderItem (Pizza pizza, int pizzaCount){
        this.pizza = pizza;
        this.pizzaCount = checkQuantityPizza(pizzaCount);
    }

        public int checkQuantityPizza(int pizzaCount) {
        if (pizzaCount > 1  && pizzaCount <= 10) {
            return pizzaCount;
        }
        System.out.println("From one pizza you can order no more than 10");
        return 0;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public int getCount() {
        return pizzaCount;
    }

    public static OrderItem addOrderItem(Pizza pizza, int pizzaCount) {
        return new OrderItem(pizza, pizzaCount);
    }

    public double calculatePrice() {
        double ultimatePrice = 0.0d;
        for (int i = 0; i < pizzaCount; i++) {
            ultimatePrice += getPizza().calculatePrice();
        }
        return ultimatePrice;
    }
    public String printDescription() {
        System.out.println( "Pizza name: " + getPizza().getName() );
        System.out.println( "Quantity: " + getCount());
        System.out.println(getPizza().getPizzaType().printType());
        for (Ingredient item : getPizza().getIngredients()){
            System.out.println(item);
        }
        
        return ("Amount: " + calculatePrice() + " €");
    }
}
