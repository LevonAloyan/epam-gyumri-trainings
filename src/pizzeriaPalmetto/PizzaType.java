package pizzeriaPalmetto;

public enum PizzaType {
    REGULAR(1.0),
    CLOSED(1.5);

    private final double value;

    PizzaType(double value) {
        this.value = value;
    }

    public double getDouble() {
        return value;
    }
}