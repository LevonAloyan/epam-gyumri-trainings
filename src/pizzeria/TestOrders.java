package pizzeria;

import java.util.ArrayList;
import java.util.List;

public class TestOrders {
    public static void main(String[] args) {
        ReceiptPrinter receiptPrinter = new ReceiptPrinter();
        List<String> pizzaName = new ArrayList<>();
        List<String> pizzaType = new ArrayList<>();
        pizzaName.add("MARGARITA");
        pizzaName.add("PE");
        pizzaType.add("CALZONE");
        pizzaType.add("REGULAR");
        Pizza pizza = new Pizza(pizzaName,pizzaType);
        List<Ingredients> ingredients = new ArrayList<>();
        List<Integer> quantity = new ArrayList<>();
        quantity.add(22);
        quantity.add(3);
        ingredients.add(Ingredients.TOMATO_PASTE);
        ingredients.add(Ingredients.GARLIC);
        ingredients.add(Ingredients.BACON);
        Order order = new Order(7717, quantity);
        pizza.addIngredient(ingredients);
        receiptPrinter.printCheck(order, pizza);
        System.out.println();
        System.out.println("ORDER ONE IS ACCEPTED");

    }
}
