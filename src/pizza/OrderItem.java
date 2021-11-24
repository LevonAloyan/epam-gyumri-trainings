package pizza;

public class OrderItem {
    private Pizza pizza;
    private int count;

    public OrderItem(Pizza pizza, int count) {
        this.count = count;
        this.pizza = pizza;
    }

    public int getCount() {
        return count;
    }

    public Pizza getPizza() {
        return pizza;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "pizza=" + pizza +
                ", count=" + count +
                '}';
    }
}
