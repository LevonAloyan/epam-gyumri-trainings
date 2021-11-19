package pizzeria;

import static pizzeria.PizzaType.*;

public class CheckPrinter {

    // implement print check method

    public static void checkPrint(Order order) {
        System.out.println("Order: " + order.getOrderNumber() + "\n" + "CostumerID: " + order.getCustomer().getCustomerNumber()
                + "\n" + "Costumer Name: " + order.getCustomer().getName() + "\n" + "Costumer Phone Number: " + order.getCustomer().getPhoneNumber()
                + "\n" + "Order Time: " + order.getLocalDateTime());
        System.out.println("-------------------------------");

        for (OrderItem orderItem : order.getOrderItems()) {
            System.out.println(orderItem.toStringDescription());
            System.out.println("---------------------------------");
        }
        System.out.println("Total amount: " + order.calculateOrderPrice() + " $");
        System.out.println("**************************************");
    }

    public static void main(String[] args) {

        OrderItem orderItem1 = OrderItem.addOrderItem(Pizza.addPizza("Margarita", REGULAR,
                Ingredient.SALAMI,Ingredient.GARLIC, Ingredient.CHEESE, Ingredient.BACON), 2);
        OrderItem orderItem2 = OrderItem.addOrderItem(Pizza.addPizza("Peperoni", CLOSED,
                Ingredient.TOMATO_PASTE,Ingredient.CHEESE, Ingredient.PEPPERONI, Ingredient.OLIVES),3);

        Customer customer = Customer.addNewCostumer("Ann", "(+374)98 123 456");
        Order newOrder = new Order(customer, new OrderItem[]{orderItem1,orderItem2});
        CheckPrinter.checkPrint(Order.addNewOrder(customer, orderItem1,orderItem2));
    }
}
