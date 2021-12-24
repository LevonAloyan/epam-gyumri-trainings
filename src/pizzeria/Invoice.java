package pizzeria;

import pizzeria.order.Order;
import pizzeria.order.OrderItem;
import pizzeria.pizza.Pizza;

public class Invoice {
    public static void printCheck(Order order, Pizza pizza) {
        double totalAmount = 0.0d;
        {
            System.out.println("*******************");
            System.out.println("Order: " + order.getOrderNumber());
            System.out.println("Client: " + order.getCustomerNumber());

            for (OrderItem orderItem : order.getOrderItems()) {
                    System.out.println("Name: " + orderItem.getPizza().pizzaName);
                    System.out.println("-------------------");
                    System.out.println("Pizza Base" + "(" + orderItem.getPizza().pizzaType().getType() + ") " + orderItem.getPizza().pizzaType().getPrice() + " €");

                for (Ingredient ingredient : orderItem.getPizza().getIngredients()) {
                    if (ingredient != null) {
                        System.out.println(ingredient.getName() + " " + ingredient.getPrice() + "€");
                    }
                }
                System.out.println("--------------");
                System.out.println("Amount: " + pizza.calculatePrice() + "€");
                System.out.println("Quantity: " + orderItem.getQuantity());
                System.out.println("---------------");
                totalAmount += orderItem.getPizza().calculatePrice() * orderItem.getQuantity();
            }
            System.out.println("Total amount:" + totalAmount + " " + "€");
        }
    }
}

