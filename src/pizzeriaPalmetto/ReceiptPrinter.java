package pizzeriaPalmetto;

import java.util.List;

public class ReceiptPrinter {

    public void printCheck(Order order, List<String> pizza, List<Integer> quantity) {
        double amount = 0;
        int i = 0;
        double totalAmount;
        System.out.println("****************************");
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomerNumber());
        System.out.println("Name: " + order.getPizzaName().get(i));
        System.out.println("Order time: " + order.getTime());
        System.out.println("----------------------------");
        System.out.print("Pizza Base (" + order.getPizzaType() + ") ");
        if (order.getPizzaType().equals("CALZONE")) {
            System.out.println(PizzaIngredients.CALZONE.getCalzone() + " €");
            amount += PizzaIngredients.CALZONE.getCalzone();
        } else {
            System.out.println(PizzaIngredients.REGULAR.getRegular() + " €");
            amount += PizzaIngredients.REGULAR.getRegular();
        }
        if (order.getFillPizza().contains(PizzaIngredients.TOMATO_PASTE)) {
            System.out.println(PizzaIngredients.TOMATO_PASTE.name() + " " + PizzaIngredients.TOMATO_PASTE.getTomato() + " €");
            amount += PizzaIngredients.TOMATO_PASTE.getTomato();
        }
        if (order.getFillPizza().contains(PizzaIngredients.CHEESE)) {
            System.out.println(PizzaIngredients.CHEESE.name() + " " + PizzaIngredients.CHEESE.getCheese() + " €");
            amount += PizzaIngredients.CHEESE.getCheese();
        }
        if (order.getFillPizza().contains(PizzaIngredients.SALAMI)) {
            System.out.println(PizzaIngredients.SALAMI.name() + " " + PizzaIngredients.SALAMI.getSalami() + " €");
            amount += PizzaIngredients.SALAMI.getSalami();
        }
        if (order.getFillPizza().contains(PizzaIngredients.BACON)) {
            System.out.println(PizzaIngredients.BACON.name() + " " + PizzaIngredients.BACON.getBacon() + " €");
            amount += PizzaIngredients.BACON.getBacon();
        }
        if (order.getFillPizza().contains(PizzaIngredients.GARLIC)) {
            System.out.println(PizzaIngredients.GARLIC.name() + " " + PizzaIngredients.GARLIC.getGarlic() + " €");
            amount += PizzaIngredients.GARLIC.getGarlic();
        }
        if (order.getFillPizza().contains(PizzaIngredients.CORN)) {
            System.out.println(PizzaIngredients.CORN.name() + " " + PizzaIngredients.CORN.getCorn() + " €");
            amount += PizzaIngredients.CORN.getCorn();
        }
        if (order.getFillPizza().contains(PizzaIngredients.PEPPERONI)) {
            System.out.println(PizzaIngredients.PEPPERONI.name() + " " + PizzaIngredients.PEPPERONI.getPepperoni() + " €");
            amount += PizzaIngredients.PEPPERONI.getPepperoni();
        }
        if (order.getFillPizza().contains(PizzaIngredients.OLIVES)) {
            System.out.println(PizzaIngredients.OLIVES.name() + " " + PizzaIngredients.OLIVES.getOlives() + " €");
            amount += PizzaIngredients.OLIVES.getOlives();
        }
        System.out.println("----------------------------");
        System.out.println("Amount: " + amount + " €");
        System.out.println("Quantity: " + order.getQuantityOfOrder().get(i));
        System.out.println("----------------------------");
        totalAmount = amount* quantity.get(i);
        if (pizza.size() > 1) {
            quantity.remove(i);
            pizza.remove(i);
            printCheck(order, pizza, quantity);
        }  else {
            System.out.println("Total Amount: " + (totalAmount + amount* quantity.get(i)) + " €");
            return;
        }
        System.out.println("****************************");
    }
}
