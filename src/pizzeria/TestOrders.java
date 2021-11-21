package pizzeria;

public class TestOrders {
    public static void main(String[] args) {
        CheckPrinter checkPrinter = new CheckPrinter();
        Customer customer = new Customer(7717, "Heghine","+(374 94)374374");
        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.CORN, Ingredient.TOMATO_PASTE};
        Pizza pizza = new Pizza("Mar", PizzaType.CLOSED, ingredients);
        for (Ingredient ingredient : ingredients) {
            pizza.addIngredient(ingredient);
        }
        OrderItem orderItem = new OrderItem(3);
        OrderItem orderItem2 = new OrderItem(22);
        Order order = new Order(10001,customer,orderItem);
        Order order1 = order.addOrder(10002,customer,orderItem2);
        checkPrinter.printCheck(order,pizza,PizzaType.CLOSED,customer,orderItem, ingredients);
        checkPrinter.printCheck(order1,pizza,PizzaType.REGULAR,customer,orderItem2, ingredients);

    }
}