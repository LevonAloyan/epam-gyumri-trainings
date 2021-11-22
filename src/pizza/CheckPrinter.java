package pizza;

public class CheckPrinter {

    public static void checkPrint(Order order) {
        System.out.println("Order number: " + order.getOrderNumber());

        System.out.println("Customer: ");
        System.out.println("name " + order.getCustomer().getName());
        System.out.println("phoneNumber " + order.getCustomer().getPhoneNumber());
        System.out.println("customerNumber " + order.getCustomer().getCustomerNumber());

        System.out.println("OrderItems");
        for (int i = 0; i < order.getOrderItems().length; i++) {
            OrderItem orderItem = order.getOrderItems()[i];
            System.out.println(orderItem);
        }
    }
}