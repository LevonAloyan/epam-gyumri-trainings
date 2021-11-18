package pizzeria;

public class OrderItem {
   private int quantity;
   private Pizza pizza;

    public OrderItem ( Pizza pizza, int quantity){
        this.pizza=pizza;
        if(quantity>1 && quantity<=10){
        this.quantity=quantity;}
        else {
            System.out.println("You can order a maximum of 10 pizza of each type");
        }
    }


    public Pizza getPizza() {
        return pizza;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalAmount(){
        double totalAmount = 0;
        for (int i = 0; i < quantity; i++) {
            totalAmount += pizza.calculatePrice();
        }
        return totalAmount;
    }

    public String orderIteamAttributes () {
        System.out.println("Pizza name: " + getPizza().getPizzaName());
        System.out.println("Quantity: " + getQuantity());
        System.out.println(getPizza().getPizzaType().getType());
        for (Ingredient ingredientType: getPizza().getIngredients()) {
            System.out.println(ingredientType);
        }
        return ("Amount: " + getPizza().calculatePrice());
    }
}
