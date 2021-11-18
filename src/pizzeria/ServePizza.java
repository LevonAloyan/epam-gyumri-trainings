package pizzeria;

import java.util.Random;

public class ServePizza {

    public static void main(String[] args){
        Customer customer = Customer.addCustomer("Ani", "55-45-45-45");

        Pizza napoli = Pizza.makePizza(getValidPizzaName("napoli", customer),
                PizzaType.getCalzoneType(), Ingredient.getBacon(),
                Ingredient.getCheese(), Ingredient.getSalami(), Ingredient.getCorn());

        Pizza any = Pizza.makePizza(getValidPizzaName(" ", customer),
                PizzaType.getRegularType(), Ingredient.getPepperoni(),
                Ingredient.getCheese(), Ingredient.getTomatoPaste());

        OrderItem order1 = OrderItem.addOrderItem(napoli, 2);
        OrderItem order2 = OrderItem.addOrderItem(any, 1);

//        Order.addOrder(customer,order1, order2);

        CheckPrinter.printCheck(Order.addOrder(customer, order1, order2));
    }

        public static String getValidPizzaName(String pizzaName, Customer customer){
            if((pizzaName.length() >= 4 && pizzaName.length() <= 20) && pizzaName.matches("\\w+")) {
                return pizzaName;
            }
            return customer.getName() + "_" + Order.orderNumber;
        }
}
