package pizzeria;

public class CheckPrinter {
    //todo implement print check method
    private Order order;
    private OrderItem orderItem;
    public CheckPrinter(){
    }

 public void checkPrint(Order order){
     System.out.println("******************************************");
     System.out.println("Order: " + order.getOrderNumber());
     System.out.println("Client number: " + order.getCustomer().getCustomerNumber());
     System.out.println("Client phone number: " + order.getCustomer().getPhoneNumber());

     System.out.println("---------------------------------");
     for (OrderItem orderItem: order.getOrderItems()) {
         System.out.println(orderItem.orderIteamAttributes());
     }
     System.out.println("------------------------------------");
     System.out.println("Total amount: " + orderItem.totalAmount());
     System.out.println("******************************************");

 }

}
