package pizzeria;


public class ReceiptPrinter {

    public void printCheck(Order order, Pizza pizza) {
        System.out.println("Your order is " + order.toString(pizza.getPizzaName(), pizza.getPizzaType()));
        double amount = 0;
        int i = 0;
        double totalAmount;
        System.out.println("****************************");
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomerNumber());
        System.out.println("Name: " + pizza.getPizzaName().get(i));
        System.out.println("Order time: " + order.getTime());
        System.out.println("----------------------------");
        System.out.print("Pizza Base (" + pizza.getPizzaType().get(i) + ") ");
        if (pizza.getPizzaType().get(i).equals("CALZONE")) {
            System.out.println(Ingredients.CALZONE.getPrice() + " €");
            amount += Ingredients.CALZONE.getPrice();
        } else {
            System.out.println(Ingredients.REGULAR.getPrice() + " €");
            amount += Ingredients.REGULAR.getPrice();
        }
        if (pizza.getFillPizza().contains(Ingredients.TOMATO_PASTE)) {
            System.out.println(Ingredients.TOMATO_PASTE.getNameAndPrice());
            amount += Ingredients.TOMATO_PASTE.getPrice();
        }
        if (pizza.getFillPizza().contains(Ingredients.CHEESE)) {
            System.out.println(Ingredients.CHEESE.getNameAndPrice());
            amount += Ingredients.CHEESE.getPrice();
        }
        if (pizza.getFillPizza().contains(Ingredients.SALAMI)) {
            System.out.println(Ingredients.SALAMI.getNameAndPrice());
            amount += Ingredients.SALAMI.getPrice();
        }
        if (pizza.getFillPizza().contains(Ingredients.BACON)) {
            System.out.println(Ingredients.BACON.getNameAndPrice());
            amount += Ingredients.BACON.getPrice();
        }
        if (pizza.getFillPizza().contains(Ingredients.GARLIC)) {
            System.out.println(Ingredients.GARLIC.getNameAndPrice());
            amount += Ingredients.GARLIC.getPrice();
        }
        if (pizza.getFillPizza().contains(Ingredients.CORN)) {
            System.out.println(Ingredients.CORN.getNameAndPrice());
            amount += Ingredients.CORN.getPrice();
        }
        if (pizza.getFillPizza().contains(Ingredients.PEPPERONI)) {
            System.out.println(Ingredients.PEPPERONI.getNameAndPrice());
            amount += Ingredients.PEPPERONI.getPrice();
        }
        if (pizza.getFillPizza().contains(Ingredients.OLIVES)) {
            System.out.println(Ingredients.OLIVES.getNameAndPrice());
            amount += Ingredients.OLIVES.getPrice();
        }
        System.out.println("----------------------------");
        System.out.println("Amount: " + amount + " €");
        System.out.println("Quantity: " + order.getQuantityOfOrder().get(i));
        System.out.println("----------------------------");
        totalAmount = amount* order.getQuantityOfOrder().get(i);
        if (pizza.getPizzaType().size() > 1) {
            pizza.getPizzaType().remove(i);
        }
        if (pizza.getPizzaName().size() > 1) {
            if (order.getQuantityOfOrder().size() > 1) {
            order.getQuantityOfOrder().remove(i);
            }
            pizza.getPizzaName().remove(i);
            printCheck(order, pizza);
        }  else {
            System.out.println("Total Amount: " + (totalAmount + amount* order.getQuantityOfOrder().get(i)) + " €");
            return;
        }
        System.out.println("****************************");
    }
}
