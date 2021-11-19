package homework.pizzeriaPalmetto.storage;

import homework.pizzeriaPalmetto.model.Customer;
import homework.pizzeriaPalmetto.model.Ingredients;
import homework.pizzeriaPalmetto.model.Order;
import homework.pizzeriaPalmetto.model.Pizza;

import java.util.ArrayList;
import java.util.List;

import static homework.pizzeriaPalmetto.storage.CustomerStorage.generateNumber;

public class OrderStorage {

    private List<Order> orderList = new ArrayList<>();
    private CustomerStorage customerStorage = new CustomerStorage();


    public void addOrder(Order order) {
        int generatedNumber = generateNumber();
        for (Order orderInList : orderList) {
            if (orderInList.getOrderNumber() == generatedNumber) {
                break;
            }
            order.setOrderNumber(generatedNumber);
            orderList.add(order);
        }
    }


    public Order getByCustomerNumber(int number) {
        Customer customer = customerStorage.getByNumber(number);
        for (Order order : orderList) {
            if (order.getCustomer().equals(customer))
                return order;
        }
        return null;
    }













}
