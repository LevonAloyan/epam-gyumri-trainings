package pizzeria;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(55555);
        Customer customer = new Customer(i, "poxos", "656563235");
        Ingredient[] ingredients = new Ingredient[3];
        ingredients[0] = Ingredient.GetBacon();
        ingredients[1] = Ingredient.GetCorn();
        ingredients[2] = Ingredient.getCheese();
        Pizza pizza = new Pizza("Altono", PizzaType.CLOSED, ingredients, 1);
        Pizza pizza2 = new Pizza("Altono", PizzaType.CLOSED, ingredients, 2);
        i = random.nextInt(11111);
        Order order = new Order(i, customer, new Pizza[]{pizza,pizza2});
        System.out.println(CheckPrinter.printCheck(order));

    }

}
