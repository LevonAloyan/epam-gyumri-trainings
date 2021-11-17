package pizzeria;

public class PizzaType {

    private final String type;
    private final double price;

    public PizzaType(String type, double price) {
        this.price = price;
        this.type = type;
    }

    public PizzaType(String type) {
        this.type = type;
        if (type.equals("Regular")) {
            this.price = 1;
        } else {
            this.price = 1.5;
        }
    }

    public double getPrice() {
        return price;
    }

    public static PizzaType getRegularType() {
        return new PizzaType("Regular", 1);
    }

    public static PizzaType getCalzone() {
        return new PizzaType("Calzone", 1.5);
    }

    public String getType() {
        return type;
    }
}