package pizzeria;

public class CheckPrinter {
    public static void checkPrinter(Order order) {
        System.out.println("Order :" + order.getOrderNumber() + "\n" + "Client :" + order.getCustomer().getCustomerNumber());
        printSeparatorLine();
        for (OrderItem orderItem : order.getOrderItems()) {
            System.out.println(orderItem.toStringDescription());
            printSeparatorLine();
        }

        System.out.println("Total amount : " + order.calculateOrderPrice() + " €");
    }

    private static void printSeparatorLine() {
        System.out.println("******************************************");
    }


}
