package pizzeria;

public class PizzaType {

    private final String type;
    private double price = 1;

    public PizzaType(String type, double delta) {
        this.price = price + delta;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public static PizzaType getRegularType() {
        return new PizzaType("Regular", 0);
    }

    public static PizzaType getCalzoneType() {
        return new PizzaType("Calzone", 0.5);
    }
}
