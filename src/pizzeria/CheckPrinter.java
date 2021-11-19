package pizzeria;


public class CheckPrinter {
    public void printCheck(Order order, Pizza pizza, PizzaType type, Customer customer,
                           OrderItem orderItem, Ingredient[] ingredients) {
        System.out.println("****************************");
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + customer.getCustomerNumber() + ", " + customer.getName() + ", "
                + customer.getPhoneNumber());
        if (pizza.getName().equals("Customer_name_")) {
            System.out.println("Name: " + pizza.getName() + order.getOrderNumber());
        } else {
            System.out.println("Name: " + pizza.getName());
        }
        System.out.println("Order time: " + orderItem.getTime());
        System.out.println("----------------------------");
        System.out.print("Pizza Base (" + type.getName() + ") " + type.getPrice() + " €");
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
