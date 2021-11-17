package pizzeria;

import pizzeria.repository.OrderRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderPizza {
    private final OrderRepository orderRepository;

    public OrderPizza() {
        this.orderRepository = new OrderRepository();
    }

    private String checkName(String name, int index) {
        if (name.length() <= 20 && name.length() >= 4) {
            return name;
        } else {
            return "client name" + index;
        }
    }

    private void addIngredient(Pizza pizza, Pizza.Ingredient ingredient) {
        if (pizza.getIngredients().size() == 7) {
            System.out.println(pizza.getName() + " Ingredients are full");
        } else if (pizza.getIngredients().contains(ingredient)) {
            System.out.println(ingredient + " is ready for " + pizza.getName());
        } else {
            pizza.getIngredients().add(ingredient);
        }
    }

    private void createOrder(Order orderDto) {
        Order order = new Order();
        order.setTime(LocalDateTime.now());
        order.setClientNum(orderDto.getClientNum());
        List<Pizza> pizzaList = new ArrayList<>();
        int index = 1;
        for (Pizza pizzas : orderDto.getPizzas()) {
            Pizza pizza = new Pizza();
            pizza.setOrderType(pizzas.getType());
            pizza.setName(checkName(pizzas.getName(), index++));
            pizza.setQuantity(pizzas.getQuantity());
            for (Pizza.Ingredient ingredient : pizzas.getIngredients()) {
                addIngredient(pizza, ingredient);
            }
            pizzaList.add(pizza);
        }
        order.setPizzas(pizzaList);
        orderRepository.save(order);
    }

    private void printCheck() {
        List<Order> orders = orderRepository.getAll();
        for (Order order : orders) {
            System.out.println("Order: " + order.getOrderNum());
            System.out.println("Client: " + order.getClientNum());
            double totalPrice = 0;
            for (Pizza pizza : order.getPizzas()) {
                double price = 0;
                price += pizza.getQuantity() * pizza.getPrice();
                System.out.println("Name: " + pizza.getName());
                System.out.println("---------------------------------------------");
                for (Pizza.Ingredient ingredient : pizza.getIngredients()) {
                    System.out.println(ingredient.getIngredientName() + " " + ingredient.getPrice() + " €");
                    price += ingredient.getPrice();
                }
                System.out.println("---------------------------------------------");
                System.out.println("Price: " + price + " €");
                System.out.println("Quantity: " + pizza.getQuantity());
                System.out.println("---------------------------------------------");
                totalPrice += price;
            }

            System.out.println("TotalPrice: " + totalPrice + " €");
        }
    }

    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.createOrder(new Order(15,
                Arrays.asList(new Pizza("Eliza", 20, Pizza.PizzaType.CLOSED,
                                Arrays.asList(Pizza.Ingredient.CHEESE, Pizza.Ingredient.PEPPERONI, Pizza.Ingredient.GARLIC)),
                        new Pizza("some pizza", 12, Pizza.PizzaType.REGULAR,
                                List.of(Pizza.Ingredient.BACON)))));
        orderPizza.printCheck();
    }
}