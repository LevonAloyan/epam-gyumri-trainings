package homework.pizzeriaPalmetto;

import homework.pizzeriaPalmetto.model.Order;
import homework.pizzeriaPalmetto.model.Pizza;
import homework.pizzeriaPalmetto.storage.OrderStorage;
import homework.pizzeriaPalmetto.storage.PizzaStorage;

import java.util.List;

public class Main {
    private static OrderStorage orderStorage = new OrderStorage();
    private static PizzaStorage pizzaStorage = new PizzaStorage();

    public static void main(String[] args) {

        Order orderNumber = orderStorage.getByCustomerNumber(7717);
        Pizza margarita = pizzaStorage.addMargarita();
        margarita.setQuantity(2);
        List<Pizza> pizzaList = orderNumber.getPizzas();
        pizzaList.add(margarita);

    }
}