package pizzeria;

public class CheckPrinter {
    private PizzaType pizzaType;
    private Pizza pizza;
    private Order order;
    private Customer customer;


    // implement print check method


    public CheckPrinter(PizzaType pizzaType, Pizza pizza, Order order, Customer customer) {
        this.pizzaType = pizzaType;
        this.pizza = pizza;
        this.order = order;
        this.customer = customer;

    }

    public void displayAttributes() {
        System.out.println("Order: Customer: Name: Quantity");
        System.out.println("[" + order.getOrderNumber() + ":" + customer.getCustomerNumber() +
                ":" + pizza.getName() + ":" + pizza.getQuantity() + "]");
    }

    public void printReceipt() {
        System.out.println("*********************");
        System.out.println("Order: " + order.getOrderNumber() + "\n" +
                "Client:" + customer.getCustomerNumber() + "\n" +
                "Name: " + pizza.getName());
        System.out.println("--------------------");
        System.out.println("Pizza Base " + pizzaType.getType() + " " + pizzaType.getPrice() + " €");
        for (Ingredient ingredient : pizza.getIngredients()) {
            if (ingredient == null) {
                break;
            } else {
                System.out.print(ingredient.getName() + " " + ingredient.getPrice() + " €" + "\n");
            }
        }
        System.out.println("--------------------");
        System.out.println("Amount " + pizza.calculatePrice() + " €");
        System.out.println("Quantity " + pizza.getQuantity());
        System.out.println("--------------------");

    }


}

