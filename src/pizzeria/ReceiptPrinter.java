package pizzeria;

import java.util.ArrayList;
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
            System.out.println(Ingredients.CALZONE.getCalzone() + " €");
            amount += Ingredients.CALZONE.getCalzone();
        } else {
            System.out.println(Ingredients.REGULAR.getRegular() + " €");
            amount += Ingredients.REGULAR.getRegular();
        }
        if (order.getFillPizza().contains(Ingredients.TOMATO_PASTE)) {
            System.out.println(Ingredients.TOMATO_PASTE.name() + " " + Ingredients.TOMATO_PASTE.getTomato() + " €");
            amount += Ingredients.TOMATO_PASTE.getTomato();
        }
        if (order.getFillPizza().contains(Ingredients.CHEESE)) {
            System.out.println(Ingredients.CHEESE.name() + " " + Ingredients.CHEESE.getCheese() + " €");
            amount += Ingredients.CHEESE.getCheese();
        }
        if (order.getFillPizza().contains(Ingredients.SALAMI)) {
            System.out.println(Ingredients.SALAMI.name() + " " + Ingredients.SALAMI.getSalami() + " €");
            amount += Ingredients.SALAMI.getSalami();
        }
        if (order.getFillPizza().contains(Ingredients.BACON)) {
            System.out.println(Ingredients.BACON.name() + " " + Ingredients.BACON.getBacon() + " €");
            amount += Ingredients.BACON.getBacon();
        }
        if (order.getFillPizza().contains(Ingredients.GARLIC)) {
            System.out.println(Ingredients.GARLIC.name() + " " + Ingredients.GARLIC.getGarlic() + " €");
            amount += Ingredients.GARLIC.getGarlic();
        }
        if (order.getFillPizza().contains(Ingredients.CORN)) {
            System.out.println(Ingredients.CORN.name() + " " + Ingredients.CORN.getCorn() + " €");
            amount += Ingredients.CORN.getCorn();
        }
        if (order.getFillPizza().contains(Ingredients.PEPPERONI)) {
            System.out.println(Ingredients.PEPPERONI.name() + " " + Ingredients.PEPPERONI.getPepperoni() + " €");
            amount += Ingredients.PEPPERONI.getPepperoni();
        }
        if (order.getFillPizza().contains(Ingredients.OLIVES)) {
            System.out.println(Ingredients.OLIVES.name() + " " + Ingredients.OLIVES.getOlives() + " €");
            amount += Ingredients.OLIVES.getOlives();
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
