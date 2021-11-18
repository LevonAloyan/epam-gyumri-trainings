package pizzeria;

public class Main {
    public static void main(String[] args) {
         PizzaType pizzaType = new PizzaType("Calzone", 1.5);
        System.out.println(pizzaType.getType());
        System.out.println(pizzaType.getPrice());
        Pizza pizza = new Pizza("Margarita", pizzaType);
        pizza.addIngredients(Ingredient.getTomatoPaste());
        pizza.addIngredients(Ingredient.getPepperoni());
        pizza.addIngredients(Ingredient.getGarlic());
        pizza.addIngredients(Ingredient.getBacon());
        pizza.setQuantity(2);
        System.out.println(pizza.calculatePrice());
        Customer customer = new Customer("");
        System.out.println(customer.getCustomerNumber());
        System.out.println(customer.getName());
        Order order = new Order();
        System.out.println(order.getOrderNumber());
        System.out.println(order.addOrderItems());
        CheckPrinter checkPrinter =new CheckPrinter(pizzaType,pizza,order,customer);
        checkPrinter.displayAttributes();
        checkPrinter.printReceipt();
    }
}
