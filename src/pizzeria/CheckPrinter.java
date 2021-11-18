package pizzeria;

public class CheckPrinter {

    // implement print check method

    public static void checkPrint(Order order) {
        System.out.println("**************************************");
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomer().getCustomerNumber());
        System.out.println("Client Name: " + order.getCustomer().getName());
        System.out.println("Client Phone: " + order.getCustomer().getPhoneNumber());
        System.out.println("--------------------------------------");

        for (OrderItem orderItem : order.getOrderItems()) {
            System.out.println(orderItem.printDescription());
            System.out.println("--------------------------------------");
        }
        System.out.println("Total amount: " + order.calculateOrderPrice() + " €");
        System.out.println("**************************************");
    }

    public static void main(String[] args) {
        Customer customer = Customer.addCostumer("Jon", "+374 60 50 40 30");

        OrderItem orderItem1 = OrderItem.addOrderItem(Pizza.addNewPizza("Margarita", PizzaType.getCalzoneType(),
                Ingredient.getGarlic(), Ingredient.getCorn(), Ingredient.getBacon()), 2);
        OrderItem orderItem2 = OrderItem.addOrderItem(Pizza.addNewPizza("Peperoni", PizzaType.getRegularType(),
                Ingredient.getPepperoni(), Ingredient.getOlives(), Ingredient.getSalami(), Ingredient.getOlives()), 5);

        Order newOrder = new Order(customer, new OrderItem[] { orderItem1, orderItem2 });

        CheckPrinter.checkPrint(Order.addNewOrder(customer, orderItem1, orderItem2));
    }
}
