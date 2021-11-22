package pizzeria;

import java.util.Locale;

import static pizzeria.PizzaType.CLOSED;
import static pizzeria.PizzaType.REGULAR;

public class Main {

    public static void main(String[] args) {
       int i = 1323;
       Integer integer = 1012341; //autoboxing
        i = integer; //auto-unboxing

        Double d = 12.3;

        Boolean b= new Boolean(null);

        System.out.println(b);
            OrderItem orderItem1 = OrderItem.addOrderItem(Pizza.addPizza("Margarita", REGULAR,
                    Ingredient.SALAMI,Ingredient.GARLIC, Ingredient.CHEESE, Ingredient.BACON), 2);
            OrderItem orderItem2 = OrderItem.addOrderItem(Pizza.addPizza("Peperoni", CLOSED,
                    Ingredient.TOMATO_PASTE,Ingredient.CHEESE, Ingredient.PEPPERONI, Ingredient.OLIVES),3);

            Customer customer = Customer.addNewCostumer("Ann", "(+374)98 123 456");
            Order newOrder = new Order(customer, new OrderItem[]{orderItem1,orderItem2});

            CheckPrinter.checkPrint(Order.addNewOrder(customer, orderItem1,orderItem2));


    }

}
