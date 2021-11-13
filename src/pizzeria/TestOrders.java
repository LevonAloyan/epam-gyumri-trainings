package pizzeria;

import java.util.ArrayList;
import java.util.List;

public class TestOrders {
    public static void main(String[] args) {
        ReceiptPrinter receiptPrinter = new ReceiptPrinter();
        Order order = new Order(7717, "PEPPERONI", 2, "CALZONE");
        Order order1 = new Order(7744, "MARGARITA", 1, "REGULAR");
        List<String> ingredients = new ArrayList<>();
        ingredients.add("TOMATO_PASTE");
        ingredients.add("SALAMI");
        ingredients.add("CHEESE");
        ingredients.add("GARLIC");
        ingredients.add("CORN");
        order.addIngredient(ingredients);
       // order.addIngredient("SALAMI");
        System.out.println();
        receiptPrinter.printCheck(order);
    }
}
