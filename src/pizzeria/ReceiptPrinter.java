package pizzeria;

import com.sun.tools.corba.se.idl.constExpr.Or;

public class ReceiptPrinter {

    public void printCheck(Order order) {
        double amount = 0;
        System.out.println("****************************");
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomerNumber());
        System.out.println("Name: " + order.getPizzaName());
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
        if (order.getIngredients().equals(Ingredients.TOMATO_PASTE.name())) {
            System.out.println(order.getIngredients() + " " + Ingredients.TOMATO_PASTE.getTomato() + " €");
            amount += Ingredients.TOMATO_PASTE.getTomato();
        } else if (order.getIngredients().equals(Ingredients.CHEESE.name())) {
            System.out.println(order.getIngredients() + " " + Ingredients.CHEESE.getCheese() + " €");
            amount += Ingredients.CHEESE.getCheese();
        } else if (order.getIngredients().equals(Ingredients.SALAMI.name())) {
            System.out.println(order.getIngredients() + " " + Ingredients.SALAMI.getSalami() + " €");
            amount += Ingredients.SALAMI.getSalami();
        } else if (order.getIngredients().equals(Ingredients.BACON.name())) {
            System.out.println(order.getIngredients() + " " + Ingredients.BACON.getBacon() + " €");
            amount += Ingredients.BACON.getBacon();
        } else if (order.getIngredients().equals(Ingredients.GARLIC.name())) {
            System.out.println(order.getIngredients() + " " + Ingredients.GARLIC.getGarlic() + " €");
            amount += Ingredients.GARLIC.getGarlic();
        } else if (order.getIngredients().equals(Ingredients.CORN.name())) {
            System.out.println(order.getIngredients() + " " + Ingredients.CORN.getCorn() + " €");
            amount += Ingredients.CORN.getCorn();
        } else if (order.getIngredients().equals(Ingredients.PEPPERONI.name())) {
            System.out.println(order.getIngredients() + " " + Ingredients.PEPPERONI.getPepperoni() + " €");
            amount += Ingredients.PEPPERONI.getPepperoni();
        } else if (order.getIngredients().equals(Ingredients.OLIVES.name())) {
            System.out.println(order.getIngredients() + " " + Ingredients.OLIVES.getOlives() + " €");
            amount += Ingredients.OLIVES.getOlives();
        }
        System.out.println("----------------------------");
        System.out.println("Amount: " + amount + " €");
        System.out.println("Quantity: " + order.getQuantityOfOrder());
        if (order.getQuantityOfOrder() > 1) {
            if (order.getQuantityOfOrder() == 1) {
                return;
            }
            order.setQuantityOfOrder(order.getQuantityOfOrder() -1);
        }
        System.out.println("****************************");
    }
}
