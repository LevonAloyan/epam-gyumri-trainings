package homework.pizzeriaPalmetto.model;

import java.util.List;

public class Order {

    private int orderNumber;

    private Customer customer;

    private List<Pizza> pizzas;

    public Order(int orderNumber, Customer customer, List<Pizza> pizzas) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.pizzas = pizzas;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", customer=" + customer +
                ", pizzas=" + pizzas +
                '}';
    }
}
