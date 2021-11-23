package pizzeria;

public class CheckPrinter {
    private Order order;

    // implement print check method
    public void printCheck(){
        System.out.println(order.getOrderNumber()+order.getCustomer().getName()+order.getCustomer().getCustomerNumber());
    }
}
