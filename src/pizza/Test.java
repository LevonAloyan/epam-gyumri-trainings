package pizza;


    public class Test {
        public static void main(String[] args) {
            Customer customer = new Customer(1, "John", "09867543");

            Ingredient [] ingredients = new Ingredient[3];
            ingredients[0] = Ingredient.BACON;
            ingredients[1] = Ingredient.CHEESE;
            ingredients[2] = Ingredient.CORN;

            Pizza pizza1 = new Pizza("Pizza A", PizzaType.REGULAR, ingredients);
            Pizza pizza2 = new Pizza("Pizza B", PizzaType.CALZONE, ingredients);

            OrderItem [] orderItems = new OrderItem[2];
            orderItems[0] = new OrderItem(pizza1, 1);
            orderItems[1] = new OrderItem(pizza2, 2);

            Order order = Order.addOrder(1, customer, orderItems);
            CheckPrinter.checkPrint(order);
        }
    }

