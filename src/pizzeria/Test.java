package pizzeria;

public class Test {
    public static void main(String[] args) {
        Pizza peperoni = Pizza.addPizza("peperoni", PizzaType.getCalzoneType(), Ingredient.getBacon(), Ingredient.getCheese(),
                Ingredient.getOlives(), Ingredient.getPeperoni());
        Pizza diablo = Pizza.addPizza("diablo", PizzaType.getRegularType(), Ingredient.getBacon(), Ingredient.getCheese(), Ingredient.getGarlic());

        Customer customer = Customer.addCustomer("Joe", "747-216-1993");
        OrderItem orderItem = OrderItem.addOrderItem(peperoni, 7);
        OrderItem orderItem1 = OrderItem.addOrderItem(diablo, 1);

        CheckPrinter.checkPrint(Order.addOrder(customer, orderItem, orderItem1));
    }
}
