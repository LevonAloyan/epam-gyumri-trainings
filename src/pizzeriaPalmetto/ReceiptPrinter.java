package pizzeriaPalmetto;

import java.util.List;

public class ReceiptPrinter {

    public void printCheck(OrderPizza order, List<String> pizza, List<Integer> quantity) {
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
        System.out.println();

        if (order.getFillPizza().contains(PizzaIngredients.Tomato_Paste)) {
            System.out.println(PizzaIngredients.Tomato_Paste.name() + " " + PizzaIngredients.Tomato_Paste.getTomato() + " €");
            amount += PizzaIngredients.Tomato_Paste.getTomato();
        }
        if (order.getFillPizza().contains(PizzaIngredients.Cheese)) {
            System.out.println(PizzaIngredients.Cheese.name() + " " + PizzaIngredients.Cheese.getCheese() + " €");
            amount += PizzaIngredients.Cheese.getCheese();
        }
        if (order.getFillPizza().contains(PizzaIngredients.Salami)) {
            System.out.println(PizzaIngredients.Salami.name() + " " + PizzaIngredients.Salami.getSalami() + " €");
            amount += PizzaIngredients.Salami.getSalami();
        }
        if (order.getFillPizza().contains(PizzaIngredients.Bacon)) {
            System.out.println(PizzaIngredients.Bacon.name() + " " + PizzaIngredients.Bacon.getBacon() + " €");
            amount += PizzaIngredients.Bacon.getBacon();
        }
        if (order.getFillPizza().contains(PizzaIngredients.Garlic)) {
            System.out.println(PizzaIngredients.Garlic.name() + " " + PizzaIngredients.Garlic.getGarlic() + " €");
            amount += PizzaIngredients.Garlic.getGarlic();
        }
        if (order.getFillPizza().contains(PizzaIngredients.Corn)) {
            System.out.println(PizzaIngredients.Corn.name() + " " + PizzaIngredients.Corn.getCorn() + " €");
            amount += PizzaIngredients.Corn.getCorn();
        }
        if (order.getFillPizza().contains(PizzaIngredients.Pepperoni)) {
            System.out.println(PizzaIngredients.Pepperoni.name() + " " + PizzaIngredients.Pepperoni.getPepperoni() + " €");
            amount += PizzaIngredients.Pepperoni.getPepperoni();
        }
        if (order.getFillPizza().contains(PizzaIngredients.Olives)) {
            System.out.println(PizzaIngredients.Olives.name() + " " + PizzaIngredients.Olives.getOlives() + " €");
            amount += PizzaIngredients.Olives.getOlives();
        }
        if (order.getFillPizza().contains(PizzaIngredients.Peper)) {
            System.out.println(PizzaIngredients.Peper.name() + " " + PizzaIngredients.Peper.getPeper() + " €");
            amount += PizzaIngredients.Peper.getPeper();
        }
        if (order.getPizzaType().equals("CALZONE")) {
            System.out.println(PizzaIngredients.CALZONE.getCalzone() + " €");
            amount += PizzaIngredients.CALZONE.getCalzone();
        } else {
            System.out.println(PizzaIngredients.REGULAR.getRegular() + " €");
            amount += PizzaIngredients.REGULAR.getRegular();
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
