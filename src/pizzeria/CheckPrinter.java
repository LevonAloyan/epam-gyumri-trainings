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

}