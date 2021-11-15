package pizzeria;

import java.util.ArrayList;
import java.util.List;

    public class Test {
        public static void main(String[] args) {
            Order order = new Order(7717, "PEPPERONI", 2, "CALZONE");
            order.displaying();
            List<String> ingredients = new ArrayList<>();
            ingredients.add("TOMATO_PASTE");
            ingredients.add("SALAMI");
            ingredients.add("CHEESE");
            ingredients.add("CORN");
            ingredients.add("PEPPERONI");
            order.addIngredient(ingredients);
            order.printCheck();
        }
    }

