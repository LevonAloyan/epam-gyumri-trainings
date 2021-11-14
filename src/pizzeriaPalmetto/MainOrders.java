package pizzeriaPalmetto;

public class MainOrders {
    public static void main(String[] args) {
        PizzaOrder pizzaOrder = new PizzaOrder(4545, 12411, "SSS", 12);
        Pizza pizza = new Pizza("aaooa", "BACON", "fff", 11);
        System.out.println(pizza.toString());
    }
}
