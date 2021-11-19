package pizzeria;

import javax.naming.NamingEnumeration;

public class Test {

    public static void main(String[] args) {

        Pizza americano = Pizza.addPizza("Americano", PizzaType.CLOSED, Ingredient.GARLIC,
                Ingredient.BACON, Ingredient.OLIVES, Ingredient.CHEESE);
        Pizza margarita = Pizza.addPizza("Margarita", PizzaType.REGULAR, Ingredient.CHEESE,
                Ingredient.BACON, Ingredient.SALAMI, Ingredient.TOMATO);
        Customer customer = new Customer("Davit", "+374 93-907-107");
        OrderItem orderItem = new OrderItem(americano, 10);
        OrderItem orderItem1 = new OrderItem(margarita, 3);
        CheckPrinter.checkPrint(Order.addOrder(customer,orderItem,orderItem1));
    }

}
