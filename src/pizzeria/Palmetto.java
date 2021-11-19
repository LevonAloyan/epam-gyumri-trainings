package pizzeria;

public class Test {

        public static void main(String[] args) {
            Pizza peperoni = Pizza.addPizza("peperoni", PizzaType.getCalzoneType(), Ingredient.getBacon(), Ingredient.getCheese(),
                    Ingredient.getOlives(), Ingredient.getPeperoni());
            Pizza margarita = Pizza.addPizza("margarita", PizzaType.getRegularType(), Ingredient.getBacon(), Ingredient.getCheese(), Ingredient.getGarlic());
            Pizza diablo = Pizza.addPizza("diablo", PizzaType.getRegularType(), Ingredient.getBacon(), Ingredient.getCheese(), Ingredient.getGarlic());

            Customer customer = Customer.addCustomer("John", "213-338-4060");
            OrderItem orderItem = OrderItem.addOrderItem(peperoni, 10);
            OrderItem orderItem1 = OrderItem.addOrderItem(margarita, 1);

            CheckPrinter.checkPrinter(Order.addOrder(customer, orderItem, orderItem1));
        }
}

