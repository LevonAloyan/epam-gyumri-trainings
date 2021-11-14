package pizzeria;

import java.util.ArrayList;
import java.util.List;

public class TestOrders {
    public static void main(String[] args) {
        ReceiptPrinter receiptPrinter = new ReceiptPrinter();
        List<String> pizzaName = new ArrayList<>();
        List<Ingredients> ingredients = new ArrayList<>();
        List<Integer> quantity = new ArrayList<>();
        Order order = new Order(7717, pizzaName, quantity, "CALZONE");
        pizzaName.add("MARGARITA");
        pizzaName.add("PEPPERONIORO");
        quantity.add(2);
        quantity.add(3);
        ingredients.add(Ingredients.TOMATO_PASTE);
        ingredients.add(Ingredients.GARLIC);
        ingredients.add(Ingredients.BACON);
        order.addIngredient(ingredients);
        receiptPrinter.printCheck(order, pizzaName, quantity);
        System.out.println();
        System.out.println("ORDER ONE IS ACCEPTED");
        System.out.println();


        List<String> pizzaNameOrder2 = new ArrayList<>();
        List<Ingredients> ingredients1 = new ArrayList<>();
        List<Integer> quantityOrder2 = new ArrayList<>();
        Order order2 = new Order(4372, pizzaNameOrder2, quantityOrder2, "CALZONE");
        pizzaNameOrder2.add("BASEPZZ");
        quantityOrder2.add(12);
        ingredients1.add(Ingredients.TOMATO_PASTE);
        ingredients1.add(Ingredients.GARLIC);
        ingredients1.add(Ingredients.BACON);
        order2.addIngredient(ingredients1);
        receiptPrinter.printCheck(order2, pizzaNameOrder2, quantityOrder2);
    }
}
