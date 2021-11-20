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
        setName(pizza,customer,order);
        checkPrinter.printReceipt();
    }

    public static String setName(Pizza pizza, Customer customer, Order order) {
        if ((pizza.name.length() < 4 || pizza.name.length() > 20) &&( pizza.name=="")) {
            return customer.getName() + order.getOrderNumber();
        } else {
            return pizza.name;
        }
    }



}
