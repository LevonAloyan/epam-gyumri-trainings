package pizzeria;

public class Main {
    public static void main(String[] args) {
        PizzaType pizzaType = new PizzaType("Calzone", 1.5);
        Pizza pizza = new Pizza("", pizzaType);
        pizza.addIngredients(Ingredient.getTomatoPaste());
        pizza.addIngredients(Ingredient.getPepperoni());
        pizza.addIngredients(Ingredient.getGarlic());
        pizza.addIngredients(Ingredient.getBacon());
        pizza.setQuantity(2);
        Customer customer = new Customer("");
        Order order = new Order();
        CheckPrinter checkPrinter = new CheckPrinter(pizzaType, pizza, order, customer);
        checkPrinter.printReceipt();
    }



}
