package pizzeria;

public class PizzaTest {
    public static void main(String[] args) {
        Pizza pizza1 =new Pizza("Margarita", PizzaType.getCalzoneType());
        pizza1.addIngredients(Ingredient.getTomatoPaste());
        pizza1.addIngredients( Ingredient.getBacon());
        pizza1.addIngredients(Ingredient.getPepperoni());
        pizza1.addIngredients(Ingredient.getGarlic());

        Pizza pizza2 = new Pizza("PepperoniOro", PizzaType.getRegularType());
        OrderItem orderItem1  = new OrderItem [] (pizza1, 2, pizza2, 3;);
        Customer customer1 =  new  Customer("Michael", "+380 44 123 45 67");
        Order order1 = new Order(orderItem1, customer1);
        CheckPrinter checkPrinter = new CheckPrinter();
        checkPrinter.checkPrint(order1);

    }
}
