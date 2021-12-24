package pizzeria;

import pizzeria.order.Order;
import pizzeria.order.OrderItem;
import pizzeria.pizza.Pizza;
import pizzeria.pizza.PizzaType;

class Palmetto {
    public static void main(String[] args) {
        PizzaType pizzaType = new PizzaType("Calzone", 1.5);
        Pizza pizza = new Pizza("Margarita", pizzaType);
        OrderItem orderItem = OrderItem.addItem(pizza, 2);
        pizza.addIngredients(Ingredient.getTomatoPaste());
        pizza.addIngredients(Ingredient.getPepperoni());
        pizza.addIngredients(Ingredient.getGarlic());
        pizza.addIngredients(Ingredient.getBacon());
        PizzaType pizzaType1 = new PizzaType("Regular", 1);
        Pizza pizza1 = new Pizza("PepperoniOro", pizzaType1);
        OrderItem orderItem1 = OrderItem.addItem(pizza1, 1);
        pizza1.addIngredients(Ingredient.getPepperoni());
        pizza1.addIngredients(Ingredient.getOlives());
        pizza1.addIngredients(Ingredient.getCheese());
        Order order = new Order(10001, 7717, new OrderItem[]{orderItem, orderItem1});
        order.displayAttributes(pizza, orderItem);
        order.displayAttributes(pizza1, orderItem1);
        Invoice invoice = new Invoice();
        invoice.printCheck(order, pizza);
    }
}
