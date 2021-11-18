package pizzeria;

public class Test {

        public static void main(String[] args) {
            Pizza peperoni = Pizza.addPizza("peperoni", PizzaType.getCalzoneType(), Ingredients.getBacon(), Ingredients.getCheese(),
                    Ingredients.getOlives(), Ingredients.getPeperoni());
            Pizza margarita = Pizza.addPizza("margarita", PizzaType.getRegularType(), Ingredients.getBacon(), Ingredients.getCheese(), Ingredients.getGarlic());
            Pizza diablo = Pizza.addPizza("diablo", PizzaType.getRegularType(), Ingredients.getBacon(), Ingredients.getCheese(), Ingredients.getGarlic());

            Customer customer = Customer.addCustomer("John", "213-338-4060");
            OrderItem orderItem = OrderItem.addOrderItem(peperoni, 10);
            OrderItem orderItem1 = OrderItem.addOrderItem(margarita, 1);

            CheckPrinter.checkPrinter(Order.addOrder(customer, orderItem, orderItem1));
        }
}

