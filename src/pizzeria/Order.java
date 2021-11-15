package pizzeria;
import java.util.List;

public class Order {
    private static int orderId = 10000;
    private static int customerId = 0;
    private List<Pizza> items;

    public Order() {
        orderId++;
        customerId++;
    }

    public Order(List<Pizza> items) {
        this.items = items;
        orderId++;
        customerId++;
    }

    public List<Pizza> getItems() {
        return items;
    }

    public static int getOrderId() {
        return orderId;
    }

    public static int getCustomerId() {
        return customerId;
    }

    public void setItems(List<Pizza> items) {
        this.items = items;
    }

    public void displayPizzaAttributes(Pizza pizza) {
        System.out.println("[" + orderId + ": " + customerId + ": " +
                pizza.getName() + ": " + pizza.getQuantity() + "]");
    }

}
