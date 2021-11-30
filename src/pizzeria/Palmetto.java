package pizzeria;

class Palmetto {
    public static void main(String[] args) {
        Customer customer = new Customer(7717, "Margarita");
        PizzaType pizzaType = new PizzaType("Calzone", 1.5);
        Pizza pizza = new Pizza("Margarita", pizzaType);
        pizza.addIngredients(Ingredient.getTomatoPaste());
        pizza.addIngredients(Ingredient.getPepperoni());
        pizza.addIngredients(Ingredient.getGarlic());
        pizza.addIngredients(Ingredient.getBacon());
        OrderItem orderItem =  OrderItem.addItem(pizza, 1);
        Order order = new Order();
        Invoice invoice = new Invoice();
        invoice.printCheck(order, pizza, pizzaType, orderItem);


    }
}
