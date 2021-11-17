package pizzeria;


public class CheckPrinter {
    public void printCheck(Order order, Pizza pizza, PizzaType type, Customer customer,
                           OrderItem orderItem, Ingredient[] ingredients) {
        System.out.println("****************************");
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + customer.getCustomerNumber() + ", " + customer.getName() + ", "
                + customer.getPhoneNumber());
        // Why this code works incorrect? must be < 4 || > 20, but in that case it doesn't work
        if (pizza.getName().length() > 4 || pizza.getName().length() < 20) {
            System.out.println("Name: " + pizza.getName() + order.getOrderNumber());
        } else {
            System.out.println("Name: " + pizza.getName());
        }
        System.out.println("Order time: " + orderItem.getTime());
        System.out.println("----------------------------");
        System.out.print("Pizza Base (" + type.getType() + ") " + type.getPrice() + " €");
        System.out.println();
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient.getName() + " " + ingredient.getPrice() + " €");
        }
        System.out.println("----------------------------");
        System.out.println("Amount: " + pizza.calculatePrice() + " €");
        System.out.println("Quantity: " + orderItem.getOrderQuantity());
        System.out.println("----------------------------");
        System.out.println("Total Amount: " + (float) (pizza.calculatePrice() * orderItem.getOrderQuantity()) + " €");
    }
}
