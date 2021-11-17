package pizzeria;

public class CheckPrinter {

    // implement print check method

    public static void checkPrint(Order order) {
        printSeparatorLine();
        System.out.println("Order: " + order.getOrderNumber() + "\n" + "Client: " +
                +order.getCustomer().getCustomerNumber());

        for (OrderItem orderItem : order.getOrderItems()) {
            System.out.println(orderItem.toStringDescription());
            printSeparatorLine();
        }

        System.out.println("Total amount:" + order.calculateOrderPrice() + "$");
        printSeparatorLine();
    }

    private static void printSeparatorLine() {
        System.out.println("**************");
    }
}
