package pizzeria;

public class TestOrders {
    public static void main(String[] args) {
        CheckPrinter checkPrinter = new CheckPrinter();
        Customer customer = new Customer(7717, "Heghine","+(374 94)374374");
        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.CORN, Ingredient.TOMATO_PASTE};
        PizzaType pizzaType = PizzaType.CLOSED;
        Pizza pizza = new Pizza("Mar", pizzaType, ingredients);
        for (Ingredient ingredient : ingredients) {
            pizza.addIngredients(ingredient);
        }
        OrderItem orderItem = new OrderItem(3);
        OrderItem orderItem2 = new OrderItem(22);
        Order order = new Order(10001,customer,orderItem);
        Order order1 = order.addOrder(10002,customer,orderItem2);
        checkPrinter.printCheck(order,pizza,pizzaType,customer,orderItem, ingredients);
        checkPrinter.printCheck(order1,pizza,pizzaType,customer,orderItem2, ingredients);

    }
}