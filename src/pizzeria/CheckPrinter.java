package pizzeria;

public class CheckPrinter {
    public static void checkPrint(Order order) {
        System.out.println("********************************");
        System.out.println("Order :" + order.getOrderNumber() + "\n" + "Client :" +
                +order.getCustomer().getCustomerNumber()); //+ "\n" + "Name: Margarita");
        printSeparatorLine();
        for (OrderItem orderItem : order.getOrderItems()) {
            System.out.println(orderItem.toStringDescription());
            printSeparatorLine();
        }

        System.out.println("Amount: " + order.calculateOrderPrice() + " €");
        System.out.println("Quantity: " + order.getOrderNumber());
        System.out.println("_________________________");

        System.out.println("Total amount: " + order.calculateOrderPrice() + " €");
        System.out.println("*************************");

    }

    private static void printSeparatorLine(){
        System.out.println("_________________________");
      //  System.out.println("*************************");
    }

    // implement print check method
}
