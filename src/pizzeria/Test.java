package pizzeria;

public class Test {
    public static void main(String[] args) {
        Pizza peperoni = Pizza.addPizza("peperoni", PizzaType.CLOSED, Ingredient.BACON, Ingredient.CHEESE,
                Ingredient.GARLIC, Ingredient.PEPPERONI);
        Pizza margarita = Pizza.addPizza("margarita", PizzaType.REGULAR, Ingredient.BACON, Ingredient.BACON, Ingredient.PEPPERONI);
        Pizza diablo = Pizza.addPizza("diablo", PizzaType.REGULAR, Ingredient.CHEESE, Ingredient.BACON, Ingredient.OLIVES);

        Customer customer = Customer.addCustomer("Garik", "+374-98-23-25-77");
        OrderItem orderItem = OrderItem.addOrderItem(peperoni, 10);
        OrderItem orderItem1 = OrderItem.addOrderItem(margarita, 1);
        OrderItem orderItem2 = OrderItem.addOrderItem(diablo,2);

        CheckPrinter.checkPrint(Order.addOrder(customer, orderItem, orderItem1,orderItem2));
    }
}
