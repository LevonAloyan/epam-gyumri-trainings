package pizzeria;

public class CheckPrinter {

    public static void checkPrint(Order order) {
        System.out.println("Order: " + order.getOrderNumber() + "\n" + "CostumerID: " + order.getCustomer().getCustomerNumber()
                + "\n" + "Costumer Name: " + order.getCustomer().getName() + "\n" + "Costumer Phone Number: " + order.getCustomer().getPhoneNumber());
        System.out.println("-------------------------------");

        for (OrderItem orderItem : order.getOrderItems()) {
            System.out.println(orderItem.toStringDescription());
            System.out.println("---------------------------------");
        }
        System.out.println("Total amount: " + order.calculateOrderPrice() + " $");
        System.out.println("**************************************");
    }


    public static void main(String[] args) {
        Customer customer = Customer.addNewCostumer("Davit", "(+374)95-13-63-52");

        OrderItem orderItem1 = OrderItem.addOrderItem(Pizza.addPizza("Margarita", PizzaType.getRegularType(),
                Ingredient.getTomatoPaste(), Ingredient.getGarlic(), Ingredient.getCheese(), Ingredient.getBacon()), 7);
        OrderItem orderItem2 = OrderItem.addOrderItem(Pizza.addPizza("Peperoni", PizzaType.getCalzoneType(),
                Ingredient.getTomatoPaste(), Ingredient.getCheese(), Ingredient.getPepperoni(), Ingredient.getOlives()), 4);

        Order newOrder = new Order(customer, new OrderItem[]{orderItem1, orderItem2});

        CheckPrinter.checkPrint(Order.addNewOrder(customer, orderItem1, orderItem2));
    }
}
