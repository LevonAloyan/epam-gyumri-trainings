package pizza;

public class OrderItem {
    private Pizza pizza;
    private int count;

    public OrderItem(Pizza pizza, int count) {
        this.count = count;
        this.pizza = pizza;
    }

    public Pizza getPizza() {
        return pizza;
    }
}
