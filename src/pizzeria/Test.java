package pizzeria;

public class Test {
    public static void main(String[] args) {
        Pizza peperoni = Pizza.addPizza("peperoni", PizzaType.getCalzoneType(), Ingredients.BACON, Ingredients.CHEESE,
                Ingredients.OLIVES, Ingredients.PEPPERONI);
        Pizza diablo = Pizza.addPizza("diablo", PizzaType.getRegularType(), Ingredients.BACON, Ingredients.CHEESE, Ingredients.GARLIC);

        Customer customer = Customer.addCustomer("Joe", "747-216-1993");
        OrderItem orderItem = OrderItem.addOrderItem(peperoni, 7);
        OrderItem orderItem1 = OrderItem.addOrderItem(diablo, 1);

        CheckPrinter.checkPrint(Order.addOrder(customer, orderItem, orderItem1));
    }
}
