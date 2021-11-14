package pizzeriaPalmetto;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrderTest {
        public static void main(String[] args) {
            ReceiptPrinter receiptPrinter = new ReceiptPrinter();
            List<String> pizzaNameOrder1 = new ArrayList<>();
            pizzaNameOrder1.add("Margarita");

            List<PizzaIngredients> ingredients = new ArrayList<>();
            List<Integer> quantity = new ArrayList<>();
            OrderPizza order = new OrderPizza(7717, pizzaNameOrder1, quantity, "CALZONE");
            quantity.add(2);
            quantity.add(3);
            ingredients.add(PizzaIngredients.Tomato_Paste);
            ingredients.add(PizzaIngredients.Peper);
            ingredients.add(PizzaIngredients.Garlic);
            ingredients.add(PizzaIngredients.Bacon);
            order.addIngredient(ingredients);
            receiptPrinter.printCheck(order, pizzaNameOrder1, quantity);
            System.out.println();

            List<String> pizzaNameOrder2 = new ArrayList<>();
            List<PizzaIngredients> ingredients1 = new ArrayList<>();
            List<Integer> quantityOrder2 = new ArrayList<>();
            OrderPizza order2 = new OrderPizza(2345, pizzaNameOrder2, quantityOrder2, "REGULAR");
            pizzaNameOrder2.add("PepperoniOro");
            quantityOrder2.add(3);
            ingredients1.add(PizzaIngredients.Tomato_Paste);
            ingredients1.add(PizzaIngredients.Cheese);
            ingredients1.add(PizzaIngredients.Pepperoni);
            ingredients1.add(PizzaIngredients.Olives);
            order2.addIngredient(ingredients1);
            receiptPrinter.printCheck(order2, pizzaNameOrder2, quantityOrder2);
        }
    }

